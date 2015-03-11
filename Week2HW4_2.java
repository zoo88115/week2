import java.util.Scanner;
import java.util.*;
import java.lang.Object;

abstract class Shape 
{
	abstract double area();
	abstract String n();
}
class Ro extends Shape
{
	double r1;
	Ro(double r1)
	{
		this.r1=r1;
	}
	double area()
	{
		return r1*r1*3.14;
	}
	String n()
	{
		return "���";
	}
}
class O extends Shape
{
	double r1,r2;
	O(double r1,double r2)
	{
		if(r1>r2)
		{
			this.r1=r1;
			this.r2=r2;
		}
		else
		{
			this.r2=r1;
			this.r1=r2;
		}
	}
	double area()
	{
		return r1*r2*3.14;
	}
	String n()
	{
		return "����";
	}
}
class Re extends Shape
{
	double r1,r2;
	Re(double r1,double r2)
	{
		this.r1=r1;
		this.r2=r2;
	}
	double area()
	{
		return r1*r2;
	}
	String n()
	{
		return "�x��";
	}
}
class T extends Shape
{
	double r1,r2,r3;
	T(double r1,double r2,double r3)
	{
		this.r1=r1;
		this.r2=r2;
		this.r3=r3;
	}
	double area()
	{
		return Math.sqrt((r1+r2+r3)*(r1+r2-r3)*(r1+r3-r2)*(r2+r3-r1))/4;
	}
	String n()
	{
		return "�T����";
	}
}
class Week2HW4_2
{
	public static void main(String[] args)
	{
		Scanner op=new Scanner(System.in);
		ArrayList<Shape> arr=new ArrayList<Shape>();
		try{
			while(true)
			{
				int ch;
				System.out.print("1)��� 2)��� 3)�x�� 4)�T���� else)������J   :");
				ch=op.nextInt();
				switch(ch)
				{
					case 1:
						System.out.print("��J�b�|:");
						double r;
						r=op.nextDouble();
						if(r<=0)
						{
							System.out.println("��J���~!");
						}
						else
						{
							Shape t=new Ro(r);
							arr.add(t);
						}
						break;
					case 2:
						System.out.print("��J�b�|r1,r2:");
						double rr,rr2;
						rr=op.nextDouble();
						rr2=op.nextDouble();
						if(rr<=0 || rr2<=0)
						{
							System.out.println("��J���~!!");
						}
						else
						{
							Shape t=new O(rr,rr2);
							arr.add(t);
						}
						break;
					case 3:
						System.out.print("��J���r1,r2:");
						double rrr,rrr2;
						rrr=op.nextDouble();
						rrr2=op.nextDouble();
						if(rrr<=0 || rrr2<=0)
						{
							System.out.println("��J���~!!");
						}
						else
						{
							Shape t=new Re(rrr,rrr2);
							arr.add(t);
						}
						break;
					case 4:
						System.out.print("��J���r1,r2,r3:");
						double rrrr,rrrr2,rrrr3;
						rrrr=op.nextDouble();
						rrrr2=op.nextDouble();
						rrrr3=op.nextDouble();
						if(rrrr<=0 || rrrr2<=0 || rrrr3<=0)
						{
							System.out.println("��J���~!");
						}
						else
						{
							Shape t=new T(rrrr,rrrr2,rrrr3);
							arr.add(t);
						}
						break;				
					default:
						break;
				}
				if(ch!=1 && ch!=2 && ch!=3 && ch!=4)
					break;
			}
			System.out.println("\n��ܹϧΤέ��n:");
			while(!arr.isEmpty())
			{
				Shape t=arr.remove(0);
				System.out.println("�ϧ�:"+String.format("%-10s",t.n())+"  ���n:"+String.format("%.2f",t.area()));
			}
		}
		catch(Exception e)
		{
			System.out.println("���~�T��:"+e);
		}
	}
}