package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = -1;

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par.");
        } else {
            System.out.println("O numero " + numero + " é ímpar.");
        }
        if (numero < 0) {
            System.out.println("O numero " + numero + " é negativo.");
        } else if (numero == 0) {
            System.out.println("O numero " + numero + " é zero.");
        } else {
            System.out.println("O numero " + numero + " é positivo.");
        }
    }
}