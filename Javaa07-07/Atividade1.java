package Atividades;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[]) 
	{
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Escreva o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Escreva o segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("Escreva o terceiro numero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O numero maior é:"+num1);
		}
		if(num2>num1 && num2>num3) {
			System.out.println("O numero maior é:"+num2);
		}
		if(num3>num2 && num3>num1) {
			System.out.println("O numero maior é:"+num3);
		}
	
	
		}
	
		
			
	}
	


