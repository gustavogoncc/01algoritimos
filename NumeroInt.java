import java.util.Scanner;

public class NumeroInt {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		
		int antecessor = numero -1;
		int sucessor = numero +1;
		
		System.out.println("O número inteiro "+numero+" tem  "+antecessor +" seu antecessor  e "+sucessor+" como sucessor.");
	}

}
