package br.pro.hashi.ensino.desagil.tequilada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class Reader {
	public static void main(String[] args) throws URISyntaxException {
		BufferedReader br = null;
		
		//O compilador tentará rodar o codigo dentro do bloco "try", se n cosneguir, ele ira passar para o "catch"
		try{ 
	        br = new BufferedReader(new FileReader("labirinto.txt")); //Arquivo se encontra no ArthurOlga/ (a pasta mais alta) 	

		   
	       int h,w;
	       
		   String firstLine = br.readLine(); 
		   String[] parts = firstLine.split(" ");
		   h = Integer.parseInt(parts[0]); //Lines
		   w = Integer.parseInt(parts[1]); //Columns
		   
		   
		      
		   
		   // System.out.println(h + " " + w);
		   
		   
		   
		   for (int line = 0; line < h; line++){
			   for (int i = 0; i< w; i++){
				   char value = (char)br.read();
				   if (value == '#'){
					   value = 'X';
				   }
				   System.out.print(value);
				   
			   }
			   ;
		   }
		}
		
		catch (IOException ioe) { // Caso haja erro no bloco 'try', o codigo sera redirecionado para o 'catch'
			System.out.println("Erro");
		}
    
}}
