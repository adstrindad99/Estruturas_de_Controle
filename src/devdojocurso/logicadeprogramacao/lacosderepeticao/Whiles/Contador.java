package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número desejado: ");
        int contador = scanner.nextInt();

        while (contador >= 1){
            System.out.println(contador);
            contador--;
        }
        System.out.println("Fim.");
        scanner.close();
    }
}