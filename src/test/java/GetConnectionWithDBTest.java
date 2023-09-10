import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task4.connection.GetConnectionWithDB;

import java.sql.Connection;


public class GetConnectionWithDBTest {
    @Test
    void getConnectionTest(){
        GetConnectionWithDB getConnectionWithDB = new GetConnectionWithDB();
        Assertions.assertInstanceOf(Connection.class, getConnectionWithDB.getConnection());
    }
}
