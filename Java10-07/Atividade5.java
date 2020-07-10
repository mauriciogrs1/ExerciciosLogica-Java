package Atividades;

import java.util.Scanner;

public class Atividade5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		float [] num = new float[5], inverso = new float[5];
		int op,x;
		
		for (x=0;x<5;x++)
		{
			System.out.println("Entre com um numero: ");
			num[x] = ler.nextFloat();
		}
		System.out.println("Escolha a forma de exibição do seu vetor:");
		System.out.println("(1) Para mostrar em ordem direta");
		System.out.println("(2) Para mostrar em ordem inversa");
		op = ler.nextInt();
		
		for (x=0;x<5;x++) {
			
			if(op==1) {
				
				System.out.println("Vetor em ordem direta: Posição "+x+"="+num[x]);
			}
			if(op==2) {
				inverso[x] = num[(5-x)-1];
				//for (x=4;x>0;x--)
				System.out.println("Vetor em ordem inversa: Posição"+x+"="+inverso[x]);
					//System.out.println("Vetor em ordem inversa: Posição"+x+"="+num[x]);
			}
			if(op==0) {
				
				System.out.println("Opção invalida");
			}
		}
		
	}

}
