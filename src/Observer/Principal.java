package Observer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws IOException{
		Map<String,Object> mapa = new HashMap<>();
		mapa.put("nome", "Arthur");
		mapa.put("idade", "27");
		
		List<Processador> processadores1 = new ArrayList<Processador>();
		processadores1.add(new ProcessaPropriedades());
		processadores1.add(new ProcessaXml());
		
		List<Processador> processadores2 = new ArrayList<Processador>();
		processadores2.add(new ProcessaXml());
		processadores2.add(new ProcessaPropriedades());
		
		List<Processador> processadores3 = new ArrayList<Processador>();
		processadores3.add(new ProcessaDefault());
		processadores3.add(new ProcessaXml());
		
		
		GeradorArquivo g1 = new GeradorPropriedades(new ProcessadorComposto(processadores1));
		g1.addObservador(new LogService());
		g1.addObservador(new LogBo());
		g1.gerarArquivo("c:\\Gerador\\compactadoZipado.zip", mapa);
		
		GeradorArquivo g2 = new GeradorXml(new ProcessadorComposto(processadores2));
		g2.gerarArquivo("c:\\Gerador\\zipadoCriptografado.txt", mapa);
		
		GeradorArquivo g3 = new GeradorXml(new ProcessadorComposto(processadores3));
		g3.gerarArquivo("c:\\Gerador\\default.zip", mapa);
		
	}
}
