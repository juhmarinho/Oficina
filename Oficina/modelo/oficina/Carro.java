package oficina;

import rh.Cliente;



public class Carro {
	
	private String codigo;
	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	private String placa;
	private Cliente cliente;
	

	public Carro(String codigo,String marca, String modelo, String ano, String cor, String placa){

		this.codigo= codigo;
		this.marca= marca;
		this.modelo= modelo;
		this.ano= ano;
		this.placa= placa;
		

		
	}

	// ----------------- pegando informacoes -----------------
 	public String solicitarCodigo(){

		return codigo;
	}

	public String solicitarMarca(){

		return marca;
	}

	public String solicitarModelo(){

		return modelo;
	}

	public String solicitarAno(){

		return ano;
	}

	public String solicitarPlaca(){

		return placa;
	}
	// ----------------- alterando informacoes -----------------
			public void alterarDados(String marca, String modelo, String ano, String cor, String placa){

				this.marca= marca;
				this.modelo= modelo;
				this.ano= ano;
				this.placa= placa;
			}
	
	
	
	// ----------------------------------
	public String toString(){

		return "Codigo: " + codigo + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano+ "\nPlaca: " + placa;
	}


}
