import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String numeroAgencia;
        String nomeCliente=null;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        numeroAgencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite seu Nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o valor do seu deposito inicial: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
