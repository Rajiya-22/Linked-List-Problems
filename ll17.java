package mccp;

import java.util.*;

public class ll17 {
	public static int perfect(int n)
	{
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		for(int i=4;i<=n;i++)
		{
			dp[i]=i;
			for(int j=1;j<Math.ceil(Math.sqrt(n));j++)
			{
				int t=j*j;
				if(t<=i)
				{
					dp[i]=Math.min(dp[i], 1+dp[i-t]);
				}
				else
				{
					break;
				}
			}
		}
		return dp[6];
	}
public static void main(String[] a)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print(perfect(n));
}
}
