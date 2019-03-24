package TemplateMethod_Bridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws IOException{
		Map<String,Object> mapa = new HashMap<>();
		mapa.put("nome", "Arthur");
		mapa.put("idade", "27");
		
		GeradorArquivo g1 = new GeradorPropriedades(new ProcessaPropriedades());
		g1.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
		
		GeradorArquivo g2 = new GeradorXml(new ProcessaXml());
		g2.gerarArquivo("c:\\Gerador\\XML.zip", mapa);
		
		GeradorArquivo g3 = new GeradorXml(new ProcessaDefault());
		g3.gerarArquivo("c:\\Gerador\\default.txt", mapa);
		
	}
}
