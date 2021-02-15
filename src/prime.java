import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer :");
		int num=sc.nextInt();
		int temp;
		for(int i=2;i<num;i++)
		{
			temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp=1;
				}
			}
			if(temp==0)
				
				System.out.println(i);

		}

	}

}
