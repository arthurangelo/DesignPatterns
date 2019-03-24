package TemplateMethod_Bridge;
import java.util.Map;

public class GeradorPropriedades extends GeradorArquivo {
	
	public GeradorPropriedades(Processador processador) {
		super(processador);
		
	}

	@Override
	protected String geraConteudo(Map<String,Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		for(String prop : propriedades.keySet()) {
			propFileBuilder.append(prop + "=" + propriedades.get(prop)+"\n");
		}
		return propFileBuilder.toString();
	}
	
	

}
