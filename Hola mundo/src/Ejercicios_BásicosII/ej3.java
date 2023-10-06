package Ejercicios_BásicosII;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1;
		double lado2;
		Scanner L=new Scanner(System.in);
		System.out.print("Introduzca el primer lado:");
		lado1= L.nextDouble();
		System.out.print("Introduzca el segundo lado:");
		lado2= L.nextDouble();
		double area= lado1*lado2;
		double perimetro= lado1*2+lado2*2;
		area=Math.round(area*100.00)/100.00;
		perimetro=Math.round(perimetro*100.00)/100.00;
		System.out.println("Longitud del primer lado: "+lado1+"\n"
						+ "Longitud del segundo lado: "+lado2+"\n======================\n"
						+ "Prímetro: "+perimetro+"  Area: "+area+"\n======================\n");
	}

}
