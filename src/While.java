import java.util.Scanner;

public class While {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            double media = 0;
            double nota = 0;
            int contador = 0;

            while (nota != -1) {
                System.out.println("Qual avaliaçao para esse filme de 0 a 10");
                nota = leitura.nextDouble();
                if (nota != -1) {
                    media += nota;
                    contador ++;
                }
            }

        System.out.println("Media de avaliacao: " + media / contador);
    }
}