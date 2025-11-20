package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String primeiroNome = scanner.next();
        System.out.printf("Seja bem-vindo(a), %s.\n", primeiroNome);
        System.out.println("Vamos verificar a sua média salarial trimestral e sua classificação de renda...");

        System.out.print("Informe o salário recebido em Janeiro: ");
        double salarioJaneiro = scanner.nextDouble();

        System.out.print("Informe o salário recebido em Fevereiro: ");
        double salarioFevereiro = scanner.nextDouble();

        System.out.print("Informe o salário recebido em Março: ");
        double salarioMarco = scanner.nextDouble();

        double mediaSalarial = (salarioJaneiro + salarioFevereiro + salarioMarco) / 3;
        String classificacaoRenda;

        if (mediaSalarial >= 6072) {
            classificacaoRenda = "A";
        } else if (mediaSalarial >= 4554) {
            classificacaoRenda = "B";
        } else if (mediaSalarial >= 3036) {
            classificacaoRenda = "C";
        } else {
            classificacaoRenda = "D";
        }
        System.out.printf("%s, sua média salarial no trimestre foi: R$ %.2f%nSua classificação de renda é: %s\n",
                primeiroNome, mediaSalarial, classificacaoRenda
        );

        scanner.close();
    }
}