package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Products {
	public Products() {

	}

	public void delete(String masp) {

	}

	public void insert(String maSP, String tenSP, float gia) {

	}

	public void update(String maSP, String tenSP, float gia) {

	}

	public List<Product> showProduct(String type) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBanHang";
			Connection con = DriverManager.getConnection(url, "sa", "123456789");
			String sql = "SELECT * FROM Product";
			if (!type.equals("")) {
				sql += " WHERE type LIKE '%" + type + "%'";
			}
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String price = rs.getString("Price");
				Product sp = new Product(code,name,price);
				list.add(sp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
         public List<Product> showProductListTop(){
             try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBanHang";
			Connection con = DriverManager.getConnection(url, "sa", "123456789");
			String sql = "SELECT top 5 FROM Product";
			
				sql += "group by Code order by id desc";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String price = rs.getString("Price");
				Product sp = new Product(code,name,price);
				list.add(sp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
         }
}
