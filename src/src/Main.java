package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/* Faça uma função que receba um número e retorne uma lista ordenada. */
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//scanner
		Scanner io = new Scanner(System.in);
		
		//function call
		System.out.println("Digite um número inteiro: ");
		int input = io.nextInt();
		io.close();
		result = lista_ordenada(input);
		Collections.sort(result);
		System.out.println(result);

	}
	
	public static ArrayList<Integer> lista_ordenada(int number)
	{
		//cast integer to string
		String str = Integer.toString(number);
		int size = str.length();
		
		//array string
		ArrayList<Integer> lista_ordenada = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
		{
			lista_ordenada.add(Integer.valueOf(String.valueOf(str.charAt(i))));
		}
		
		return lista_ordenada;
	}

}
