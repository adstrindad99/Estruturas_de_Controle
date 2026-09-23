package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ClassificacaoEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 18) {
            System.out.println(nome + " tem " + idade + " anos de idade e participará da categoria: Adulto.");
        } else if (idade > 13) {
            System.out.println(nome + " tem " + idade + " anos de idade e participará da categoria: Juvenil.");
        } else {
            System.out.println(nome + " tem " + idade + " anos de idade e participará da categoria: Infantil.");
        }
    }
}