import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, qual é o seu nome?");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, "+ nomeCliente +" digite o núrmero da sua agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, "+ nomeCliente +" digite o núrmero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println(nomeCliente +" quanto deseja depositar?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
