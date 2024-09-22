import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Inicialização dos Dados do Cliente:
        String nomeCliente = "Heli Ribeiro";
        String tipoConta = "Corrente";
        double saldoCliente = 59631.13;

        // Impressão dos dados do cliente:
        System.out.println("*********************************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + saldoCliente);
        System.out.println("\n*********************************************");

        // Inicialização do Scanner
        Scanner scanner = new Scanner(System.in);


        int comandoMenu = 0;
        double valorReceber, valorTransferir;
        while (comandoMenu != 4) {

            System.out.println("\nOperações\n");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a operação desejada:");

            comandoMenu = scanner.nextInt();
            switch (comandoMenu){
                case 1 :
                    System.out.printf("O saldo atual da conta é R$ %.2f", saldoCliente);
                    break;
                case 2 :
                    System.out.println("Informe o valor a receber:");
                    valorReceber = scanner.nextDouble();
                    saldoCliente += valorReceber;
                    System.out.printf("Saldo atualizado! O saldo atual é R$ %.2f", saldoCliente);
                    break;
                case 3 :
                    System.out.println("Informe o valor a transferir");
                    valorTransferir = scanner.nextDouble();
                    if (valorTransferir > saldoCliente) {
                        System.out.println("Transferência negada, saldos insuficientes");
                    }
                    else {
                        saldoCliente = saldoCliente - valorTransferir;
                        System.out.println("Transferência realizada! O saldo atual é R$ " + saldoCliente);
                    }
                    break;
                case 4 :
                    System.out.println("\nOperações finalizadas!");
                default:
                    System.out.println("\nOperação inválida, tente novamente.");
            }
        }
    }
}