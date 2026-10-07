package devdojocurso.logicadeprogramacao.lacosderepeticao.fors;

import java.util.Scanner;

public class SomaDosMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (numero % 2 == 0) {
            soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
