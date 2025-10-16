package Ex5;

import java.util.ArrayList;

public class Biblioteca{
	
	private String Nome;
	private ArrayList<Livro> Livros = new ArrayList<Livro>();
	
	public void addLivro(Livro livro) {
		this.Livros.add(livro);
	}
	
	public void removeLivro(Livro livro) {
		this.Livros.remove(livro);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public ArrayList<Livro> getLivros() {
		return Livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		Livros = livros;
	}
	
	
}