package Atividades;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		int dia, mes, ano, soma;
		
		System.out.printf("Entre com sua idade: ");
		ano = leia.nextInt();
		System.out.printf("Entre com o mês de Nascimento: ");
		mes = leia.nextInt();
		System.out.printf("Entre com o dia de Nascimento: ");
		dia = leia.nextInt();
		
		ano = ano * 365;
		mes = mes * 30;
		soma = ano+mes-dia;
		
		System.out.printf("Sua idade corresponde à: %d", soma);
	}

}
