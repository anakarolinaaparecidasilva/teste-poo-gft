import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Aniversario {
    public static void main(String[] args) {
        System.out.println("Digite a data de nascimento abaixo: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if (dia <= 31 && mes <= 12 && ano <= 2000) {
            System.out.println("Data válida!");
        } else if (false) {
            System.out.println("A data é inválida!");

        }


        // Diga se a data é válida ou não

        //Caso não, diga o motivo.

        // todos meses tem 31 dias e que estamos no ano de 2000.

        // Caso a data eseja correta, imprima Data válida.


    }
}
