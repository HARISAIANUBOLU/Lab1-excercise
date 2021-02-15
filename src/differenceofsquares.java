import java.util.*;
public class differenceofsquares {
	static int diff(int n)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=(i*i);
			sum2+=i;
		}
		int difference=sum1-(sum2*sum2);
		return difference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(diff(num));
		sc.close();
		

	}

}
