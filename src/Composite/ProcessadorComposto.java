package Composite;

import java.io.IOException;
import java.util.List;

public class ProcessadorComposto implements Processador{
	
	List<Processador> processadores;
	
	public ProcessadorComposto(List<Processador> processadores) {
		this.processadores = processadores;
	}

	@Override
	public byte[] processaConteudo(byte[] bytes) throws IOException {
		for(Processador processador : this.processadores) {
			bytes = processador.processaConteudo(bytes);
		}
		
		return bytes;
	}

}
