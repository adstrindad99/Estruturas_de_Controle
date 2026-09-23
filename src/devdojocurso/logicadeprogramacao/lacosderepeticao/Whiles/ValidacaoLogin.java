package devdojocurso.logicadeprogramacao.lacosderepeticao.Whiles;

import java.util.Scanner;

public class ValidacaoLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String validacaoUsuario = "admin";
        final String validacaoSenha = "admin";

        boolean exibirTela = true;

        while (exibirTela) {
            System.out.print("Digite seu usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (usuario.equalsIgnoreCase(validacaoUsuario) && senha.equals(validacaoSenha)) {
                System.out.println("Acesso concedido!");
                exibirTela = false;
            } else {
                System.out.println("Acesso negado, tente novamente!");
                System.out.println("____________________________________________________________");
            }
        }
        scanner.close();
        System.out.println("---------------------------------Seja bem vindo---------------------------------");
    }
}