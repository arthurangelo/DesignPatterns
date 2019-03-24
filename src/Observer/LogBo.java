package Observer;

public class LogBo implements Observador {

	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		LogDao logDao = new LogDao();
		Log log = new Log();
		log.setTipo("Arquivo");
		log.setTitulo(nomeArquivo);
		log.setValor(conteudo);
		try {
			logDao.salvar(log);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
