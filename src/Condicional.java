public class Condicional {
    public static void main(String[] args) {
        int ano = 2020;
        boolean incluido = true;
        double nota = 8.1;
        String tipoPlano = "Plus";

        if (ano >= 2024) {
            System.out.println("Lançamentos novos");
        } else {
            System.out.println("Filmes antigos");
        }

        if (incluido && tipoPlano.equals("Plus")) {
            System.out.println("Voce pode assistir de graça");
        } else {
            System.out.println("Voce tem que pagar");
        }
    }
}
