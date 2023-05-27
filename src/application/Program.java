package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double totalV, mediaV;
		double[] vect;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		totalV = 0.0;
		for (int i = 0; i < vect.length; i++) {
			totalV = totalV + vect[i];
		}
		
		mediaV = totalV / vect.length;
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", mediaV);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < mediaV) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();

	}

}
