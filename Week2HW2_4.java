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
				System.out.println("��J�m�W ���Z�A��J-1 -1�������J:");
				while(true)
				{
					System.out.print("�m�W:");
					name[count]=op.next();
					System.out.print("���Z:");
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
					System.out.print("��J: 1)��ܥ������ 2)�s���d�߸��  else)����  :");
					ch=op.nextInt();
					switch(ch)
					{
						case 1:
							for(int i=0;i<count;i++)
							{
								System.out.println("�s��"+i+"\t�m�W:"+name[i]+"\t���Z:"+grade[i]);
							}
							break;
						case 2:
							int cnum;
							System.out.print("��J�s��:");
							cnum=op.nextInt();
							System.out.println("�s��"+cnum+"\t�m�W:"+name[cnum]+"\t���Z:"+grade[cnum]);
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
