package devdojocurso.logicadeprogramacao.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            scanner.nextLine();
        System.out.print("Digite o operador desejado: ");
        String operador = scanner.nextLine();

        switch (operador){
            case "-":
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
                break;
            case "+":
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
                break;
            case "*":
                System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2));
                break;
            case "/":
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2));
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}