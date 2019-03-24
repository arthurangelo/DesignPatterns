package Observer;

public class LogService implements Observador{

	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		System.out.println("Arquivo gerado de nome: " + nomeArquivo+" e conteúdo: "+ conteudo);
		
	}

}
