package Observer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private Processador processador;
	private List<Observador> observadores;
	
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
		this.observadores = new ArrayList<>();
	}
	
	public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws IOException {
		
		String conteudo = geraConteudo(propriedades);
		byte[] bytes = this.processador.processaConteudo(conteudo.getBytes());
		
		FileOutputStream out = new FileOutputStream(nome);
		out.write(bytes);
		out.close();
		notificar(nome,conteudo);
	}
	
	public void notificar(String nomeArquivo, String conteudo) {
		for(Observador observador : observadores) {
			observador.novoArquivoGerado(nomeArquivo, conteudo);
		}
	}
	
	public void addObservador(Observador observador) {
		observadores.add(observador);
	}
	
	protected abstract String geraConteudo( Map<String, Object> propriedades);
	

}
