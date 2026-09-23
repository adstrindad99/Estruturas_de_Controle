package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("---------------------MENU---------------------");
            System.out.println("1: Calcular imposto.");
            System.out.println("2: Depositar sálario.");
            System.out.println("3: Sair.");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
        }
        scanner.close();
    }
}