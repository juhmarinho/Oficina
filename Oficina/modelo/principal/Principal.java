package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oficina oficina =Oficina.solicitaInstancia();
		
		
		oficina.cadastrarCliente("Juliane", "456", "ju@ju.com", "2777", "rua a", "2", "Sara", "25212240", "DC");
		//System.out.println(oficina.buscarCliente("1234"));
		//System.out.println(oficina.buscarCliente("456"));
		System.out.println(oficina.buscarCarroPlaca("LKZ2704"));
	}

}
