package Atividades;

import java.util.Scanner;

public class Atividade1 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		float preço, porc;
		int op=0;
		
		System.out.println("Digite o valor do produto: ");
		preço = leia.nextFloat();
		
		System.out.println("(1) À vista em dinheiro ou cheque, recebe 20% de desconto ");
		System.out.println("(2) À vista no cartão de crédito, recebe 15% de desconto  ");
		System.out.println("(3) Em duas vezes, preço normal de etiqueta sem juros   ");
		System.out.println("(4) Em três vezes, preço normal de etiqueta mais juros de 10%");
		System.out.println("Escolha a forma de pagamento: ");
		op = leia.nextInt();
		switch(op) {
		case 1:
			porc=(preço*20/100);
			preço=preço-porc;
			System.out.println("O valor do produto com desconto é: "+preço);
		break;
		
		case 2:
			porc=(preço*15/100);
			preço=preço-porc;
			System.out.println("O valor do produto com desconto é: "+preço);
		break;
		case 3:
			preço=preço/2;
			System.out.println("O valor da parcela do produto é: "+preço+" sem juros");
		break;
		case 4:
			porc=(preço*10/100);
			preço=(preço+porc)/3;
			System.out.println("O valor da parcela do produto com juros é: "+preço);
		break;
		default:
			System.out.println("Opção invalida...");
		}
		
		
		

	}

}
