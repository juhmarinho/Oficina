package oficina;

import rh.Cliente;
import rh.Contato;

public class Fabricante {

	private String codigo;
	private String nome;
	private Contato contato;
	

	public Fabricante(String codigo,String nome,Contato contato){

		this.codigo= codigo;
		this.nome=nome;
		this.contato=contato;
		
	}

	// ----------------- pegando informacoes -----------------
 	public String solicitarCodigo(){

		return codigo;
	}
 	public String solicitarNome(){

		return nome;
	}

 	public Contato solicitarContato(){

		return contato;
	}
	// ----------------- alterando informacoes -----------------
			public void alterarDados(String nome){

				this.nome=nome;
			}
	
	
	// ----------------------------------
	public String toString(){

		return "Codigo: " + codigo + "\nNome: " + nome + "\nContato: " + contato;
	}

}
