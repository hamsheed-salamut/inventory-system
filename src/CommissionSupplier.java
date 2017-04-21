import java.sql.*;

public class CommissionSupplier extends Supplier {

	private double commissionPrice;

	public CommissionSupplier(int id, String name, String companyName, int phoneNum, double commissionPrice) {
		super(id, name, companyName, phoneNum);
		this.commissionPrice = commissionPrice;
	}

	public double getCommissionPrice() {
		return commissionPrice;
	}

	public void setCommissionPrice(double commissionPrice) {
		this.commissionPrice = commissionPrice;
	}
	
	public int saveDetails() throws SQLException, ClassNotFoundException {
		
		DBConnect.DoConnect();
		
		String sqlInsert = "INSERT INTO supplier VALUES (?, ?, ?, ?)";
		
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlInsert);
		
		pstmt.setString(1, super.getName());
		pstmt.setString(2, super.getCompanyName());
		pstmt.setInt(3, super.getPhoneNum());
		pstmt.setDouble(4, commissionPrice);
		
		int success = pstmt.executeUpdate();
		
		pstmt.close();
		
		return success;
	}
}
