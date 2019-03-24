package ChainsOfResponsability;

import java.util.Map;

public class ProcessaPropriedades extends Processador {

	public ProcessaPropriedades(Processador proximo) {
		super(proximo);
	}

	public ProcessaPropriedades() {

	}

	@Override
	protected byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + 10) % Byte.MAX_VALUE);
		}

		return newBytes;
	}

}
