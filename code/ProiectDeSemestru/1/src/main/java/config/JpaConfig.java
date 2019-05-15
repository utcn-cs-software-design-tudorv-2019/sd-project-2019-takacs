package config;

import javax.sql.DataSource;

public class JpaConfig {
    //@Value("${db.jdbcUrl}")
    private String jdbcUrl =  "jdbc:mysql://localhost:3306/passwordgenerator";

    //@Value("${db.username}")
    private String username = "root";

    //@Value("${db.password}")
    private String password = "";

    //@Value("${db.generateDDL}")
    private Boolean generateDDL=true;


   
   

   }

