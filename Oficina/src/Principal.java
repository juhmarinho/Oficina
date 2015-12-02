
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oficina oficina = null;
		Oficina.solicitaInstancia();
		//oficina.cadastrarCliente(nome, cpf, email, telefone, rua, numero, bairro, cep, cidade);
		
		oficina.cadastrarCliente("Larissa","1234","lala@ferrarez.com","2323","Rua","Numero","Bairro","cep","cidade");
		oficina.buscarClienteNome("Larissa");
	}

}
