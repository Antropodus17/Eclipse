package holamundo;

public class Hola {
	 public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("	Hola Sergio \n Como estas?");
		Dias diaactual = Dias.Martes;
        Dias diasiguiente = Dias.Miercoles;
        
        System.out.print("Hoy es: ");
        System.out.println(diaactual);
        System.out.println("Mañana\nes\n"+diasiguiente);    
    
	}

}
