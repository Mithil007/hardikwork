/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;
import java.io.*;

/**
 *
 * @author root
 */
public class insert {
    
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String connectionstring="jdbc:mysql://localhost/myfirst?"+
                        "user=root&password=root";
    
    public static void main(String[] args)
    {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(input);
        
        
         try{
             
             Class.forName(driver);
            con=DriverManager.getConnection(connectionstring);
            
             int id=Integer.parseInt(br.readLine());
             String name=br.readLine();
             
             int count;
             
             PreparedStatement s;
             s=con.prepareStatement("insert into demo(id,name) values(?,?)");
             s.setInt(1, id);
             s.setString(2, name);
             
             count=s.executeUpdate();
             
             System.out.println(count+"rows were inserted");
         
        }catch(Exception e)
        {   
        }
    }
}
