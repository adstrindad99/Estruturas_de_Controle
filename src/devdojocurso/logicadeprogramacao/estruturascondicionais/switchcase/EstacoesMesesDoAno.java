package devdojocurso.logicadeprogramacao.estruturascondicionais.switchcase;

import java.util.Scanner;

public class EstacoesMesesDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 12 representando o mês do ano: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Mês: Janeiro | Estação: Verão");
                break;
            case 2:
                System.out.println("Mês: Fevereiro | Estação: Verão");
                break;
            case 3:
                System.out.println("Mês: Março | Estação: Outono");
                break;
            case 4:
                System.out.println("Mês: Abril | Estação: Outono");
                break;
            case 5:
                System.out.println("Mês: Maio | Estação: Outono");
                break;
            case 6:
                System.out.println("Mês: Junho | Estação: Inverno");
                break;
            case 7:
                System.out.println("Mês: Julho | Estação: Inverno");
                break;
            case 8:
                System.out.println("Mês: Agosto | Estação: Inverno");
                break;
            case 9:
                System.out.println("Mês: Setembro | Estação: Primavera");
                break;
            case 10:
                System.out.println("Mês: Outubro | Estação: Primavera");
                break;
            case 11:
                System.out.println("Mês: Novembro | Estação: Primavera");
                break;
            case 12:
                System.out.println("Mês: Dezembro | Estação: Verão");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}