import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Digite sua nota para o seu filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas ++;
                System.out.println("Sua nota para esse filme foi de: " + nota);
            } else {
                System.out.println("Encerrando o processo e calculando a média!");
            }
        }
        mediaAvaliacao = mediaAvaliacao/totalDeNotas;
        System.out.printf("A média de avaliações para esse filme foi de: %.2f", mediaAvaliacao);
    }}
