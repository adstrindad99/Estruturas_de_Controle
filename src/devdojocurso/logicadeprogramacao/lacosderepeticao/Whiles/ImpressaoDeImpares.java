package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class ImpressaoDeImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 0;

        while (contador <= numero) {
            if (contador % 2 != 0) {
                System.out.println(contador);

            }
            contador++;
        }
        scanner.close();
    }
}
