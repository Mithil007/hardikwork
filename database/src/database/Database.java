/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;
/**
 *
 * @author root
 */
public class Database {

   
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String connectionstring="jdbc:mysql://localhost/myfirst?"+
                        "user=root&password=root";
    
    public static void main(String[] args) {
        try{
          Class.forName(driver);
          con=DriverManager.getConnection(connectionstring);
          
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery("select id,name from userTB");
          
          while(result.next())
          {
              int id=result.getInt(1);
              String name=result.getString(2);
              System.out.println(id+" : "+name);
          }
        }catch(Exception e)
        {   }
    }    
}
