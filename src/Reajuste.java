import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario = 0.2f;
        double reajuste = 0.2f;


        System.out.println("Salário: ");
        salario = scan.nextDouble();

        if (salario > 280) {
            salario = salario * 0.20;

            System.out.println(" Salário com reajuste: " + salario);

        }

        if (salario > 280 && salario < 700) {
            salario = salario * 0.15;

            System.out.println(" Salário com reajuste: " + salario);

        }

        if (salario > 700 && salario < 1500) {
            salario = salario * 0.10;

            System.out.println(" Salário com reajuste: " + salario);
        }

        if (salario >  1500) {
            salario = salario * 0.05;

            System.out.println(" Salário com reajuste: " + salario);
        }

    }
}


