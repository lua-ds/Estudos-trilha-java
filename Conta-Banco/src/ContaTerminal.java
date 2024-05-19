import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite a sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da agência:");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu lado:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero + " e seu saldo R$:" + saldo +" já está disponível para saque");



    }
}
