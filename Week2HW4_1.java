import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.text.*;

class Circle
{
	double r1;
	Circle(double r1)
	{
		this.r1 = r1;
	}
	double Pie()
	{
		return r1*r1*3.14;
	}
	double Arc()
	{
		return 2*r1*3.14;
	}
}

class Oval extends Circle
{
	double r2;
	Oval(double r1,double r2)
	{
		super(r1);
		this.r2=r2;
		if(this.r1<this.r2)
		{
			double t=this.r1;
			this.r1=this.r2;
			this.r2=t;
		}
	}
	double Pie()
	{
		return r1*r2*3.14;
	}
	double Arc()
	{
		return 2*3.14*r2+4*(r1-r2);
	}
}

class Week2HW4_1
{
	public static void main(String []args)
	{
		Scanner op=new Scanner(System.in);
		Oval []o=new Oval[100];
		int count=0;
		double t1,t2;
		try{
			while(true)
			{
				System.out.print("��J������ r1,r2 (��J-1 -1   ������J:");
				t1=op.nextDouble();
				t2=op.nextDouble();
				if(t1==-1 && t2==-1)
					break;
				else if(t1<=0 || t2<=0)
				{
					System.out.println("��J���~!!");
				}
				else
				{
					o[count]=new Oval(t1,t2);
					count++;
				}
			}
			while(true)
			{
				System.out.print("1)�d�ߩҦ������ 2)�s���d�߾�ꭱ�n �P�� else)����");
				int ch;
				ch=op.nextInt();
				switch(ch)
				{
					case 1:
					for(int i=0;i<count;i++)
						System.out.println("�s��:"+i+"  �b�|r1:"+o[i].r1+"  �b�|r2:"+o[i].r2);
						break;
					case 2:
						System.out.print("��J�s��:");
						int num;
						num=op.nextInt();
						System.out.println("�s��:"+num+"  ���n:"+String.format("%.2f",o[num].Pie())+"  �P��:"+String.format("%.2f",o[num].Arc()));
						break;
					default:
						break;
				}
				if(ch!=1 && ch!=2)
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println("���~�T��:"+e);
		}
	}
}