package Atividades;

public class Atividade4 {
	public static void main (String args[])
	{
		int esq=1, dir=1,x;
		double soma=0;
		// 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		for (x=1;x<=99;x++) {
							
			soma = soma+(esq/dir);
			dir++;
			esq= esq+ 2;
			
		}
		System.out.println(soma);
			
			
		
	}

}
