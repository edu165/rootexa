import java.io.IOException;
import java.io.Reader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ATestMockito {
	A clase = new A();

@Mock
private Connection databaseConnection;
@Mock
 private DatabaseMetaData metadata;
@Mock
private ResultSet result;


@Test
public void isAutoIncrement() throws SQLException {
	Mockito.when(databaseConnection.getMetaData()).thenReturn(metadata);
	Mockito.when(metadata.getIndexInfo("", "", "", true, false)).thenReturn(result);
	clase.isAutoIncrement(databaseConnection);
}




}

