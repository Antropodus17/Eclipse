package Ejercicios_BásicosII;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		double a, b , d=1;
		int c ,e ;
		Scanner X=new Scanner(System.in);
		System.out.print("Capital inicial (€): ");
		a=X.nextDouble();
		System.out.print("Interés anual (%) : ");
		b=X.nextDouble();
		X.nextLine();
		System.out.print("Años (a) : ");
		c=X.nextInt();
		for (e=1;e<=c;e++) {
			d*=(1+(b/100));
		}
		d*=a;
		System.out.println("************************************************");
		System.out.println("*Capital inicial:                      "+a+" *");
		System.out.println("*Interés anual:                            "+b+" *");
		System.out.println("*Periodo:                                   "+c+" *");
		System.out.println("*Capital final:                       "+Math.round(d*100.00)/100.00+" *");
		System.out.println("*Rendimiento:                         "+Math.round((d-a)*100.00)/100.00+" *");
		System.out.println("************************************************");
	
	
		
	}
}
	

	