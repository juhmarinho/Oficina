package rh;



public class Cliente {
		private String cpf;;
		private String nome;
		private Endereco endereco;
		private Contato contato;
		
		
		public Cliente(String nome,String cpf, Contato contato, Endereco endereco){

			this.cpf= cpf;
			this.nome = nome;
			this.contato = contato;
			this.endereco= endereco;
			
		}

		// ----------------- pegando informacoes -----------------
		

		public String solicitarNome(){

			return nome;
		}

		public Contato solicitarContato(){

			return contato;
		}

		public Endereco solicitarEndereco(){

			return endereco;
		}

		public String solicitarCpf(){

			return cpf;
		}

		// ----------------- alterando informacoes -----------------
		public void alterarDados(String nome, Contato contato, Endereco endereco){

			this.nome = nome;
			this.contato = contato;
			this.endereco= endereco;
		}

	
		
		// ----------------------------------
		public String toString(){
			
			return "Nome: " + nome +"\nCpf: " + cpf + "\nContato: \n" + contato + "\nEndereco: \n" + endereco;
		}
}

