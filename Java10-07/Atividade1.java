package Atividades;

import java.util.Scanner;

public class Atividade1 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		float pre�o, porc;
		int op=0;
		
		System.out.println("Digite o valor do produto: ");
		pre�o = leia.nextFloat();
		
		System.out.println("(1) � vista em dinheiro ou cheque, recebe 20% de desconto ");
		System.out.println("(2) � vista no cart�o de cr�dito, recebe 15% de desconto  ");
		System.out.println("(3) Em duas vezes, pre�o normal de etiqueta sem juros   ");
		System.out.println("(4) Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%");
		System.out.println("Escolha a forma de pagamento: ");
		op = leia.nextInt();
		switch(op) {
		case 1:
			porc=(pre�o*20/100);
			pre�o=pre�o-porc;
			System.out.println("O valor do produto com desconto �: "+pre�o);
		break;
		
		case 2:
			porc=(pre�o*15/100);
			pre�o=pre�o-porc;
			System.out.println("O valor do produto com desconto �: "+pre�o);
		break;
		case 3:
			pre�o=pre�o/2;
			System.out.println("O valor da parcela do produto �: "+pre�o+" sem juros");
		break;
		case 4:
			porc=(pre�o*10/100);
			pre�o=(pre�o+porc)/3;
			System.out.println("O valor da parcela do produto com juros �: "+pre�o);
		break;
		default:
			System.out.println("Op��o invalida...");
		}
		
		
		

	}

}
