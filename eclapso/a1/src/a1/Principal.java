package a1;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<String> disciplina = new ArrayList<String>();
		disciplina.add("Banco de Dados");
		disciplina.add("POO");
		disciplina.add("Algebra linear");
		disciplina.add("Desenvolvimento de Interface");
		
		System.out.println(disciplina);
		System.out.println(disciplina.get(1));
		System.out.println(disciplina.size());
		
		for(int i = 0; i < disciplina.size(); i++) {
			System.out.println(disciplina.get(i));
		}
	}
}