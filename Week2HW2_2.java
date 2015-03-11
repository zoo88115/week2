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
				System.out.println("請輸入兩個浮點數:");
				num[0]=op.nextDouble();
				num[1]=op.nextDouble();
				System.out.print("選擇四則運算 1)+ 2)- 3)* 4)/  :");
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
							System.out.println("輸入錯誤，除數不可為0");
						}
						else
						{
							num[2]=num[0]/num[1];
							System.out.println(num[0]+"/"+num[1]+"="+num[2]);
						}
						break;
					default:
						System.out.println("輸入錯誤");
				}
			}
			catch(Exception e)
			{
				System.out.println("錯誤訊息:"+e);
			}
		}
}
