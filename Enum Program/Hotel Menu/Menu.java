package enummenu;

public enum Menu 
{
	SODA(200),DOSA(50),SOUPE(70);
	
	int price;
	private Menu(int price) 
	{
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name().toLowerCase()+" @ "+price;
	}
	
}
