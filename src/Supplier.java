import java.sql.*;

public class Supplier {
	private int id;
	private String name;
	private String companyName;
	private int phoneNum;
	
	public Supplier(int id, String name, String companyName, int phoneNum) {
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.phoneNum = phoneNum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public int saveDetails() throws SQLException, ClassNotFoundException {
		// perform save operation to db here
		DBConnect.DoConnect();
		String sqlInsert = "INSERT INTO supplier VALUES (?, ?, ?)";
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlInsert);
		
		pstmt.setString(1, name);
		pstmt.setString(2, companyName);
		pstmt.setInt(3, phoneNum);
		
		int success = pstmt.executeUpdate();
		
		pstmt.close();
		DBConnect.con.close();
		
		return success;
	}
	
	public int deleteDetails() throws SQLException, ClassNotFoundException {
		DBConnect.DoConnect();
		
		String sqlDelete = "DELETE FROM supplier WHERE id = ?";
		
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlDelete);
		
		pstmt.setInt(1, id);
		
		int deleted = pstmt.executeUpdate();
		
		pstmt.close();
		DBConnect.con.close();
		
		return deleted;
	}
	
	public void retrieveDetails() throws SQLException, ClassNotFoundException {
		DBConnect.DoConnect();
		
		String sqlGet = "SELECT * FROM supplier WHERE id = ?";
		
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlGet);
		
		pstmt.setInt(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			
			setName(rs.getString("Name"));
			setCompanyName(rs.getString("CompName"));
			setPhoneNum(rs.getInt("PhoneNum"));
			
		}
		
		rs.close();
		pstmt.close();
		DBConnect.con.close();
	}
}
