import java.sql.SQLException;

public class AgencySupplier extends Supplier{

	public AgencySupplier(int id, String name, String companyName, int phoneNum) {
		super(id, name, companyName, phoneNum);
		
	}
	
	public int saveDetails() throws SQLException, ClassNotFoundException {
		
		return super.saveDetails();
	
	}
	
	public int deleteDetails() throws SQLException, ClassNotFoundException {
		
		return super.deleteDetails();
	}
	
	public void retrieveDetails() throws SQLException, ClassNotFoundException {
		
		super.retrieveDetails();
	}
}                                          
