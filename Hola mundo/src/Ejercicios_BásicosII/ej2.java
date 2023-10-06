package Ejercicios_BásicosII;
import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner T=new Scanner(System.in);
		double c,f;
		System.out.println("Introduzca la temperatura en ºC:");
		c=T.nextDouble();
		f=(1.8*c)+32;
		System.out.println("La temperatura en Fahrenheit"+f);
		T.close();
	}

}
