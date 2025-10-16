package Ex5;

public class Principal{
	
	public static void main(String[] args) {
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Biblioteca de Brasilia");
		
		Livro l1 = new Livro();
		l1.setTitulo("I Have No Mouth and I Must Scream");
		l1.setAutor("Harlan Ellison");
		l1.setAnoPublicacao(1967);
		
		b1.addLivro(l1);
	}
	
}