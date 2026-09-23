package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class ImpressaoDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int quatidadeDePares = 0;

        while (contador <= numero) {
            if (contador % 2 == 0){
                System.out.println(contador);
                quatidadeDePares++;
            }
            contador++;
        }
        System.out.println("A quantidade de números pares encontrados foi de: " + quatidadeDePares);
        scanner.close();
    }
}