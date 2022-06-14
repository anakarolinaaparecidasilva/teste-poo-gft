import java.util.Scanner;

public class Caracteristicas {
    public static void main(String[] args) {
        System.out.println("Digite abaixo as idades das 5 pessoas: ");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa 1: ");
        int idade1 = scan1.nextInt();
        System.out.println("Digite a idade da pessoa 2: ");
        int idade2 = scan1.nextInt();
        System.out.println("Digite a idade da pessoa 3: ");
        int idade3 = scan1.nextInt();
        System.out.println("Digite a idade da pessoa 4: ");
        int idade4 = scan1.nextInt();
        System.out.println("Digite a idade da pessoa 5: ");
        int idade5 = scan1.nextInt();



        System.out.println("Digite abaixo o peso das 5 pessoas: ");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa 1: ");
        int peso1 = scan2.nextInt();
        System.out.println("Digite o peso da pessoa 2: ");
        int peso2 = scan2.nextInt();
        System.out.println("Digite o peso da pessoa 3: ");
        int peso3 = scan2.nextInt();
        System.out.println("Digite o peso da pessoa 4: ");
        int peso4 = scan2.nextInt();
        System.out.println("Digite o peso da pessoa 5: ");
        int peso5 = scan2.nextInt();

        System.out.println("Digite abaixo a altura das 5 pessoas: ");
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Digite a altura da pessoa 1: ");
        double altura1 = scan3.nextDouble();
        System.out.println("Digite a altura da pessoa 2: ");
        double altura2 = scan3.nextDouble();
        System.out.println("Digite a altura da pessoa 3: ");
        double altura3 = scan3.nextDouble();
        System.out.println("Digite a altura da pessoa 4: ");
        double altura4 = scan3.nextDouble();
        System.out.println("Digite a altura da pessoa 5: ");
        double altura5 = scan3.nextDouble();


        System.out.println("A média das idades das 5 pessoas é: " + (idade1 + idade2 + idade3 + idade4 + idade5) / 5);

        // Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50

        // porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90


    }

}


