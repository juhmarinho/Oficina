package rh;

public class Endereco {

	private String rua;
	   private String numero;
	   private String bairro;
	   private String cidade;
	   private String cep;

	    public Endereco(String rua, String numero, String bairro, String cidade, String cep){

	        this.rua= rua;
	        this.numero= numero;
	        this.bairro= bairro;
	        this.cidade= cidade;
	        this.cep= cep;
	    }

	    public String solicitarRua(){

	        return rua;
	    }

	    public String solicitarNumero(){

	        return numero;
	    }

	    public String solicitarBairro(){

	        return bairro;
	    }

	    public String solicitarCidade(){

	        return cidade;
	    }
	    
	    public String solicitarCep(){

	        return cep;
	    }

	    public void alterarEndereco(String rua, String numero, String bairro, String cidade, String cep){
	    	
	    	 this.rua= rua;
	         this.numero= numero;
	         this.bairro= bairro;
	         this.cidade= cidade;
	         this.cep= cep;
	    }
	    
	    public String toString(){
	    	
	    	return " " + rua + ", " + numero + ". " + bairro + ", " + cidade + " - " + cep;
	    }
}
