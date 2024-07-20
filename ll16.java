package mccp;

import java.util.*;
public class ll16 {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static Node head1=null;
	public static Node head2=null;
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
		ll16 l=new ll16();
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n1;i++) 
			head1=l.insert(sc.nextInt(),head1);
		System.out.println("enter n2");
		int n2=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n2;i++) 
			head2=l.insert(sc.nextInt(),head2);
		System.out.print(identical(head1,n1,head2,n2));
	}
	private static boolean identical(Node head1,int n1,Node head2,int n2) {
		// TODO Auto-generated method stub
		if(n1!=n2)
		{
			return false;
		}
		else
		{
			while(head1!=null)
			{
				if(head1.data!=head2.data)
				{
					return false;
				}
				head1=head1.next;
				head2=head2.next;
			}
		}
		return true;
	}
	private static void display(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}