package devdojocurso.logicadeprogramacao.lacosderepeticao.fors;

import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite seu nome: ");
            String nomeAluno = scanner.nextLine();

            System.out.print("Digite a sua primeira nota: ");
            double primeiraNota = scanner.nextDouble();

            System.out.print("Digite a sua segunda nota: ");
            double segundaNota = scanner.nextDouble();
            scanner.nextLine();

            double mediaNotas = (primeiraNota + segundaNota) / 2;

            if (mediaNotas >= 7) {
                System.out.println("Aprovado!");
                System.out.println("_______________________________________________");
                alunosAprovados++;
            } else {
                System.out.println("Reprovado!");
                System.out.println("_______________________________________________");
            }
        }
        System.out.println("Dos 3 alunos, " + alunosAprovados + " foram aprovados!");
        scanner.close();
    }
}