import java.util.Scanner;

public class IdadePessoa {
	
	public static void main(String[]args) {
		
		// Criando um novo objeto
		Scanner scanner =  new Scanner(System.in); // é passado como argumento, que é um objeto
		
		// Este é um método que lê a próxima entrada de número inteiro que o usuário
		// digita e retorna 
		System.out.print("Digite a quantidade de anos: ");
		// solicita ao usuário que imprima na tela a quantidade de anos 
		int anos = scanner.nextInt();
		
		// Este é um método que lê a próxima entrada de número inteiro que o usuário
		// digita e retorna para meses e anos 
		System.out.print("Digite a quantidade de meses: ");
		// solicita ao usuário que imprima na tela a quantidade de meses
		int meses = scanner.nextInt();
		
		
		System.out.println("Digite a quantidade de dias: ");
		// solicita ao usuário que imprima na tela a quantidade de dias
		int dias = scanner.nextInt();
		
		int diasTotais = idadeDias(anos, meses, dias);
			System.out.println("A sua idade expressa em dias é: "+ diasTotais);
			// solicita ao usuário a sua idade expressa em dias 
	}
	public static int idadeDias(int anos, int meses, int dias) {
		final int DIAS_POR_ANOS = 365;
		final int DIAS_POR_MES = 30;
		return anos * DIAS_POR_ANOS + meses * DIAS_POR_MES + dias;
	}
}
