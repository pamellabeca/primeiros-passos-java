public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean inclusoNoPlano =  false;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "normal";

        if(anoDeLancamento <= 2023){
            System.out.println("Esse filme já não é tão recente");
        } else{
            System.out.println("esse filme ainda é recente");
        }

        if (inclusoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        }
        else{
            System.out.println("Precisa pagar aluguel");
        }
    }
}
