package a1;

import java.util.ArrayList;

public class Exc1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(30);
		numeros.add(90);
		numeros.add(69);
		numeros.add(25);
		
		Integer menor = Integer.MAX_VALUE;
		Integer indiceMenor = 0;
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) < menor) {
				menor = numeros.get(i);
				indiceMenor = i;
			}
		}
		
		System.out.println(numeros.get(indiceMenor));
	}
}
