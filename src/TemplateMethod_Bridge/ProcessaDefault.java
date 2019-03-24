package TemplateMethod_Bridge;
import java.io.IOException;

public class ProcessaDefault implements Processador {
	@Override
	public byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}
}
