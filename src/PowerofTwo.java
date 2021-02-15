import java.util.Scanner;

public class PowerofTwo {
	static boolean checknumber(int n)
	{
		if (n==0)
			return false;
		while (n !=1)
		{
			if (n%2 != 0)
				return false;
			n=n/2;
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer :");
		int num=sc.nextInt();
		
		if(checknumber(num)) {
			
			System.out.println(num+" is power of two");
		}
		else {
			System.out.println(num+" is not power of two");
			
		}
			
		sc.close();
		

	}

}
