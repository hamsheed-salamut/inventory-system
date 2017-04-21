import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarParts {
	protected int id;
	protected String name;
	protected int qty;
	protected double price;
	
	
	public CarParts(int id, String name, int qty, double price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
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


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public int deleteDetails() throws SQLException, ClassNotFoundException {
		DBConnect.DoConnect();
		
		String sqlDelete = "DELETE FROM CarParts WHERE id = ?";
		
		PreparedStatement pstmt = DBConnect.con.prepareStatement(sqlDelete);
		
		pstmt.setInt(1, id);
		
		int deleted = pstmt.executeUpdate();
		
		pstmt.close();
		DBConnect.con.close();
		
		return deleted;
	}
}
