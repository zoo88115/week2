import java.util.Scanner;

class Week2HW2_2
{
		public static void main(String []args)
		{
			Scanner op = new Scanner(System.in);
			
			double num[]={0,0,0};
			int ch;
			
			try
			{
				System.out.println("�п�J��ӯB�I��:");
				num[0]=op.nextDouble();
				num[1]=op.nextDouble();
				System.out.print("��ܥ|�h�B�� 1)+ 2)- 3)* 4)/  :");
				ch=op.nextInt();
				switch(ch)
				{
					case 1:
						num[2]=num[0]+num[1];
						System.out.println(num[0]+"+"+num[1]+"="+num[2]);
						break;
					case 2:
						num[2]=num[0]-num[1];
						System.out.println(num[0]+"-"+num[1]+"="+num[2]);
						break;
					case 3:
						num[2]=num[0]*num[1];
						System.out.println(num[0]+"*"+num[1]+"="+num[2]);
						break;
					case 4:
						if(num[1]==0)
						{
							System.out.println("��J���~�A���Ƥ��i��0");
						}
						else
						{
							num[2]=num[0]/num[1];
							System.out.println(num[0]+"/"+num[1]+"="+num[2]);
						}
						break;
					default:
						System.out.println("��J���~");
				}
			}
			catch(Exception e)
			{
				System.out.println("���~�T��:"+e);
			}
		}
}
