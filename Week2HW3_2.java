import java.util.Scanner;
import java.util.*;

class Week2HW3_2
{
	int y,m,d;
	Week2HW3_2(int y,int m,int d)
	{
		this.y=y;
		this.m=m;
		this.d=d;
	}
	void test()
	{
		if((y <= 0) || (m < 1 || m > 12) || (d < 1 || d > 31))
		{
			System.out.println("��J���~");
		}
		else
		{
			if(m == 4 || m == 6 || m == 9 || m == 11)
			{
				if(d > 30)
				{
					System.out.println("��J���~");
				}
				else
				{
					System.out.println("��J���T");
					System.out.println("�~:" + y + "  ��:" + m + "  ��:" + d);
				}
			}
			else if(m == 2)
			{
				if((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) && d > 29)
				{
					System.out.println("��J���~");
				}
				else if((y % 400 != 0 && (y % 4 != 0 || y % 100 == 0)) && d > 28)
				{
					System.out.println("��J���~");
				}
				else
				{
					System.out.println("��J���T");
					System.out.println("�~:" + y + "  ��:" + m + "  ��:" + d);
				}
			}
			else
			{
				System.out.println("��J���T");
				System.out.println("�~:" + y + "  ��:" + m + "  ��:" + d);
			}

		}

	}
	public static void main(String []args)
	{
		Scanner op=new Scanner(System.in);
		try
		{
			int y,m,d;
			System.out.print("��J�~ �� �� :");
			y=op.nextInt();
			m=op.nextInt();
			d=op.nextInt();
			Week2HW3_2 ymd=new Week2HW3_2(y,m,d);
			ymd.test();
		}
		catch(Exception e)
		{
			System.out.println("���~�T��:"+e);
		}
	}
}