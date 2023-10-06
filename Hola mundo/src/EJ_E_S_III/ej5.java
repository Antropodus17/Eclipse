package EJ_E_S_III;

public class ej5 {

	public static void main(String[] args) {
		float a=0.0f ,b=1.0f ,c=2.0f ,d=3.0f ,e=1000f ,f=4567.0f, g=1.1f;
		System.out.printf("%1$.1f/\"%2$.1f = %3$.3f\n",b,d,b/d);
		System.out.printf("%1$.1f/\"%2$.1f = %3$.5f\n",b,d,b/d);
		System.out.printf("%1$.1f/\"%2$.1f = %3$.3f\n",b,c,b/c);
		System.out.printf("%1$.1f/\"%2$.1f = %3$.3e\n",e,d,e/d);
		System.out.printf("%1$.1f/\"%2$.1f = %3$.3e\n",d,f,d/f);
		System.out.printf("%1$.1f/\"%2$.1f = %3$.3f\n",-b,a,-b/a);
		System.out.printf("%1$.1f/\"%1$.1f = %2$.3f\n",a,a/a);
		System.out.printf("Pi = %1$.3f/, e = %2$.4f\n"
						+ "C = 2 * %1$.5f *  %3$.1f, A = %3$.1f * %3$.1f * %1$.5f",Math.PI,Math.E,g);
	}

}
