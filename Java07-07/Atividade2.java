package Atividades;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[])
	{
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Voc� � da turma Infantil");
		}
		if(idade>=15 && idade<=17) {
			System.out.println("Voc� � da turma Juvenil");
		}
		if(idade>=18) {
			System.out.println("Voc� � da turma Adulto");
		}
		else {
			System.out.println("Voc� n�o faz parte de nenhuma turma");
		}
		
		
	}
				

}
