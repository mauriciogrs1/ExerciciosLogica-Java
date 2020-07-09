package AtividadesArreys;

import java.util.Scanner;

public class Atividade2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int numpar=0, somanumimpar=0, numimpar=0, i;
		int [] vt = new int [6];
		
		for(i=0;i<6;i++) { // for de ler usuario
			
			System.out.println("Entre com um numero: ");
			vt[i] = ler.nextInt();
						
			
		}
		for(i=0;i<6;i++) { // for de exibição
			
			if(vt[i]%2==0) {
				
				System.out.println("O numero  Par "+vt[i]);
				numpar=numpar+vt[i];
								
			}
			else
			{
				System.out.println("O numero  Impar "+vt[i]);
				numimpar = numimpar+vt[i];
				somanumimpar++;
				
			}
		}
		
		
		System.out.println("Mostre a soma dos numero pares: "+numpar);
		System.out.println("Mostre a quantidade de numeros impares: "+somanumimpar);		
		
		
	
	}

}
