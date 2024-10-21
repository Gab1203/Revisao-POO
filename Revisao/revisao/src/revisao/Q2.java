package revisao;
import java.util.Scanner;

/*2) Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e
informe quantos segundos do dia já passaram.*/
public class Q2 {

	
	
	public static int segundosTranscorridos(int horas, int minutos, int segundos) {
		
		return segundos + (minutos * 60) + (horas * 3600);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horas, minutos, segundos;
		
		
		do {
			System.out.println("Digite a hora atual:");
			horas = scan.nextInt();
			System.out.println("Digite os minutos atuais:");
			minutos = scan.nextInt();
			System.out.println("Digite os segundos atuais:");
			segundos = scan.nextInt();
			
			if(horas >= 0 && minutos >= 0 && segundos >= 0) {
				
				System.out.println("Segundos transcorridos: " + segundosTranscorridos(horas, minutos, segundos));
				System.out.println();
				
			}
			
			
		}while(horas >= 0 && minutos >= 0 && segundos >= 0);
		

	}

}
