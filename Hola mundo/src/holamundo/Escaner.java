package holamundo;

//import java.util.Scanner; //Importamos escaner

public class Escaner {

	public static void main(String[] args) throws InterruptedException {// throws InterruptedException para hacer delays
	
		int a=127;
		for(a=127;a<=270;a++) {
			System.out.println("el int "+a+" pasa a ser en byte "+(byte)a);
			Thread.sleep(50);
		}

	/*
	Scanner X = new Scanner(System.in);
	System.out.println("Introduce tu primer dígito: " );
	float x = X.nextFloat();
	X.nextLine();

	System.out.println("Introduce tu operador : " );
	String o = X.nextLine();		
	
	System.out.println("Introduce tu segundo dígito: " );
	float y = X.nextFloat();
	
	if (o.contains("+")) {
		System.out.println("Resultado: "+(x+y));
	}
	else {
		if (o.contains("-")) {
			System.out.println("Resultado: "+(x-y));
		}
		else {
			if (o.contains("*")) {
				System.out.println("Resultado: "+(x*y));
			}
			else {
				if (o.contains("/")) {
					System.out.println("Resultado: "+(x/y));
				}
			}
		}

	}
	X.close();*/
	}
}
