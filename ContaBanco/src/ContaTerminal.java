import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int numero;
    String agencia, nomeCliente;
    double saldo;

    System.out.println("Por favor, digite o número da Conta: ");
    numero = Integer.parseInt(sc.nextLine());

    System.out.println("Por favor, digite o número da Agência: ");
    agencia = sc.nextLine();

    System.out.println("Por favor, digite o seu nome: ");
    nomeCliente = sc.nextLine();

    System.out.println("Por favor, digite o seu saldo: ");
    saldo = Double.parseDouble(sc.nextLine());

    sc.close();

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // limpar o console

    System.out.println(
        "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
  }
}
