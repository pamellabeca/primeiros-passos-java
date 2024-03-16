import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Pesquise o nome do seu filme");
        String filme = leitura.nextLine();
        System.out.println("Não encontramos nenhum título de nome: " + filme);

        System.out.println("Digite o ano do seu filme");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("O ano desse filme foi de: " + anoDeLancamento);

        System.out.println("Digite sua nota para o seu filme");
        double nota = leitura.nextDouble();
        System.out.println("Sua nota para esse filme foi de: " + nota);
    }
}
