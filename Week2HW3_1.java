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
				System.out.print("��J�b�|: (-1 ������J:");
				circle[count]=new Week2HW3_1(op.nextDouble());
				if(circle[count].r==-1)
					break;
				else
					count++;
			}
			while(true)
			{
				System.out.print("1)�C�X�Ҧ��� 2)�s���d�߶ꭱ�n���� else)����   :");
				int ch=op.nextInt();
				switch(ch)
				{
					case 1:
						for(int i=0;i<count;i++)
							System.out.println("�s��:"+i+"  �b�|"+circle[i].r);
						break;
					case 2:
						int num;
						System.out.print("��J�s��:");
						num=op.nextInt();
						if(num>=0 && num<count)
						{
							double angle;
							System.out.print("��J����:");
							angle=op.nextDouble();
							if(angle>=0 && angle<=360)
							{
								System.out.println("�s��:"+num+"  �b�|:"+String.format("%.2f",circle[num].r)+"  ���n:"+String.format("%.2f",circle[num].Pie(angle))+"  ����:"+String.format("%.2f",circle[num].Arc(angle)));
							}
							else
								System.out.println("��J���~");
						}
						else
							System.out.println("��J���~");
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