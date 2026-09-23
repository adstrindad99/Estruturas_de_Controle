package devdojocurso.logicadeprogramacao.estruturascondicionais.ifelse;

public class DescontoEstudantil {
    public static void main(String[] args) {
        int idade = 24;
        boolean carteiraDeEstudante = false;

        if (idade < 18 && carteiraDeEstudante) {
            System.out.println("Menor de idade e possui carteira de estudante!");
            System.out.println("Tem direito a desconto de estudante!");
        } else if (idade < 18) {
            System.out.println("Menor de idade e não possui carteira de estudante!");
            System.out.println("Não tem direito a desconto de estudante!");
        } else {
            System.out.println("Maior de idade!");
        }
    }
}