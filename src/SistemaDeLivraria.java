
import java.util.Scanner;

public class SistemaDeLivraria {
    public static void main(String[] args) {
        boolean confirma = true;
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        do{
            System.out.println("BEM VINDO A NOSSA BIBLIOTECA!!!!!");
            System.out.println("DESEJA VER OS LIVROS DISPONÍVEIS");
            String operacao = scanner.nextLine().toLowerCase();

            if(operacao.equals("sim")){
                biblioteca.listarLivrosDisponiveis();
                System.out.println("Deseja escolher algum livro? Se sim, digite o ID dele:");
                int idLivro = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Escreva seu nome para registro: ");
                String nomeCliente = scanner.nextLine();

                biblioteca.realizarEmprestimo(idLivro, nomeCliente);

            }else if(operacao.equals("nao")){
                System.out.println("A BIBLIOTECA AGRADECE SUA VISITA! ATÉ A PRÓXIMA");
                confirma = false;
            }

        } while (confirma);
    }
}
