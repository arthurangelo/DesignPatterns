package ChainsOfResponsability;
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
		
		
		Processador processadorCompactado = new ProcessaXml();
		Processador processadorCriptografado = new ProcessaPropriedades(processadorCompactado);
		
		
		GeradorArquivo g3 = new GeradorXml(processadorCriptografado);
		g3.gerarArquivo("c:\\Gerador\\criptgrafado.zip", mapa);
		
	}
}
