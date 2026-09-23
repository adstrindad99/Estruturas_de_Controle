package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ValidacaoAlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha abaixo o sexo e a idade.");
        System.out.print("Masculino(M) ou Feminino(F): ");
        String sexo = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();


        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório.");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento não permitido.");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.print("Alistamento permitido, deseja se alistar? ");
            scanner.nextLine();
        } else {
            System.out.println("Alistamento não permitido.");
        }
        scanner.close();
    }
}