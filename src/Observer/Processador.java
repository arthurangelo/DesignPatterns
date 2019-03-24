package Observer;
import java.io.IOException;
import java.util.Map;

public interface Processador{
	public byte[] processaConteudo(byte[] bytes) throws IOException;
}
