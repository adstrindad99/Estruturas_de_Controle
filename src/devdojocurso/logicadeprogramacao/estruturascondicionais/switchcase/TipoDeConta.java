package devdojocurso.logicadeprogramacao.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Abertura de conta---");
        System.out.println("1: Conta poupança.");
        System.out.println("2: Conta corrente.");
        System.out.println("3: Conta de investimentos.");
        System.out.print("Digite o numero correspondente a conta desejada: ");
        int conta = scanner.nextInt();

        switch (conta) {
            case 1:
                System.out.println("Conta poupança: Juros de 0.05%");
                break;
            case 2:
                System.out.println("Conta corrente: Juros de 0.02%");
                break;
            case 3:
                System.out.println("Conta de investimentos: Juros de 0.1%");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}