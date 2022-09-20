import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num;
        String agencia, nomeCliente;
        double saldo = 237.48;

        System.out.println("Digite o Número da conta por favor!");
        {
            num = sc.nextInt(); // Number of the Bank Account
        }
        System.out.println("Digite o Nome e Sobrenome por favor!");
        {
            nomeCliente = sc2.nextLine(); //Name of the Client
        }
        System.out.println("Digite a Agência por favor!");
        {
            agencia = sc.next(); // Agency
        }

        System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + num + " e seu saldo " +saldo+ " já está disponível para saque");

    }

}
