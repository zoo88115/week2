import java.util.Scanner;
import java.util.*;

class Week2HW3_1
{
	double r;
	
	Week2HW3_1(double r)
	{
		this.r=r;
	}
	double Arc(double angle)
	{
		return 2*r*3.14*angle/360;
	}
	double 	Pie(double angle)
	{
		return  r*r*3.14*angle/360;
	}
	public static void main(String []args)
	{
		Scanner op=new Scanner(System.in);
		Week2HW3_1 []circle=new Week2HW3_1[100];
		int count=0;
		try
		{
			while(true)
			{
				System.out.print("輸入半徑: (-1 結束輸入:");
				circle[count]=new Week2HW3_1(op.nextDouble());
				if(circle[count].r==-1)
					break;
				else
					count++;
			}
			while(true)
			{
				System.out.print("1)列出所有圓 2)編號查詢圓面積弧長 else)結束   :");
				int ch=op.nextInt();
				switch(ch)
				{
					case 1:
						for(int i=0;i<count;i++)
							System.out.println("編號:"+i+"  半徑"+circle[i].r);
						break;
					case 2:
						int num;
						System.out.print("輸入編號:");
						num=op.nextInt();
						if(num>=0 && num<count)
						{
							double angle;
							System.out.print("輸入角度:");
							angle=op.nextDouble();
							if(angle>=0 && angle<=360)
							{
								System.out.println("編號:"+num+"  半徑:"+String.format("%.2f",circle[num].r)+"  面積:"+String.format("%.2f",circle[num].Pie(angle))+"  弧長:"+String.format("%.2f",circle[num].Arc(angle)));
							}
							else
								System.out.println("輸入錯誤");
						}
						else
							System.out.println("輸入錯誤");
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