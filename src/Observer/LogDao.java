package Observer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogDao {
	public void salvar(Log log) throws SQLException, ClassNotFoundException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test");
		Class.forName("com.mysql.jdbc.Driver");
		PreparedStatement ps = con.prepareStatement("insert into log(titulo,tipo,valor) values(?,?,?)");
		ps.setString(1, log.getTitulo());
		ps.setString(2, log.getTipo());
		ps.setString(3, log.getValor());
		ps.execute();
	}
}
