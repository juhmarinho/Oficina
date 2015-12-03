package principal;
import java.util.ArrayList;
import java.util.TreeMap;

import oficina.Carro;
import rh.Cliente;
import rh.Contato;
import rh.Endereco;

public class Oficina {
			
		static Integer qntIdCliente= 0;
		static Integer qntCodigoCarro=0;
		

		private TreeMap<String, Cliente> clientes;
		private TreeMap<String, Carro> carros;	

 
		private TreeMap<String, Cliente> clientes_excluidos;
		private TreeMap<String, Carro> carros_excluidos;


		private static Oficina instancia= null;

		private Oficina(){

			inicializar();
		}

		public static synchronized Oficina solicitaInstancia(){

			if (instancia==null)			
				instancia = new Oficina();
			return instancia;
		}

		private void primeirasInstancias(){ 

			cadastrarCliente("Larissa","1234","lala@ferrarez.com","2323","Rua b","10","Cha","254569","RJ");
			

			cadastrarCarro("Fiat","Siena","2009","Prata","LKZ2704");
		
		}

		private void inicializar(){

			//usuarios= new  TreeMap<String, Usuario>();
			 clientes= new TreeMap<String, Cliente>();
			 carros= new TreeMap<String, Carro>();

			primeirasInstancias();

//			usuarios_excluidos= new  TreeMap<String, Usuario>();
			clientes_excluidos= new TreeMap<String, Cliente>();
			carros_excluidos= new TreeMap<String, Carro>();

		}

		

		
		

		// ----------------- Cliente -----------------		
		public String cadastrarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(cpf);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);
			

			
			if(verificarPreenchimento(campos)){

				Cliente novo= criarCliente(nome,cpf, email, telefone, rua, numero, bairro, cep, cidade);
				clientes.put(cpf, novo);
			}
			return "Preencha todos os campos.";
		}

		private Cliente criarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			Contato contato= new Contato(email, telefone);
			Endereco endereco= new Endereco(rua, numero, bairro, cidade, cep);

			Cliente cliente= new Cliente(nome,cpf, contato, endereco);

			return cliente;
		}

		public Cliente buscarCliente(String cpf){

			return clientes.get(cpf);
		}

		public String editarCliente(Cliente cliente, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(nome);
			campos.add(email);
			campos.add(telefone);
			campos.add(bairro);
			campos.add(cep);
			campos.add(cidade);
			campos.add(numero);
			campos.add(rua);

			if(verificarPreenchimento(campos) && cliente!= null){

				Contato contato= new Contato(email, telefone);
				Endereco endereco= new Endereco(rua, numero, bairro, cep, cidade);

				cliente.alterarDados(nome, contato, endereco);			
				return "Edicao concluida!";
			}
			return "Preencha todos os campos.";
		}

		public void excluirCliente(String cpf){

			Cliente excluido= clientes.get(cpf);
			clientes_excluidos.put(cpf, excluido);
			clientes.remove(cpf);
		}

	

		// ----------------- carro -----------------	
		public String cadastrarCarro(String marca, String modelo, String ano, String cor, String placa){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(marca);
			campos.add(modelo);
			campos.add(ano);
			campos.add(cor);
			campos.add(placa);

			gerarCodigoCarro();
			String codigo= String.valueOf(qntCodigoCarro);
			
			if(verificarPreenchimento(campos)){

				Carro nova= criarCarro(codigo,marca,modelo,ano,cor,placa);
				carros.put(placa,nova);

				return placa;
			}
			return "Preencha todos os campos.";
		} 	

		private Carro criarCarro(String codigo, String marca, String modelo, String ano, String cor, String placa){

			Carro nova= null;

			nova= new Carro(codigo,marca,modelo,ano,cor,placa);
			return nova;
		}

		public Carro buscarCarroPlaca(String placa){

			return carros.get(placa);
		}

		public String editarCarro(Carro carro, String marca, String modelo, String ano, String cor, String placa){

			ArrayList<String> campos= new ArrayList<String>();
			campos.add(marca);
			campos.add(modelo);
			campos.add(ano);
			campos.add(cor);
			campos.add(placa);

			if(verificarPreenchimento(campos) && carro!= null){

				carro.alterarDados(marca,modelo,ano,cor,placa);
				return "Edicao concluida!";
			}
			return "Preencha todos os campos.";
		}

		public void excluirCarro(String placa){ 

			Carro excluido= carros.get(placa);
			carros_excluidos.put(placa,excluido);
			carros.remove(placa);
			
		}
		
		private static void gerarCodigoCarro(){

			qntCodigoCarro++;
		}
		private boolean verificarPreenchimento(ArrayList<String> campos){

			for(String campo : campos)
				if(campo.equals(""))
					return false;

			return true;
		}
}
