import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Escolha uma das opções: 1. Média Aritmética; 2. Média Ponderada; 3. Sair");
        System.out.println("Digite a opção desejada: ");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        do {

            if (opcao == 1) {
                System.out.println("Digite a primeira nota: ");
                int nota1 = scan.nextInt();
                System.out.println("Digite a segunda nota: ");
                int nota2 = scan.nextInt();
                System.out.println("A média aritmética é: " + ((nota1 + nota2) / 2));
            }

            if (opcao == 2) {
                System.out.println("Digite a primeira nota: ");
                int nota1 = scan.nextInt();
                System.out.println("Digite o peso da primeira nota: ");
                int peso1 = scan.nextInt();
                System.out.println("Digite a segunda nota: ");
                int nota2 = scan.nextInt();
                System.out.println("Digite o peso da segunda nota: ");
                int peso2 = scan.nextInt();
                System.out.println("Digite a terceira nota: ");
                int nota3 = scan.nextInt();
                System.out.println("Digite o peso da terceira nota: ");
                int peso3 = scan.nextInt();
                System.out.println("A média aritmética é: " + (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / 3)));
            }

            if (opcao == 3) {
                System.out.println("Saindo...");

            } else if (opcao > 3) {
                System.out.println("Essa opção é inválida.");

            }
        } while (false);

    }
}

