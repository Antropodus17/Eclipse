package EJ_E_S_III;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		float a, b , d=1;
		int c ,e ;
		Scanner X=new Scanner(System.in);
		System.out.print("Capital inicial (€): ");
		a=X.nextFloat();
		System.out.print("Interés anual (%) : ");
		b=X.nextFloat();
		X.nextLine();
		System.out.print("Años (a) : ");
		c=X.nextInt();
		for (e=1;e<=c;e++) {
			d*=(1+(b/100));
		}
		d*=a;
		System.out.printf("************************************************%n"
						+ "*Capital inicial:%1$30.2f*%n"
						+ "*Interés anual:%2$32.2f*%n"
						+ "*Periodo:%3$38d*%n"
						+ "*Capital final:%4$32.2f*%n"
						+ "*Rendimiento:%5$34.2f*%n"
						+ "************************************************",a,b,c,d,(d-a));
		
	}

}
