package controller;

import controllerFila.FilaInt;

public class Selecao 
{
	FilaInt fila = new FilaInt();
	
	int[] vet = {};
	
	public Selecao()
	{
		super();
	}
	
	public void colocaFila(int[] vet)
	{
		for(int array: vet)
		{
			fila.insert(array);
		}
	}
	
	public void rodaFila()
	{
		int test;
		FilaInt guarda = new FilaInt();
		while(!fila.filaVazia())
		{
			try {
				test = fila.remove();
				if(test == 3)
				{
					System.out.println(test);
				}
				else if(test > 3 && test < 9)
				{
					int getNumber = fila.remove();
					System.out.println(fila.remove());
					System.out.println(getNumber);
					System.out.println(test);
				}
				else if(test > 10 && test < 18)
				{
					System.out.println(fila.remove());
					System.out.println(test);
				}
				else if(test > 18)
				{
					System.out.println(test);
					
				}
				else
				{
					guarda.insert(test);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		while(!guarda.filaVazia())
		{
			try {
				System.out.println(guarda.remove());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
