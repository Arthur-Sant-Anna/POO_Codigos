package Aula;

public class Principal{
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Abner Pereira");
		a1.setRA("22542069");
		a1.setCPF("123.456.789-10");
		
		Endereco end = new Endereco();
		end.setCEP("72867230");
		end.setLogradouro("Quadra 422 Lote 96");
		end.setNumero(13);
		
		a1.setEndereco(end);
		
		System.out.println(a1.getNome() + " - " + a1.getRA() + " - " + a1.getEndereco().getCEP());
	}
	
}