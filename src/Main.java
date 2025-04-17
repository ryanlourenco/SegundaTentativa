import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        public static void main(String[] args) {

                //Exercicio 03
                class Contato {
                    private String nome;
                    private String telefone;

                    public Contato(String nome, String telefone) {
                        this.nome = nome;
                        this.telefone = telefone;
                    }

                    public Contato(int i, String nome, int numero) {
                    }

                    public String getNome() {
                        return nome;
                    }

                    public String getTelefone() {
                        return telefone;
                    }

                    @Override
                    public String toString() {
                        return "Nome: " + nome + ", Telefone: " + telefone;
                    }
                }


                Scanner scanner = new Scanner(System.in);
                ArrayList<Contato> contatos = new ArrayList<>();
                int proximo = 1;



                while (true) {
                    System.out.println("\n1. Adicionar um novo contato");
                    System.out.println("2. Buscar telefone por nome");
                    System.out.println("3. Listar todos o contatos");
                    System.out.println("4. Sair");
                    System.out.println("5. Remover contato");
                    System.out.print("Escolha uma opção: ");

                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.print("Nome do contato: ");
                            String nome = scanner.nextLine();
                            System.out.print("telefone do cidadão: ");
                            int numero = scanner.nextInt();
                            scanner.nextLine();
                            contatos.add(new Contato(proximo++, nome, numero));
                            System.out.println("Contato salvo com sucesso!");
                            break;

                        case 2:
                            System.out.print("Digite o nome do contato: ");
                            String buscaNome = scanner.nextLine();
                            boolean encontrado = false;
                            for (Contato contato : contatos) {
                                if (contato.getNome().equalsIgnoreCase(buscaNome)) {
                                    System.out.println("Telefone: " + contato.getTelefone());
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Contato não encontrado.");
                            }
                            break;

                        case 3:
                            System.out.println("\nLista de contatos:");
                            for (Contato contato : contatos) {
                                System.out.println(contato);
                            }
                            break;

                        case 4:
                            System.out.print("Digite o nome do contato a ser removido: ");
                            String nomeRemover = scanner.nextLine();
                            contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nomeRemover));
                            System.out.println("Contato removido (se existia).");
                            break;

                        case 5:
                            System.out.println("Saindo...");
                            scanner.close();
                            return;

                        default:
                            System.out.println("Opção inválida, tente novamente.");
                    }
                }
            }
        }
    }
}