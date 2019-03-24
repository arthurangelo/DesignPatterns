package Observer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorXml extends GeradorArquivo {

	

	public GeradorXml(Processador processador) {
		super(processador);
		
	}

	@Override
	protected String geraConteudo(Map<String, Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for (String prop : propriedades.keySet()) {
			propFileBuilder.append("<" + prop + ">" + propriedades.get(prop) + "</" + prop + ">");
		}
		propFileBuilder.append("</propriedades>");

		return propFileBuilder.toString();

	}
}
