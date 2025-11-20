package exercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int anoAtual = LocalDate.now().getYear();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu primeiro nome: ");
        String primeiroNome = scanner.next();

        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        String classificacaoEtaria = "";
        if (idade > 60){
            classificacaoEtaria = "Idoso";
        } else if ((idade <= 59) && (idade >= 18)) {
            classificacaoEtaria = "Adulto";
        } else if ((idade <= 17) && (idade >= 13)) {
            classificacaoEtaria = "Adolescente";
        } else {
            classificacaoEtaria = "Criança";
        }
        System.out.printf("%s, você tem %d de idade e sua classificação etaria é %s.", primeiroNome, idade,
                classificacaoEtaria);

        scanner.close();
        }
    }