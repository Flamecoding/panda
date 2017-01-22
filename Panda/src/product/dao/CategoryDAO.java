package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import product.db.ConnectionPoolBean;

public class CategoryDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	private ConnectionPoolBean pool;
	
	public ConnectionPoolBean getPool() {
		return pool;
	}
	public void setPool(ConnectionPoolBean pool) {
		this.pool = pool;
	}
}
