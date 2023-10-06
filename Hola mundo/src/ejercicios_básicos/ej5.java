package ejercicios_básicos;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner X= new Scanner(System.in);
		System.out.print("Introduzca su peso en kilogramos:\r\n");
		float peso= X.nextFloat();
		System.out.print("Introduzca su altura en metros:\r\n");
		float altura= X.nextFloat();
		float IMC=(peso/(altura*altura));
		System.out.println("Peso: "+peso+"\r\nAltura: "+altura+"\r\nIMC: "+IMC);
		System.out.println("TABLA IMC");
		System.out.println("Delgado: <18.5"
				+ "\r\nNormal: Entre 18.5 y 24.9"
				+ "\r\nSobrepeso: Entre 25 y 29.9"
				+ "\r\nObeso: >30");
		X.close();
	}

}
