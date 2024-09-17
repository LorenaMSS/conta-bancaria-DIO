import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        int numero;
        String agencia;
        double saldo;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Por favor, digite o seu Nome");
            nomeCliente = in.nextLine();
            System.out.println("Por favor, digite o número da Agência");
            agencia = in.nextLine();
            System.out.println("Por favor, digite o número da Conta");
            numero = in.nextInt();
            System.out.println("Por favor, digite seu saldo");
            saldo = in.nextDouble();
        }

        System.out.print(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque\"", nomeCliente, agencia, numero, saldo));


    }
}
