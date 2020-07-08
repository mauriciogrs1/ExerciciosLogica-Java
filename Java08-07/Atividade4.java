package Atividades;

import java.util.Scanner;

public class Atividade4 {
	public static void main (String args[]) 
	{
		Scanner leia=new Scanner(System.in);
		int idade, sexo,comport,qnt=0 , calm=0, hagre=0, mnerv=0, jcalm=0 , inerv=0;
		
		while(qnt <=5) {
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		System.out.println("Informe seu sexo: 1- Masculino e 2-Feminino ");
		sexo = leia.nextInt();
		System.out.println("Seu comportamento é: 1- calma 2-nervosa 3-agressivo");
		comport = leia.nextInt();
		qnt ++;
		
			if(comport == 1) {
				calm++;
			}
			else if(comport==2 && sexo == 2) {
				mnerv++;
			}
			else if (comport ==3 & sexo ==1) {
				hagre++;
			}
			else if (comport == 2 && idade>=40) {
				inerv++;
			}
			else if (comport == 1 && idade<=18) {
				jcalm++;
			}
		}
			
			System.out.println("O numero de pessoas calmas são: "+calm);
			System.out.println("O numero de mulheres nervosas são: "+mnerv);
			System.out.println("O numero de homens agressivos são: "+hagre);
			System.out.println("O numero de pessoas nervosas com mais 40 anos são: "+inerv);
			System.out.println("O numero de pessoas calmas com menos de 18 são: "+jcalm);
			
			
		
		
		
		
	
		
		
	}
		

}
