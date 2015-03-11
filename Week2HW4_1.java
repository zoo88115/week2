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
				System.out.print("輸入橢圓邊長 r1,r2 (輸入-1 -1   結束輸入:");
				t1=op.nextDouble();
				t2=op.nextDouble();
				if(t1==-1 && t2==-1)
					break;
				else if(t1<=0 || t2<=0)
				{
					System.out.println("輸入錯誤!!");
				}
				else
				{
					o[count]=new Oval(t1,t2);
					count++;
				}
			}
			while(true)
			{
				System.out.print("1)查詢所有橢圓資料 2)編號查詢橢圓面積 周長 else)結束");
				int ch;
				ch=op.nextInt();
				switch(ch)
				{
					case 1:
					for(int i=0;i<count;i++)
						System.out.println("編號:"+i+"  半徑r1:"+o[i].r1+"  半徑r2:"+o[i].r2);
						break;
					case 2:
						System.out.print("輸入編號:");
						int num;
						num=op.nextInt();
						System.out.println("編號:"+num+"  面積:"+String.format("%.2f",o[num].Pie())+"  周長:"+String.format("%.2f",o[num].Arc()));
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
			System.out.println("錯誤訊息:"+e);
		}
	}
}