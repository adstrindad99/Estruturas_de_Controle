package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int soma = 0;

        while (contador <= numero) {
            soma = soma + contador++;
        }
        System.out.println("O resultado final da soma é: " + soma);
        scanner.close();
    }
}