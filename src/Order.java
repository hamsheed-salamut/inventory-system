import java.util.Date;

public class Order {
	private int ordId;
	private String prodName;
	private Date ordDate;
	private int qty;
	private double prodPrice;
	private int supId;
	private Date issueDate;
	
	public Order(int ordId, String prodName, Date ordDate, int qty, double prodPrice, int supId) {
		this.ordId = ordId;
		this.prodName = prodName;
		this.ordDate = ordDate;
		this.qty = qty;
		this.prodPrice = prodPrice;
		this.supId = supId;
	}
	
	
	
	public Date getIssueDate() {
		return issueDate;
	}



	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}



	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	
	
}
