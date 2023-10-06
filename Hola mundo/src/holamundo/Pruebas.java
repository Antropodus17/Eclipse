package holamundo;

import java.time.ZonedDateTime;

public class Pruebas {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		boolean casado = true;
		final int nºMax = 999999;
		char sexo='v';
		double factura=95862.02548635;
		long poblacionTotal=8061525708l;
		System.out.println("Casado "+casado);
		System.out.println("numero máximo "+nºMax);
		System.out.println("sexo "+sexo);
		System.out.println("factura "+factura);
		System.out.println("Población "+poblacionTotal);
		
		
		String P ="http://JavaSRC.wordpress.com";
			System.out.print("Pagina:"+"\t\t"+P+"\n"+"Pagina:"+"\""+P+"\"");*/
		ZonedDateTime date=ZonedDateTime.now();
		
		System.out.printf("Hoy es %1$tA %1$td %1$tB %1$tY %n",date);
		System.out.printf("Son loas %1$tH:%1$tM:%1$tS [%1$tp] %n",date);
		System.out.printf("En la zona horaria %s [%tz] %n", date.getZone(), date);
		

		}

		}
	


