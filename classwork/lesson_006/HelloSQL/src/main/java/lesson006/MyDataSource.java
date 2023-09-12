package lesson006;

import javax.sql.DataSource;
import org.postgresql.ds.PGSimpleDataSource;

public class MyDataSource {
  static DataSource dataSource;

  public static DataSource getDataSource(){
    if(dataSource== null){
      PGSimpleDataSource pgds = new PGSimpleDataSource();
      pgds.setServerName("localhost");
      pgds.setDatabaseName("cohort26");
      pgds.setUser("postgres");
      pgds.setPassword("root");
      dataSource = pgds;
    }
    return dataSource;
  }

}
