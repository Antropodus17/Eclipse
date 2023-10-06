package ejercicios_básicos;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TABLA DE &&");
		System.out.println("Falso\t\t&&\tFalso\t\t=\t"+(false&&false));
		System.out.println("Falso\t\t&&\tVerdadero\t=\t"+(false&&true));
		System.out.println("Verdadero\t&&\tFalso\t\t=\t"+(true&&false));
		System.out.println("verdadero\t&&\tVerdadero\t=\t"+(true&&true));
		
		System.out.println("TABLA DE ||");
		System.out.println("Falso\t\t||\tFalso\t\t=\t"+(false||false));
		System.out.println("Falso\t\t||\tVerdadero\t=\t"+(false||true));
		System.out.println("Verdadero\t||\tFalso\t\t=\t"+(true||false));
		System.out.println("verdadero\t||\tVerdadero\t=\t"+(true||true));
		System.out.println("Qué '\"confuso' \"\\\" es esto!");
	}

}
