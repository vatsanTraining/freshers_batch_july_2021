package com.training.demo.repos;

import java.util.Collection;
import java.sql.*;
import com.trainig.demo.entity.CabDriver;

public class CabDriverRepoImpl implements Repository<CabDriver> {

	private Connection con;
	
	
	public CabDriverRepoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Collection<CabDriver> findAll() {
		return null;
	}

	@Override
	public boolean add(CabDriver t) {

		boolean result = false;
		String sql = "insert into cabdriver2 values(?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getDriverId());
			pstmt.setString(2, t.getDriverName());
			pstmt.setDouble(3, t.getRating());
			
			int rowsAdded = pstmt.executeUpdate();
			
			if(rowsAdded==1) {
				result =true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

}
