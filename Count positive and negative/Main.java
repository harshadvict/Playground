import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int positive=0;
      int negative =0;
      int no=sc.nextInt();
      int [] value= new int[no];
      for(int i=0;i<no;i++){
		value[i]=sc.nextInt();      
      }
      for(int i=0;i<no;i++){
      if(value[i]<0){
       negative =negative+1;
      }
       else{
       positive=positive+1;
       }
      }
      System.out.println("Number of positive numbers is "+positive+" and the number of negative numbers is "+negative);
    }
}