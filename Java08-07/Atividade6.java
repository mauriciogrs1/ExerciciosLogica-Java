package Atividades;

import java.util.Scanner;

public class Atividade6 {
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		int num=0,soma=0, contador=0;
		float media;
		
		do
		{
			System.out.println("Entre com um numero: ");
			num = leia.nextInt();
			if(num%3==0 && num!=0)
			{
				soma = num + soma;
				contador++;
			}
			
			
		}while(num!=0);
		media = soma/contador;
		
		System.out.println("A média dos numeros multiplos de 3 é:"+media);
	}

}
