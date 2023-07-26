import java.util.Scanner;

public class pecas {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();
		
		System.out.print("Informe o código da peça 1: ");
		int codigo1 = scanner.nextInt();
		
		System.out.print("Informe o valor unitário da peça 1: ");
		double valor1= scanner.nextDouble();
		
		System.out.print("Informe a quantidade de peças 1 que deseja: ");
		int quant1 = scanner.nextInt();
		
		System.out.print("Informe o código da peça 2: ");
		int codigo2 = scanner.nextInt();
		
		System.out.print("Informe o valor unitário da peça 2: ");
		double valor2 = scanner.nextDouble();
		
		System.out.print("Informe a quantidade de peças 2 que deseja");
		int quant2 = scanner.nextInt();
		
		double valorTotal = calcularValor(ipi,valor1,quant1,valor2,quant2);
		System.out.printf("O valor total a ser pago é: %.2f%n",valorTotal);
	
	}
	
	public static double calcularValor(double ipi, double valor1, int quant1, double valor2, int quant2){
	
		return(valor1*quant1 + valor2* quant2) * (ipi/100 +1 );
		
	}

}
