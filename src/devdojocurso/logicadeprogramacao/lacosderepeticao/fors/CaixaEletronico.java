package devdojocurso.logicadeprogramacao.lacosderepeticao.fors;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoBancario = 500;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o valor desejado para o saque: ");
            double valorDigitado = scanner.nextDouble();

            if (valorDigitado <= saldoBancario) {
                saldoBancario = saldoBancario - valorDigitado;
                System.out.println("Saque aprovado.");
                System.out.println("___________________________________________");
            } else {
                System.out.println("Saldo insuficiente.");
                System.out.println("___________________________________________");
            }
        }
        System.out.print("Saldo atual: " + saldoBancario);
        scanner.close();
    }
}