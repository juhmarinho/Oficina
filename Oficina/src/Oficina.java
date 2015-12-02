import java.util.ArrayList;
import java.util.TreeMap;

public class Oficina {
			
		static Integer qntIdCliente= 0;
		

//		private TreeMap<String, Usuario> usuarios;
		private TreeMap<String, Cliente> clientes;
//		private TreeMap<String, Obra> obras;	

//		private TreeMap<String, Usuario> usuarios_excluidos; 
		private TreeMap<String, Cliente> clientes_excluidos;
//		private TreeMap<String, Obra> obras_excluidas;
//		private TreeMap<String, Exemplar> exemplares_excluidos;

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

			cadastrarCliente("Larissa","1234","lala@ferrarez.com","2323","Rua","Numero","Bairro","cep","cidade");
			

//			cadastrarCarro("O Calculo com Geometria Analitica", "Leithold", "Calculo, Ciencias exatas, Matematica", "Harbra", "Volume 1");
//			cadastrarPeca("7", "43-5376587-3465", "1");
		}

		private void inicializar(){

			//usuarios= new  TreeMap<String, Usuario>();
			 clientes= new TreeMap<String, Cliente>();
			//obras= new TreeMap<String, Obra>();

			primeirasInstancias();

//			usuarios_excluidos= new  TreeMap<String, Usuario>();
			clientes_excluidos= new TreeMap<String, Cliente>();
//			obras_excluidas= new TreeMap<String, Obra>();
//			exemplares_excluidos= new TreeMap<String, Exemplar>();
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
			

			gerarIDCliente();
			String id= String.valueOf(qntIdCliente);

			if(verificarPreenchimento(campos)){

				Cliente novo= criarCliente(nome, cpf, email, telefone, rua, numero, bairro, cep, cidade);
				clientes.put(id, novo);

				return id;
			}
			return "Preencha todos os campos.";
		}

		private Cliente criarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			Contato contato= new Contato(email, telefone);
			Endereco endereco= new Endereco(rua, numero, bairro, cidade, cep);

			Cliente cliente= new Cliente(nome,cpf, contato, endereco);

			return cliente;
		}

		public Cliente buscarClienteCPF(String cpf){

			return clientes.get(cpf);
		}

		public ArrayList<Cliente> buscarClienteNome(String nome){

			return null; //rClienteNome(nome);
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

		
		private static void gerarIDCliente(){

			qntIdCliente++;
		}

//		// ----------------- obra -----------------	
//		public String cadastrarObra(String titulo, String autores, String assuntos, String editora, String observacoes){
//
//			ArrayList<String> campos= new ArrayList<String>();
//			campos.add(titulo);
//			campos.add(autores);
//			campos.add(assuntos);
//			campos.add(editora);
//			campos.add(observacoes);
//
//			gerarCodigoObra();
//			String codigo= String.valueOf(qntCodigoObra);
//			
//			if(verificarPreenchimento(campos)){
//
//				Obra nova= criarObra(codigo, titulo, autores, assuntos, editora, observacoes);
//				obras.put(codigo, nova);
//
//				return codigo;
//			}
//			return "Preencha todos os campos.";
//		} 	
//
//		private Obra criarObra(String codigo, String titulo, String autores, String assuntos, String editora, String observacoes){
//
//			Obra nova= null;
//
//			nova= new Obra(codigo, titulo, autores, assuntos, editora, observacoes);
//
//			return nova;
//		}
//
//		public Obra buscarObraCodigo(String codigo){
//
//			return obras.get(codigo);
//		}
//
//		public ArrayList<Obra> buscarObraNome(String nome){
//
//			return null;//biblioteca.buscarObraNome(nome);
//		}
//
//		public String editarObra(Obra obra, String titulo, String autores, String assuntos, String editora, String observacoes){
//
//			ArrayList<String> campos= new ArrayList<String>();
//			campos.add(titulo);
//			campos.add(autores);
//			campos.add(assuntos);
//			campos.add(editora);
//			campos.add(observacoes);
//
//			if(verificarPreenchimento(campos) && obra!= null){
//
//				obra.alterarDados(titulo, autores, assuntos, editora, observacoes);
//				return "Edicao concluida!";
//			}
//			return "Preencha todos os campos.";
//		}
//
//		public boolean excluirObra(String codigo){ 
//
//			Obra excluida= obras.get(codigo);
//
//			if(excluida.solicitarExemplares() == null){
//				obras_excluidas.put(codigo, excluida);
//				obras.remove(codigo);
//				return true;
//
//			}else
//				return false;
//		}
//
//		private static void gerarCodigoObra(){
//
//			qntCodigoObra++;
//		}
//
//		// ----------------- exemplar -----------------		
//		public String cadastrarExemplar(String edicao, String isbn, String codigoObra){
//
//			ArrayList<String> campos= new ArrayList<String>();
//			campos.add(edicao);
//			campos.add(isbn);
//			campos.add(codigoObra);
//
//			if(verificarPreenchimento(campos)){
//
//				Exemplar novo= new Exemplar(edicao, isbn);
//				obras.get(codigoObra).inserirExemplar(novo);
//
//				return novo.solicitarCodigo();
//			}
//			return "Preencha todos os campos.";
//		}
//
//		public Exemplar buscarExemplar(String codigo){ 
//
//			Integer codigoObra= pegarPrefixo(codigo);	
//			return obras.get(codigoObra).solicitarExemplar(codigo);
//		} 
//
//		public void excluirExemplar(String codigo){ 
//
//			Exemplar excluido= buscarExemplar(codigo);
//			Integer codigoObra= pegarPrefixo(codigo);
//
//			exemplares_excluidos.put(codigo, excluido);		
//			obras.get(codigoObra).removerExemplar(codigo);
//		}
//
//		private Integer pegarPrefixo(String codigo){
//
//			String[] pedacos= codigo.split("\\.");		
//			return Integer.parseInt(pedacos[0]);
//		}
//
	// -----------------
	private boolean verificarPreenchimento(ArrayList<String> campos){

			for(String campo : campos)
				if(campo.equals(""))
					return false;

			return true;
		}

}
