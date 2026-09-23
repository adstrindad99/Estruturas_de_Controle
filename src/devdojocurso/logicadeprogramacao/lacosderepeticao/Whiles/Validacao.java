package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.println("Opção inválida.");
            System.out.println("_________________________________");
            System.out.print("Digite um número de 1 a 10: ");
            numero = scanner.nextInt();
        }
        System.out.println("Número válido: " + numero);
        scanner.close();
    }
}