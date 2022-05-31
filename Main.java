package br.com.vin.OONETFLIX;

public class Main {

	
		public static void main(String[] args) {
			
			
			Serie serie = new Serie();
			serie.nome = "Stranger things";
			serie.genero = "Aventuda/sci-fi";
			serie.studio = "Netflix";
			serie.minutagem = "50 minutos";
			
			serie.assistir(0);
			
			
			Serie serie2 = new Serie();
			serie.nome = "game of thrones";
			serie.genero = "fantasia";
			serie.studio = "warner-bros/hbo";
			serie.minutagem = "50 minutos";
			
			serie2.assistir(0);
			
		}
}
