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
			System.out.println("O seu IMC � "+imc+"E voc� est� abaixo do peso!");
		}
		if(imc>=18.5 && imc<25) {
			System.out.println("O seu IMC � "+imc+"E voc� est� com peso normal!");
		}
		if(imc>=25 && imc<30) {
			System.out.println("O seu IMC � "+imc+"E voc� est� acima do peso!");
		}
		if(imc>=30) {
			System.out.println("O seu IMC � "+imc+" e voc� est� obeso!");
		}
	}

}
