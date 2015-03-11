import java.util.Scanner;

class Week2HW2_4
{
		public static void main(String []args)
		{
			Scanner op = new Scanner(System.in);
			try
			{
				String[] name = new String[100];
				int[] grade = new int[100];
				int count=0;
				System.out.println("輸入姓名 成績，輸入-1 -1為停止輸入:");
				while(true)
				{
					System.out.print("姓名:");
					name[count]=op.next();
					System.out.print("成績:");
					grade[count]=op.nextInt();
					if(name[count].equals("-1")==true && grade[count]==-1)
					{
						break;
					}
					else
						count++;
				}
				while(true)
				{
					int ch;
					System.out.print("輸入: 1)顯示全部資料 2)編號查詢資料  else)結束  :");
					ch=op.nextInt();
					switch(ch)
					{
						case 1:
							for(int i=0;i<count;i++)
							{
								System.out.println("編號"+i+"\t姓名:"+name[i]+"\t成績:"+grade[i]);
							}
							break;
						case 2:
							int cnum;
							System.out.print("輸入編號:");
							cnum=op.nextInt();
							System.out.println("編號"+cnum+"\t姓名:"+name[cnum]+"\t成績:"+grade[cnum]);
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
