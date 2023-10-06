package Ejercicios_BásicosII;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner X =new Scanner(System.in);
		int dias,horas,minutos,segundos;
		System.out.println("ingrese los días:");
		dias=X.nextInt();
		System.out.println("ingrese las horas:");
		horas=X.nextInt();
		System.out.println("ingrese los minutos:");
		minutos=X.nextInt();
		System.out.println("ingrese las segundos:");
		segundos=X.nextInt();
		System.out.println(dias+" dias+"+horas+" horas+"+minutos+" minutos+"+segundos+" segundos es igual a \n"
				+((dias*24*3600)+(horas*3600)+(minutos*60)+segundos)+" segundos");
		X.close();
	}

}
