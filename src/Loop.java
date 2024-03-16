import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua nota para o seu filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota / 3;
            System.out.println("Sua nota para esse filme foi de: " + nota);
        }

        System.out.printf("A média de avaliações para esse filme foi de: %.2f", mediaAvaliacao);
    }
}
