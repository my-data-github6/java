package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 13:01
 */

public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// add new candidate
	
//	// delete given candidate
//	public int deleteById(int id) throws SQLException {
//		String sql = "DELETE FROM candidates WHERE id=?";
//		try(PreparedStatement stmt = con.prepareStatement(sql)) {
//			stmt.setInt(1, id);
//			int cnt = stmt.executeUpdate();
//			return cnt;
//		} //stmt.close();
//	}
//	
//	// update candidate
//	
//	// get all candidates
//	public List<Candidate> findAll() throws SQLException {
//		List<Candidate> list = new ArrayList<>();
//		String sql = "SELECT * FROM candidates";
//		try(PreparedStatement stmt = con.prepareStatement(sql)) {
//			try(ResultSet rs = stmt.executeQuery()) {
//				while(rs.next()) {
//					int id = rs.getInt("id");
//					String name = rs.getString("name");
//					String party = rs.getString("party");
//					int votes = rs.getInt("votes");
//					Candidate c = new Candidate(id, name, party, votes);
//					list.add(c);
//				}
//			} // rs.close();
//		} // stmt.close();
//		return list;
//	}
//	
//	// increment candidate vote
//	public int incrementVote(int candidateId) throws SQLException {
//		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
//		try(PreparedStatement stmt = con.prepareStatement(sql)) {
//			stmt.setInt(1, candidateId);
//			int cnt = stmt.executeUpdate();
//			return cnt; 
//		} //stmt.close();
//	}
//	
//	// get all candidates of given party
//	public List<Candidate> findByParty(String givenParty) throws SQLException {
//		List<Candidate> list = new ArrayList<>();
//		String sql = "SELECT * FROM candidates WHERE party=?";
//		try(PreparedStatement stmt = con.prepareStatement(sql)) {
//			stmt.setString(1, givenParty);
//			try(ResultSet rs = stmt.executeQuery()) {
//				while(rs.next()) {
//					int id = rs.getInt("id");
//					String name = rs.getString("name");
//					String party = rs.getString("party");
//					int votes = rs.getInt("votes");
//					Candidate c = new Candidate(id, name, party, votes);
//					list.add(c);
//				}
//			} // rs.close();
//		} // stmt.close();
//		return list;
//	}
//	public int save(Candidate c) {
//		int cnt=0;
//		String sql="Insert into candidates values(?,?,?,?)";
//		try(PreparedStatement stmt =con.prepareStatement(sql)){
//			stmt.setInt(1,c.getId());
//			stmt.setString(2,c.getName());
//			stmt.setString(3,c.getParty());
//			stmt.setInt(4,c.getVotes());
//			cnt=stmt.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return cnt;
//	}
//	
//	int update(Candidate c) {
//		int cnt=0;
//		String sql="update candidates set name=?,party=? where id=?";
//		try(PreparedStatement stmt =con.prepareStatement(sql)){
//			
//			stmt.setString(1,c.getName());
//			stmt.setString(2,c.getParty());
//			stmt.setInt(3,c.getId());
//			cnt=stmt.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return cnt;
//	}
	List<PartyVotes> getPartywiseVotes() throws SQLException
	{
		List<PartyVotes>plist=new ArrayList<PartyVotes>();
		String sql="select party,sum(votes) from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("sum(votes)");
					PartyVotes p=new PartyVotes(party,votes);
					plist.add(p);
					
				}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			return plist;
	}
	// get partywise vote count
	}
}





