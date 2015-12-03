package oficina;

import rh.Contato;
import rh.Endereco;

public class Peca {
	private String codigo;
	private Categoria categoria;
	private String descricao;
	private int qtdestoque;
	private double valorcompra;
	private double valorvenda;
	private String localdeposito;
	private Fabricante fabricante;
	
	
	public Peca(String codigo,Categoria categoria,String descricao,int qtdestoque,double valorcompra,double valorvenda,String localdeposito,Fabricante fabricante){

		this.codigo= codigo;
		this.categoria = categoria;
		this.descricao = descricao;
		this.qtdestoque= qtdestoque;
		this.valorcompra=valorcompra;
		this.valorvenda=valorvenda;
		this.localdeposito=localdeposito;
		this.fabricante=fabricante;
		
	}

	// ----------------- pegando informacoes -----------------
	

	public String solicitarCodigo(){

		return codigo;
	}

	public Categoria solicitarCategoria(){

		return categoria;
	}

	

	// ----------------- alterando informacoes -----------------
	public void alterarDados(){

		
	}


	
	// ----------------------------------
	public String toString(){
		
		return "Codigo: " + codigo +"\nCategoria: " + categoria ;
	}

}
