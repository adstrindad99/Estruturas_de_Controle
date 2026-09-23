package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

import java.util.Scanner;
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nomeDeUsuario = scanner.nextLine();

        if (nomeDeUsuario.equals("") || nomeDeUsuario.equalsIgnoreCase("administrador")
                || nomeDeUsuario.equalsIgnoreCase("admin")) {
            System.out.println("Usuário inválido, tente novamente!");
        } else {
            System.out.println(nomeDeUsuario + " cadastrado com sucesso!");
        }
        scanner.close();
    }
}