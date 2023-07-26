import java.util.Scanner;

public class SalMinimo {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do salário mínimo: ");
		double salarioMinimo = scanner.nextDouble();
		
		System.out.print("Informe o valor do salário do usuário: ");
	    double salarioUsuario = scanner.nextDouble();
	    
	    double quantSalarioMinimo =  salarioUsuario / salarioMinimo;
	    System.out.printf("A quantidade de salários minimos que esse usuário ganha é: %.2f%n",quantSalarioMinimo);
	}

}
