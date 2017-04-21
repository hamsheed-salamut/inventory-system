import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InteriorParts extends CarParts {
	private String materialType;
	
	public InteriorParts(int id, String name, int qty, double price, String materialType) {
		
		super(id, name, qty, price);
		this.materialType = materialType;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	public int saveDetails() throws SQLException, ClassNotFoundException {
		// perform save operation to db here
		DBConnect.DoConnect();
		String sqlInsert = "INSERT INTO CarParts VALUES (?, ?, ?, ?, ?)";
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlInsert);
		
		pstmt.setString(1, name);
		pstmt.setInt(2, qty);
		pstmt.setDouble(3, price);
		pstmt.setString(4, materialType);
		
		int success = pstmt.executeUpdate();
		
		pstmt.close();
		DBConnect.con.close();
		
		return success;
	}
	

	
}
