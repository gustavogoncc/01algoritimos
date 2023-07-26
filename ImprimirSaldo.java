import java.util.Scanner;

public class ImprimirSaldo {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Informe o seu saldo: ");
		// o usuário é chamado a imprimir na tela o seu saldo disponível
		double saldo = scanner.nextDouble() ;
		// armazena a variável saldo
		
		double saldoReajustado = reajusteSaldo( saldo);
		System.out.printf("O saldo com reajuste de 1%% é: %.2f%n", saldoReajustado);
		// é imprimido na tela o saldo do usuário com reajuste de 1%
		}
	
	public static double reajusteSaldo( double saldo) {
		return saldo * 1.01;
		// a função reajusteSaldo é chamado "saldo" como argumento. 
		// Nela, é retornado o saldo do usuário após o reajuste de 1%
	}
	}
