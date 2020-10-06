import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int capacity[]=new int[3];
    for(int i=0;i<3;i++)
    {
      capacity[i]=sc.nextInt();
    }
    
    if(capacity[0]<capacity[1] && capacity[0]<capacity[2]){
    System.out.println("L1");
    }
    else if(capacity[1]<capacity[0] && capacity[1]<capacity[2]){
     System.out.println("L2");
    }
    else
      System.out.println("L3");
  }
}