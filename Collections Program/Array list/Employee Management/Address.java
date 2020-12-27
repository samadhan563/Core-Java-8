package employee;

public class Address 
{
	private String street;
	private String city;
	private int pinCode;
	public Address(String street, String city, int pinCode) 
	{
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() 
	{
		return "street=" + street + ", city=" + city + ", pinCode=" + pinCode + "";
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public int getPinCode() 
	{
		return pinCode;
	}
	
	public void setPinCode(int pinCode) 
	{
		this.pinCode = pinCode;
	}

}
