package TemplateMethod_Bridge;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private Processador processador;
	
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
	}
	
	public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws IOException {
		
		String conteudo = geraConteudo(propriedades);
		byte[] bytes = this.processador.processaConteudo(conteudo.getBytes());
		
		FileOutputStream out = new FileOutputStream(nome);
		out.write(bytes);
		out.close();
	}
	
	protected abstract String geraConteudo( Map<String, Object> propriedades);
	

}
