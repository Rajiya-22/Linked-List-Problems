package mccp;

import java.util.*;

public class ll8 {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static Node head=null;
	public static Node t1=null;
	public static Node t2=null;
	private Node insert(int ele,Node head) {
		// TODO Auto-generated method stub
		Node temp=new Node(ele);
		Node p=head;
		if(head==null)
			head=temp;
		else {
		while(p.next!=null) {
			p=p.next;
		}
		p.next=temp;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ll8 l=new ll8();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.println("enter nth");
		int x=sc.nextInt();
		System.out.print(segregate(head));
	}
	private static int segregate(Node head) {
		// TODO Auto-generated method stub
		Node p1=head;
		Node tail1=null,tail2=null;
		while(p1!=null)
		{
			int data=p1.data;
			if(p1.data%2==0)
			{
				if(t1==null)
				{
					t1=t;
					tail1=t;
				}
				else
				{
					t1.next=t;
					tail1=t;
				}
			}
			else
			{
				
			}
		}
		return p1.data;
	}
}