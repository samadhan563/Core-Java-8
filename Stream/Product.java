package product;

public class Product 
{
	private int productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	
	public Product(int productId, String productName, String productCategory, double productPrice) 
	{
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	
	
	public int getProductId() 
	{
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public double getProductPrice() 
	{
		return productPrice;
	}

	public void setProductPrice(double productPrice) 
	{
		this.productPrice = productPrice;
	}

	public String getProductCategory() 
	{
		return productCategory;
	}

	public void setProductCategory(String productCategory) 
	{
		this.productCategory = productCategory;
	}
	
}
