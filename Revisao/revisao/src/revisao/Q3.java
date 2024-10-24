package revisao;
import java.util.Scanner;

/*3) Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
média ponderada.*/
public class Q3 {
	
	
	public static double mediaPonderada(double notas[], double pesos[]){
		int i;
		double somaNotas = 0.0;
		double somaPesos = 0.0;
		
		
		for(i = 0; i < notas.length; i++) {
			
			somaPesos += pesos[i];
			somaNotas += notas[i] * pesos[i];
			
		}
				
		return  somaNotas/somaPesos;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		double notas[] = new double[3];
		double pesos[] = new double[notas.length];
		int continuar;
		
		do {
			
			for(i = 0; i < notas.length; i++) {
				System.out.printf("Digite a %d° nota do aluno:\n", i+1);
				notas[i] = scan.nextDouble();
				System.out.printf("Digite o %d° peso:\n", i+1);
				pesos[i] = scan.nextDouble();
				
			}
			
			System.out.printf("Média ponderada: %.2f\n", mediaPonderada(notas,pesos));
			System.out.println("\nDeseja continuar?");
			continuar = scan.nextInt();
			
		}while(continuar != 0);
		
		

	}

}
