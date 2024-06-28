import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Atributos
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = " ";
        String nomeCliente = " ";
        double saldo = 0.0;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();

        scanner.close();

        // Exibir a mensagem conta criada
        System.out.println(
                "Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo é " + saldo + "já está disponível para saque.");
    }
}
