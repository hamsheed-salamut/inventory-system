import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExteriorParts extends CarParts {

	private String paintColor;
	private String headlightsType;
	
	public ExteriorParts(int id, String name, int qty, double price, String paintColor, String headlightsType) {
		super(id, name, qty, price);
		this.paintColor = paintColor;
		this.headlightsType = headlightsType;
	}

	public String getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}

	public String getHeadlightsType() {
		return headlightsType;
	}

	public void setHeadlightsType(String headlightsType) {
		this.headlightsType = headlightsType;
	}
	
	public int saveDetails() throws SQLException, ClassNotFoundException {
		// perform save operation to db here
		DBConnect.DoConnect();
		String sqlInsert = "INSERT INTO CarParts VALUES (?, ?, ?, ?, ?)";
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlInsert);
		
		pstmt.setString(1, name);
		pstmt.setInt(2, qty);
		pstmt.setDouble(3, price);
		pstmt.setString(4, paintColor);
		pstmt.setString(5, headlightsType);
		
		int success = pstmt.executeUpdate();
		
		pstmt.close();
		DBConnect.con.close();
		
		return success;
	}
	
	
}
