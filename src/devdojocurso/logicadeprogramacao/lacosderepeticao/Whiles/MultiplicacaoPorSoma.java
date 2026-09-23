package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class MultiplicacaoPorSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int base = scanner.nextInt();
        System.out.print("Digite um número: ");
        int multiplicador = scanner.nextInt();

        int i = 1;
        int resultado = 0;

        while (i <= 4){
            resultado = base + base;
            i++;
        }
        System.out.println(resultado);
    }
}
