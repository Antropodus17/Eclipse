package holamundo;



public class comparaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*int x=8;
		 int y=5;
		 boolean compara=(x<y);
		 System.out.println("x<y es \n"+compara);
		 compara=(x>y);
		 System.out.println("x>y es \n"+compara);
		 compara=(x==y);
		 System.out.println("x==y es \n"+compara);
		 compara=(x!=y);
		 System.out.println("x!=y es \n"+compara);
		 compara=(x<=y);
		 System.out.println("x<=y es \n"+compara);
		 compara=(x>=y);
		 System.out.println("x>=y es \n"+compara);*/

		
		/* boolean compara;
		 compara = 5<8;
		 //compara = true<false; //error
		 compara = true==false|true;//O.K!!!
		 System.out.println(compara);*/
		//int x=6;
		//int z = x++%5;
		
		/*boolean a=true;
		a=true&&true;
		System.out.print("true&&true = ");
		System.out.println(a);
		a=true&&false;
		System.out.print("true&&false = ");
		System.out.println(a);
		a=false&&true;
		System.out.print("false&&true = ");
		System.out.println(a);
		a=false&&false;
		System.out.print("false&&false = ");
		System.out.println(a);*/
		
		/*
		int A =5, B=3, C=12;
		System.out.println(A>3);
		System.out.println(B !=C);
		System.out.println(A*B==3);
		System.out.println(C/B==-4);
		System.out.println((A+B==8)&&(A-B==2));
		System.out.println((A+B==8)||(A-B==6));*/
		
		/*int x=4, y=3;
		 System.out.println(x>y?x+" es mayor que "+y: x +"no es mayor que "+y); //Forma compacta.

		 if (x>y) {                                            //Forma tradicional o de arból.
			 		System.out.println(x+" es mayor que "+y);
		 		  }
		 else {
			 	System.out.println(x+" es menor que "+y);
		 	  }*/
		
		/*int a= (int)Math.round( Math.random()*1000+1) ;
		System.out.println(a%2==0?"El número "+a+" es par":"El número "+a+" es impar");
		while ((a%2==0)==true) {
		a= (int)Math.round( Math.random()*1000+1);
		System.out.println(a%2==0?"El número "+a+" es par":"El número "+a+" es impar");
		}*/
		
		int i=10;
		System.out.println("Valor inicial de i: "+i);
		System.out.println("Valor de i%=3: "+(i%=3));
		System.out.println("Valor de i>>=1: "+(i>>1));
		System.out.println("Valor de i|=1: "+(i|=1));
	}
}
