package ChainsOfResponsability;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ProcessaXml extends Processador{
	
	public ProcessaXml(Processador proximo) {
		super(proximo);
	}
	
	public ProcessaXml() {
		
	} 
	
	@Override
	protected byte[] processaConteudo(byte[] bytes) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(baos);

		zip.putNextEntry(new ZipEntry("internal"));
		zip.write(bytes);
		zip.closeEntry();
		zip.close();

		return baos.toByteArray();
	}
}
