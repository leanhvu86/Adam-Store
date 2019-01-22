/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.LoginDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Win
 */
public class LoginDAOimpl implements LoginDAO{

    @Override
    public boolean checkAdmin(String username, String password) {
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url="jdbc:sqlserver://localhost:1433;databaseName=QLBanHang";
           Connection con=DriverManager.getConnection(url,"sa","123456789");
           String sql="select * from Employee where username = ? and password = ?";
           PreparedStatement pa=con.prepareStatement(sql);
           pa.setString(1, username);
           pa.setString(2, password);
           System.out.println(sql);
           ResultSet ss=pa.executeQuery();
           boolean result=ss.next();
           ss.close();
           pa.close();
           con.close();
           if(result){
               return true;
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return false;
    }
    
}
