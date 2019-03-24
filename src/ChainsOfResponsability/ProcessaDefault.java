package ChainsOfResponsability;
import java.io.IOException;

public class ProcessaDefault extends Processador {
	
	public ProcessaDefault(Processador proximo) {
		super(proximo);
	}
	
	public ProcessaDefault() {

	}

	
	@Override
	protected byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}
}
