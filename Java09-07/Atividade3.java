package AtividadesArreys;

import java.util.Scanner;

public class Atividade3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int[][] mt = new int [3][3];
		int l, c ,contador=0;
		
		for(l=0;l<3;l++) 
		{
			
			for(c=0;c<3;c++)
			{
				System.out.println("Entre com um numero: ");
				mt[l][c] = ler.nextInt();
				if(mt[l][c]>=10) {
					contador++;
				}
				
			}
		}
		
		System.out.println("Possui "+contador+" maiores que 10");
	}
	
	

}
