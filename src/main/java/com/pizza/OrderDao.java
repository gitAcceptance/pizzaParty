package com.pizza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDao {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void orderPizza(String uname, String description) {
		Connection conn= cf.getConnection();
		String sql="{CALL INSERT_ORDER(?,?,?)";
		try {
			CallableStatement call = conn.prepareCall(sql);
			call.setString(1,uname);
			call.setString(2, description);
			call.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkLogin(String uname, String pword) throws SQLException {
		String pwordFromDatabase="";
		Connection conn = cf.getConnection();
		String sql = "SELECT user_password FROM login WHERE USERNAME=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pwordFromDatabase =rs.getString(1);
				if(pword.equals(pwordFromDatabase)) {
					  return true;
				  }
				else {
					return false;
				}
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public void updateStatus() {
		
	}
	
	public ArrayList<Order> getOrders(String uname) {
		ArrayList<Order> orderList = new ArrayList<Order> ();
		Connection conn= cf.getConnection();
		String sql ="select * from orders where username=?"; 
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery(); 
			Order a =null;
			while(rs.next()) {
				a=new Order(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4));
				orderList.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		return orderList;
		
	}
	
	
	
}
