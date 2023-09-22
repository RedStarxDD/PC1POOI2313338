package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int velocidad;
		double millas;
		try {
			System.out.println("Ingrese un número final para los kilómetros por hora mayor a 60KPH");
			velocidad=sc.nextInt();
			
			if(velocidad<60 || velocidad%10!=0) {
				System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
				System.exit(0);
				sc.close();
			}
			
			System.out.println("KPH              MPH");
			System.out.println("--------------------");
			for (int i = 60; i <= velocidad; i+=10) {
				millas=i*0.6214;
				System.out.printf("%d\t\t%.1f\n",i,millas);
			}
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Valor no aceptado");;
		}
	}

}
