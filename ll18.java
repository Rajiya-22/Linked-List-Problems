package mccp;

import java.util.*;

public class ll18 {
	public static int points(int n,int[] s,int x)
	{
		int[] dp=new int[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++)
		{
			dp[i]=0;
		}
		for(int i=0;i<x;i++)
		{
			for(int j=s[i];j<=n;j++)
			{
				
				dp[j]=Math.max(dp[j], dp[j-s[i]]+dp[j]);
//				System.out.println(dp[j-s[i]]+dp[j]);
			}
		}
//		System.out.println(dp[3]);
		return dp[n];
	}
public static void main(String[] a)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print("enter no.of scores");
	int x=sc.nextInt();
	int[] s=new int[x];
	for(int i=0;i<x;i++)
	{
		s[i]=sc.nextInt();
	}
	System.out.print(points(n,s,x));
}
}
