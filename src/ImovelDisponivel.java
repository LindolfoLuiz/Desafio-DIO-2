import java.util.Scanner;

public class ImovelDisponivel{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        // Verifica se o carro está acima da velocidade
        if (velocidade > 80) {
            multas++;
        }

        // Verifica se o motorista recebeu pontos na carteira
        if (multas >= 3) {
            System.out.println(multas + " multas. Levou pontos na carteira");
        } else {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}
