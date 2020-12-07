package com.softserve.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        //
        String url = "jdbc:mysql://192.168.153.128:3306/company";
        String username = "lv493";
        String password = "lv493_Taqc";
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection(url, username, password);
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = con.createStatement();
        //st.execute("INSERT INTO temp (name,login,password,age) VALUES ('Mykola','Myk','qwerty',25);");
        //st.execute("DELETE FROM temp WHERE name='Petro';");
        //st.execute("UPDATE temp SET name='SuperPetro' WHERE login LIKE 'My%';");
        ResultSet rs = st.executeQuery("select * from temp;");
        int columnCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("DONE");
    }
}
