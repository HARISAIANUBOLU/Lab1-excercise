import java.util.*;
public class increasingNum {
 static boolean increNum(int n)
{
	String s=Integer.toString(n);
	char ch;
	int temp=0;
	for(int i=0;i<s.length()-1;i++)
	{
		ch=s.charAt(i);
		if(ch>s.charAt(i+1))
		{
			temp=1;
			break;
		}
	}
		if(temp==1)
		{
			return false;
		}
		else
		{
			return true;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(increNum(num)==false)
		{
			System.out.println(num+" is not a Increasing Number");
		}
		else if(increNum(num)==true)
		{
			System.out.println(num+" is a Increasing Number");
		}
		sc.close();

	}

}
