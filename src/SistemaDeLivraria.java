import java.util.Locale;
import java.util.Scanner;

public class SistemaDeLivraria {
    public static void main(String[] args) {
        boolean confirma = true;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("BEM VINDO A NOSSA BIBLIOTECA!!!!!");
            System.out.println("DESEJA VER OS LIVROS DISPONÍVEIS");
            String operacao = scanner.nextLine().toLowerCase();

            if(operacao == "sim"){


            }else if(operacao == "nao"){
                System.out.println("A BIBLIOTECA AGRADECE SUA VISITA! ATÉ A PRÓXIMA");
                confirma = false;
            }

        } while (confirma);
    }
}
