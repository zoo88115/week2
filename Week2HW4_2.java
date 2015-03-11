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
		return "圓形";
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
		return "橢圓形";
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
		return "矩形";
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
		return "三角形";
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
				System.out.print("1)圓形 2)橢圓 3)矩形 4)三角形 else)結束輸入   :");
				ch=op.nextInt();
				switch(ch)
				{
					case 1:
						System.out.print("輸入半徑:");
						double r;
						r=op.nextDouble();
						if(r<=0)
						{
							System.out.println("輸入錯誤!");
						}
						else
						{
							Shape t=new Ro(r);
							arr.add(t);
						}
						break;
					case 2:
						System.out.print("輸入半徑r1,r2:");
						double rr,rr2;
						rr=op.nextDouble();
						rr2=op.nextDouble();
						if(rr<=0 || rr2<=0)
						{
							System.out.println("輸入錯誤!!");
						}
						else
						{
							Shape t=new O(rr,rr2);
							arr.add(t);
						}
						break;
					case 3:
						System.out.print("輸入邊長r1,r2:");
						double rrr,rrr2;
						rrr=op.nextDouble();
						rrr2=op.nextDouble();
						if(rrr<=0 || rrr2<=0)
						{
							System.out.println("輸入錯誤!!");
						}
						else
						{
							Shape t=new Re(rrr,rrr2);
							arr.add(t);
						}
						break;
					case 4:
						System.out.print("輸入邊長r1,r2,r3:");
						double rrrr,rrrr2,rrrr3;
						rrrr=op.nextDouble();
						rrrr2=op.nextDouble();
						rrrr3=op.nextDouble();
						if(rrrr<=0 || rrrr2<=0 || rrrr3<=0)
						{
							System.out.println("輸入錯誤!");
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
			System.out.println("\n顯示圖形及面積:");
			while(!arr.isEmpty())
			{
				Shape t=arr.remove(0);
				System.out.println("圖形:"+String.format("%-10s",t.n())+"  面積:"+String.format("%.2f",t.area()));
			}
		}
		catch(Exception e)
		{
			System.out.println("錯誤訊息:"+e);
		}
	}
}