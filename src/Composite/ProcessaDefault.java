package Composite;
import java.io.IOException;

public class ProcessaDefault implements Processador {
	@Override
	public byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}
}
