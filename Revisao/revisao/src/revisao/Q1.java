package revisao;
import java.util.Scanner;

/*1) Faça um programa em Java que receba uma temperatura em centígrados e transforme para fahrenheit.
Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.*/

public class Q1 {
	
	
	public static double fahrenheit(double celsius) {
		return (celsius * 9/5) + 32.0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		double celsius;
		
		do {
			
			System.out.println("Digite em celsius uma temperatura:");
			celsius = scan.nextDouble();
			
			System.out.printf("Temperatura digitada em celsius: %.2f\n", celsius);
			System.out.printf("Temperatura em fahrenheit: %.2f\n", fahrenheit(celsius));
			System.out.println();
			
			
		}while(true);

	}

}
