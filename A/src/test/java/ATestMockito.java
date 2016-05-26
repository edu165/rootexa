import java.io.IOException;
import java.io.Reader;
import java.net.Socket;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATestMockito {
	A clase = new A();
	@Mock
	Connection con;
	@Mock
	DatabaseMetaData dbmd;
	@Mock
	ResultSet rs;
	
	



@Mock
 private DatabaseMetaData metadata;
@Mock
private ResultSet rmd;
@Mock
private SSLSocketFactory sslFactory;
@Mock
private HttpsURLConnection connection;
@Mock
private Socket createSocket;

@Test
public void TestisAutoIncrement() throws SQLException, IOException  {
	Mockito.when(con.getMetaData()).thenReturn(dbmd);
	Mockito.when(dbmd.getIndexInfo("", "", "", true, false)).thenReturn(rs);
	Mockito.when(rs.getMetaData()).thenReturn(rmd);
	clase.isAutoIncrement(con);
}

@Test
public void  TestcreateSocket() throws SQLException, IOException  {
	Mockito.when(connection.getSSLSocketFactory()).thenReturn(sslFactory);
	Mockito.when(sslFactory.createSocket("localhost", 8080)).thenReturn(createSocket);

	clase.createSocket(connection);
}




}

