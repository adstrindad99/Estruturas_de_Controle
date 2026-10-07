package devdojocurso.logicadeprogramacao.lacosderepeticao.fors;

import java.util.Scanner;

public class LojaDeIngressos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ingressoInfantil = 0;
        int ingressoMeiaEntrada = 0;
        int ingressoInteira = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();

            if (idade <= 12) {
                System.out.println("Tipo do ingresso: Infantil");
                System.out.println("______________________________________________");
                ingressoInfantil++;
            } else if ((idade >= 13 && idade <= 17) || idade >= 60) {
                System.out.println("Tipo do ingresso: Meia-entrada");
                System.out.println("______________________________________________");
                ingressoMeiaEntrada++;
            } else {
                System.out.println("Tipo do ingresso: Inteira");
                System.out.println("______________________________________________");
                ingressoInteira++;
            }
        }
        System.out.printf("Quantidade de ingressos vendidos: \n Infantil: %d \n Meia-entrada: %d \n Inteira: %d",
                ingressoInfantil, ingressoMeiaEntrada, ingressoInteira);
        scanner.close();
    }
}