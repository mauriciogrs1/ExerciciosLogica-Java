package Atividades;

import java.util.Scanner;

public class Atividade3 {
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		int num;
		
		
		do {
			System.out.println("Entre com um numero: ");
			num = leia.nextInt();
			
			if(num >=0 && num<=25) {
				System.out.println("O numero que você digitou está no intervalo de [0-25]");
			}
			else if(num >=26 && num<=50) {
				System.out.println("O numero que você digitou está no intervalo de [26-50]");
			}
			else if(num >=51 && num<=75) {
				System.out.println("O numero que você digitou está no intervalo de [51-75]");
			}
			else if(num >=76 && num<=100) {
				System.out.println("O numero que você digitou está no intervalo de [76-100]");
			}
			
		}while(num>0);
	
		System.out.println("O numero que você digitou é invalido!");
	}
	

}
