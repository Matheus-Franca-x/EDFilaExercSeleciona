package view;

import controller.Selecao;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet = {3, 10, 1, 20, 18, 7, 4, 16, 2, 9, 12, 14};
		
		Selecao fila = new Selecao();
		
		fila.colocaFila(vet);
		fila.rodaFila();
		
		
		

	}

}
