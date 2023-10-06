package Ejercicios_BásicosII;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner X=new Scanner(System.in);
		float a,b,c;//Declaramos las variables a usar
		System.out.print("Introduce la primera nota: ");//Procemos a preguntar por las notas y a meterlas en las variable 
		a=X.nextFloat();
		System.out.print("Introduce la segunda nota: ");
		b=X.nextFloat();
		System.out.print("Introduce la tercera nota: ");
		c=X.nextFloat();
		float media=((a+b+c)/3);//Operamos con las notas
		System.out.println("Nota final: "+Math.round(media*100.00)/100.00);//Enseñamos la nota con los decimales
		System.out.println("Nota final redondeada: "+Math.round(media));//Redondeamos la nota
		if (Math.round(media)>5) {                       //Comprobamos si aprobo o suspendio
			System.out.println("¡¡¡¡¡Enhorabuena!!!!!");
		}
		else {
			System.out.println("Suerte para la próxima.");
		}
	}

}
