class Bank 
{
	String name;
	long acNo;
	private double balance;
	private int pin;

	Bank(String name,long asNo,long acNo,int pin)
	{
		this.name = name;
		this.acNo = acNo;
		this.balance = balance;
		this.pin = pin;
	}

	public double getbalance()
	{
		return this.balance;
	}

	public void setbalance(double balance)
	{
		this.balance = balance;
	}

	public int getpin()
	{
		return this.pin;
	}

	public void setpin(int pin)
	{
		this.pin = pin;
	}

	public void getDetails()
	{
		System.out.println("Details Of Customer");
		System.out.println("Name :" +name+ "\nAccount No :" +acNo+ "\nBalance" +balance);
	}


}
