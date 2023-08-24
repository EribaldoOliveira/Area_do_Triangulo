package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double lA, lB, lX;
		
		System.out.println("================================");
		System.out.println("Digite as medidas do triangulo: ");
		System.out.println("================================");
		lA = sc.nextDouble();
		lB = sc.nextDouble();
		//xC = sc.nextDouble();
		
		double lx = 180 - (lA + lB);
		
		//double  p = (xA + xB + xC) / 2.0;
		//double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		System.out.println("..................................");
		System.out.printf("O lado X do triangulo é : [%.1fº]%n", lx);
		System.out.println("..................................");
		
		System.out.printf("Lado A: [%.1fº]%n", lA);
		System.out.printf("Lado B: [%.1fº]%n", lB);
		System.out.printf("Lado X: [%.1fº]%n", lx);
		
		
		sc.close();
	}

}
