package oficina;
import java.util.ArrayList;
import java.util.Collection;




public enum QuantidadeTanque {
	RESERVA, UMQUARTO,METADE,TRESQUARTOS,CHEIO;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Collection valores()
	{
		@SuppressWarnings("rawtypes")
		Collection valors =new ArrayList();
		for (QuantidadeTanque valor : QuantidadeTanque.values())
		{
			valors.add(valor.name());
		}
		return valors;

	}

}