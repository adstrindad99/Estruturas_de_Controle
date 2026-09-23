package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        double  ladoTrianguloA = 9;
        double  ladoTrianguloB = 2;
        double  ladoTrianguloC = 8;

        if (ladoTrianguloA + ladoTrianguloB > ladoTrianguloC && ladoTrianguloA + ladoTrianguloC > ladoTrianguloB
                && ladoTrianguloB + ladoTrianguloC > ladoTrianguloA) {
            System.out.println("Triângulo válido!");
        } else {
            System.out.println("Triângulo inválido!");
        }

    }
}
