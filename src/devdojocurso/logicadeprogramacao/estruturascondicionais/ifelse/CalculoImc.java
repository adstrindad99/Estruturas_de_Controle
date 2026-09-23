package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Seu IMC é " + imc + ", sua classificação é: Abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Seu IMC é " + imc + ", sua classificação é: Peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Seu IMC é " + imc + ", sua classificação é: Sobrepeso.");
        } else {
            System.out.println("Seu IMC é " + imc + ", sua classificação é: Obesidade.");
        }
        scanner.close();
    }
}