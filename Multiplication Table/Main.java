import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=1;i<=m;i++){
         int value=0;
        value=n*i;
			System.out.println(i+"*"+n+"="+value);      
      }
    }
}