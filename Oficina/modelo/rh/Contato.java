package rh;

public class Contato {
	private String email;
    private String telefone;

    public Contato(String email, String telefone){

        this.email= email;
        this.telefone= telefone;
    }

    public String solicitarEmail(){

        return email;
    }

    public String solicitarTelefone(){

        return telefone;
    }

    public void alterarContato(String email, String telefone){
    	
    	 this.email= email;
         this.telefone= telefone;
    }
    
    public String toString(){
    	
    	return " Telefone: " + telefone + "\n E-mail: " + email;
    }

}
