// EXAMPLE OF A NUMBERS SERIES THAT TELL THE MAX AND MIN. JAVA LENGUAGE BY DANI95RICO

import java.util.*;
public class SerieNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
		int max=0;
		int min=0;
		int suma=0;
		int cuenta=0;
		double media;
		boolean salir=false;
		
		System.out.println("Escriba una serie de números. El programa terminará cuando teclee un 0");
		System.out.print("\nTeclee número: ");
		numero=sc.nextInt();
		if(numero!=0)
		{
		max=numero;
		min=numero;
		while(!salir)
		{
			System.out.print("Teclee número: ");
			numero=sc.nextInt();
			if(numero==0)
			{
				salir=true;
			}
			if(numero>max)
			{
				max=numero;
			}
			if(numero<min && numero!=0)
			{
				min=numero;
			}
			suma=suma+numero;
			cuenta++;
		}
		media=suma/cuenta;
		System.out.println("\nSe han leído "+cuenta+" números.");
		System.out.println("La media es: "+media);
		System.out.println("El mayor es: "+max);
		System.out.println("El menor es: "+min);
		}
		else
		{
			System.out.println("\nSe han leído 0 números.");
			System.out.println("No se pueden hacer los cálculos porque no ha introducido números.");
		}
		sc.close();
	}

}
