package principal;

import java.util.Scanner;

import libreria.libreria;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un numero");
        int numero= teclado.nextInt();
        System.out.println("Escribe otro numero");
        int numero1 = teclado.nextInt();
        
        libreria objeto1=new libreria();
        System.out.println(objeto1.suma(numero,numero1));
	}

}