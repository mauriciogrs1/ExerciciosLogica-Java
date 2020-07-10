package Atividades;

import java.util.Scanner;

public class Atividade2 {
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		float peso, altura, imc;
		
		System.out.println("Entre com seu peso: ");
		peso = leia.nextFloat();
		System.out.println("Ente com sua altura: ");
		altura = leia.nextFloat();
		imc = (peso*altura)/2;
				
		if(imc < 18.5)
		{
			System.out.println("O seu IMC é "+imc+"E você está abaixo do peso!");
		}
		if(imc>=18.5 && imc<25) {
			System.out.println("O seu IMC é "+imc+"E você está com peso normal!");
		}
		if(imc>=25 && imc<30) {
			System.out.println("O seu IMC é "+imc+"E você está acima do peso!");
		}
		if(imc>=30) {
			System.out.println("O seu IMC é "+imc+" e você está obeso!");
		}
	}

}
