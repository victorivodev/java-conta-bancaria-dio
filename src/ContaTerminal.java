// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, digite o número da Agência:");
		String agencia = sc.nextLine();
		System.out.println("Digite seu nome:");
		String nomeCliente = sc.nextLine();
		System.out.println("Digie o número da sua conta:");
		int numeroConta = sc.nextInt();
		Double saldo = 237.48;
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
		sc.close();
	}
}