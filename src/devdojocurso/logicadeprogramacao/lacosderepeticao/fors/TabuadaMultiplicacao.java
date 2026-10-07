package devdojocurso.logicadeprogramacao.lacosderepeticao.fors;

import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int multiplicao = 0;

        for (int i = 1; i <= 10; i++) {
            multiplicao = n * i;
            System.out.printf("%d * %d = %d\n", n, i, multiplicao);
        }
        scanner.close();
    }
}