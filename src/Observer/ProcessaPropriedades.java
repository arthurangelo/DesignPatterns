package Observer;
import java.util.Map;

public class ProcessaPropriedades implements Processador {
	@Override
	public byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for(int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
		}
		
		return newBytes;
	}

	
}
