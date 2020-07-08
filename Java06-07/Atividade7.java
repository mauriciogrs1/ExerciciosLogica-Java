package Atividades;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) 
	{
		Scanner leia = new Scanner(System.in);
		float a,b,c,d,e,f,x,y;
		
		System.out.printf("Entre com o valor de A: ");
		a = leia.nextFloat();
		System.out.printf("Entre com o valor de B: ");
		b = leia.nextFloat();
		System.out.printf("Entre com o valor de C: ");
		c = leia.nextFloat();
		System.out.printf("Entre com o valor de D: ");
		d = leia.nextFloat();
		System.out.printf("Entre com o valor de E: ");
		e = leia.nextFloat();
		System.out.printf("Entre com o valor de F: ");
		f = leia.nextFloat();
		
		x = Math.round(( ((c*e)-(b*f)) / (a*e)-(b*d)));
		y = Math.round(( ((a*f)-(c*d)) / (a*e)-(b*d)));
		
		System.out.printf("O valor de x é: %f", x);
		System.out.printf("\n o valor de Y é: %f",y);
		
				
		
	}
	

}
