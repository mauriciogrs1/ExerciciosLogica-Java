package Atividades;

import java.util.Scanner;

public class Atividade2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num, x, somapar=0, somaimpar=0;
		
		for (x=1;x<=10;x++)
		{
			System.out.println("Entre com um numero: ");
			num = ler.nextInt();
				
				if(num%2==0)
				{
					somapar++;
				}
				else
				{
					somaimpar++;
				}
				
		}
		System.out.println("A quantidade de Numeros pares são: "+somapar);
		System.out.println("A quantidade de NJumeros impares são: "+somaimpar);
		
		
				
		
	}

}
