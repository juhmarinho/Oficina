package oficina;

import rh.Contato;
import rh.Endereco;

public class Fornecedor {
	private String codigo;
	private String responsavel;
	private Contato contato;
	private Endereco endereco;

	
	public Fornecedor(String codigo,String responsavel,Contato contato, Endereco endereco){
		
		this.codigo=codigo;
		this.responsavel=responsavel;
		this.contato=contato;
		this.endereco=endereco;
	}
	// ----------------- pegando informacoes -----------------
	 	public String solicitarCodigo(){

			return codigo;
		}
	 	public String solicitarResponsavel(){

			return responsavel;
		}

	 	public Contato solicitarContato(){

			return contato;
		}
	 	public Endereco solicitarEndereco(){

			return endereco;
		}
		// ----------------- alterando informacoes -----------------
				public void alterarDados(String responsavel){

					this.responsavel=responsavel;
				}
		
		
		// ----------------------------------
		public String toString(){

			return "Codigo: " + codigo + "\nResponsavel: " + responsavel + "\nContato: " + contato + "\nEndereco:" + endereco;
		}

}
