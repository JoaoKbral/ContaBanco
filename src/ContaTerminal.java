import java.math.BigDecimal;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Conta conta = new Conta();
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da número da conta!");
        conta.setNumero(Integer.parseInt(scan.nextLine()));

        System.out.println("Por favor, digite o número da agência!");
        conta.setAgencia((scan.nextLine()));
        
        System.out.println("Por favor, digite o nome do cliente!");
        conta.setNomeCliente(scan.nextLine());
        
        System.out.println("Por favor, digite o saldo!");
        conta.setSaldo(new BigDecimal(scan.nextLine()));

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
         conta.getNomeCliente(),conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        scan.close();
    }
}
