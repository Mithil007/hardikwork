/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; 
import java.sql.*;

/**
 *
 * @author root
 */
public class frame{
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String connectionstring="jdbc:mysql://localhost/myfirst?"+
                        "user=root&password=root";
    
    public static void main(String args[]){  
        Frame f=new Frame();
        Label lblid=new Label("Id :: ");
        Label lblnm=new Label("Name :: ");
        final TextField txtid=new TextField(20);
        final TextField txtnm=new TextField(20);
        Button b=new Button("Submit");  
        b.setBounds(100,90,80,30); 
        lblid.setBounds(10,10,80,30);
        lblnm.setBounds(10,50,80,30);
        txtid.setBounds(100,10,100,30);
        txtnm.setBounds(100,50,100,30);

        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
               
                int tid=Integer.parseInt(txtid.getText());
                String tnm=txtnm.getText();
                    try{
             
                        Class.forName(driver);
                        con=DriverManager.getConnection(connectionstring);

                       

                        PreparedStatement s;
                        s=con.prepareStatement("insert into demo(id,name) values(?,?)");
                        s.setInt(1, tid);
                        s.setString(2, tnm);

                        s.executeUpdate();
                        
                        txtid.setText("");
                        txtnm.setText("");
                   }catch(Exception i)
                   {   
                   }
            }  
        }); 
        f.add(b); 
        f.add(lblid);
        f.add(lblnm);
        f.add(txtid);
        f.add(txtnm);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    
    } 
}


    