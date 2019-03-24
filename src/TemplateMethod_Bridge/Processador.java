package TemplateMethod_Bridge;
import java.io.IOException;
import java.util.Map;

public interface Processador{
	public byte[] processaConteudo(byte[] bytes) throws IOException;
}
