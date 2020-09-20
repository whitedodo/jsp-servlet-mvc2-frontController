package com.eduJsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eduJsp.vo.AddressVO;

public class AddressDAO {

    public AddressVO selectAddress(Integer num) {

    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	
    	AddressVO node = new AddressVO();
    	
    	String sql = "select NUM, NAME, ADDRESS, BIRTHDATE " +
    					  " from addressbook" + 
    					  " where num=?";
		
    	System.out.println(sql);
    	
    	// 달력 날짜 출력 버그 개선
    	
    	try {
    		//conn = session.connect();
    		
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setInt(1, num);
    		
    		rs = pstmt.executeQuery();
    		
    		if ( rs.next() ) {
    			node.setNum(rs.getInt(1));
    			node.setName(rs.getNString(2));
    			node.setAddress(rs.getNString(3));
    			node.setBirthdate(rs.getDate(4));
    		}
    		
    		
    	}catch(Exception ex) {
    		System.out.println("오류 발생: " + ex);
    	}
    	finally {
    		// session.close(conn, pstmt, rs);			
    	}
    	
        return node;

    }
	
}
