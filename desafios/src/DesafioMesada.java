import java.util.Scanner;

public class DesafioMesada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int resultado;
        resultado = mesada * entrada;

        System.out.println("Você vai ter guardado " + resultado + " reais depois de " + entrada + " mes(es)");
        leitor.close();
    }
}
