package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira unidade: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda unidade: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota da terceira unidade: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Sua média foi " + media + " e você foi APROVADO!");
        } else if (media >=5 && media < 6.9) {
            System.out.println("Sua média foi " + media + " e você foi em RECUPERAÇÂO!");
        } else {
            System.out.println("Sua média foi " + media + " e você foi foi REPROVADO!");
        }
    }
}