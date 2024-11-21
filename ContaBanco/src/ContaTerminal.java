import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o numero da sua conta: ");
        int numConta = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", o numero da sua conta é " + numConta + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}