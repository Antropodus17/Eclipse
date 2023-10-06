package EJ_E_S_III;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base = 22.75f, iva;
		iva=base*0.21f;
		float total= (float)(base + iva);
		System.out.printf("───────────────────────%n"
						+ "Base imponible %1$8.2f%n"
						+ "IVA %2$19.2f%n"
						+ "-----------------------%n"
						+ "Total %3$17.2f%n",base,iva,total);
	}

}
