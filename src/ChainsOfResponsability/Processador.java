package ChainsOfResponsability;
import java.io.IOException;
import java.util.Map;

public abstract class Processador{
	
	private Processador proximoProcessador;
	
	public Processador(Processador proximoProcessador) {
		this.proximoProcessador = proximoProcessador;
	}
	
	public Processador() {
		this.proximoProcessador = new ProcessaDefault(null);
	}
	
	public byte[] processaCadeia(byte[] bytes) throws IOException {
		bytes = processaConteudo(bytes);
		if(proximoProcessador != null) {
			bytes = proximoProcessador.processaCadeia(bytes);
		}
		return bytes;
	}
	
	protected abstract byte[] processaConteudo(byte[] bytes) throws IOException;
}
