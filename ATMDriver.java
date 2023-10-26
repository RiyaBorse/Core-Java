import java.util.*;
class ATMDriver
{
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) 
	{
		Bank c1 = new Bank("Riya",1011,500,5828);
		ATM a = new ATMChild();
		boolean b = true;
		while (b)
		{
			System.out.println("Enter 1 for withdraw /n Enter 2 for deposite /n Enter 3 for check balance /n Enter 4 for change pin /n Enter 5 for details");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
				a.withdraw(c1);
			break;
			case 2:
				a.deposite(c1);
			break;
			case 3:
				a.checkBalance(c1);
			break;
			case 4:
				a.changePin(c1);
			break;
			case 5:
				a.details(c1);
			break;
			default:
				System.out.println("Choose correct option");
			}
			System.out.println("Do you want to continue operation press 1 & for exit press 2");
			int v = scan.nextInt();
			if (v!=1)
			{
				b=false;
			}
		}
	}
}
