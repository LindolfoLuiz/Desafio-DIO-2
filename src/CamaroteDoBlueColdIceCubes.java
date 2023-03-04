import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoFila = leitor.nextInt();
        int numPessoasCamarote = 0;

        for (int i = 1; i <= tamanhoFila; i++) {
            if (i % 2 != 0) { // verifica se o número é ímpar
                numPessoasCamarote++;
            }
        }

        System.out.println(numPessoasCamarote + " pessoas no camarote");
    }
}
