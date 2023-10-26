import java.util.*;
class ATMChild implements ATM
{
	Scanner scan = new Scanner(System.in);

	public void withdraw(Bank b)
	{
		boolean condition = true;
		while (condition)
		{
			System.out.println("Enter the pin");
			int pin = scan.nextInt();
			if (b.getpin() == pin)
			{
				System.out.println("Enter ammount to be withdraw");
				int amount = scan.nextInt();
				if (b.getbalance () >= amount)
				{
					b.setbalance(b.getbalance() - amount);
					System.out.println("Your transaction of RS." +amount+ "is successful");
					condition = false;
				}
				else
				{
					System.out.println("Insufficient Funds");
				}
			}
			else
			{
				System.out.println("Eter wrong pin");
			}
		}
	}

		public void deposite(Bank b)
		{
			boolean condition = true;
			while (condition)
			{
				System.out.println("Enter the pin");
				int pin = scan.nextInt();
				if (b.getpin()==pin)
				{
					System.out.println("Enter amount to be deposited");
					int amount = scan.nextInt();
					b.setbalance (b.getbalance() + amount);
					System.out.println("Your transaction is successfull \nRS." +amount+ "Credited to your account number:" +b.acNo);
					System.out.println("Your current account balance is:" +b.getbalance());
					condition = false;
				}
				else
				{
					System.out.println("Enter the wrong pin");
				}
		}
		}

		public void checkBalance(Bank b)
		{
			boolean condition = true;
			while (condition)
			{
				System.out.println("Enter the pin");
				int pin = scan.nextInt();
				if (b.getpin()==pin)
				{
					System.out.println("Your account balance is" +b.getbalance());
					condition = false;
				}
				else
				{
					System.out.println("Entered wrong pin");
				}
			}
		}

		public void changePin(Bank b)
		{
			boolean condition = true;
			while (condition)
			{
				System.out.println("Enter your pin");
				int pin = scan.nextInt();
				if (b.getpin() == pin)
				{
						System.out.println("Enter your old pin");
					int oldpin = scan.nextInt();
					if (b.getpin()==oldpin)
					{
						boolean c2 = true;
						while (c2)
						{
							System.out.println("Enter new pin");
							int newpin = scan.nextInt();
							System.out.println("Re-enter new pin");
							int newpin1 = scan.nextInt();
							if (newpin == newpin1)
							{
								b.setpin(newpin);
								c2 = false;
								condition = false;
								System.out.println("Pin successfully changed");
							}
							else
							{
								System.out.println("New pin is not matched");
							}
						}
					}
					else
					{
						System.out.println("Old pin is not matching");
					}
				}
				else
				{
						System.out.println("Entered wrong pin");
				}
			}
		}
		

		public void details(Bank b)
		{
			boolean condition = true;
			while (condition)
			{
				System.out.println("Enter the pin");
				int pin = scan.nextInt();
				if (b.getpin() == pin)
				{
					b.getDetails();
					condition = false;
				}
				else 
				{
					System.out.println("Entered wrong pin");
				}
			}
		}
	}
