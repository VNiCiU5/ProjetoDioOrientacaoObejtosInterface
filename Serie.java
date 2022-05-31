package br.com.vin.OONETFLIX;

import java.util.Scanner;

public  class Serie implements Assistir {
	
	
	   	protected String nome;
	   	protected String genero;
	   	protected String minutagem;
	   	protected String studio;
	    
	    
	   public void assistir(int num) {
		
		   Scanner keyboard = new Scanner(System.in);
	    	
    	
			System.out.println("desesja implementar a interface?  digite 1 para 'sim' ");
			 int res = keyboard.nextInt();
		
	if (res == 1) {
			System.out.println("interface implementada!" );
		}
	   }
}
	
