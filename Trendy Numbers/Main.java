import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int no=sc.nextInt();
       String no1=Integer.toString(no);
       int len=no1.length();
      if(len==3){
      int mod= no1.charAt(1)%3;
       if(len==3 && mod==0){
       System.out.println("Trendy Number");
       }
       else
         System.out.println("Not a Trendy Number");
    }
      else
        System.out.println("Not a Trendy Number");
    }
}