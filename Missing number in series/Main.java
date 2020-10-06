import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int [] arr=new int[no];
    for(int i=0;i<no;i++){
    	arr[i]=sc.nextInt();
    }
    int value=findMiss(arr,no);
    System.out.println(value);
  }
  static int findMiss(int [] arr,int no){
    int diff=0;
    int [] arrDiff=new int[no-1];
    for(int i=0;i<(no-1);i++){
    	arrDiff[i]=arr[i+1]-arr[i];
    }
    for(int i=0;i<(no-2);i++){
    if(arrDiff[i]>arrDiff[i+1] || arrDiff[i]<arrDiff[i+1])
    	{
      		if(arrDiff[i]<arrDiff[i+1]){
            	diff=arrDiff[i];
      		   return arr[i+1]+diff;
               
            }
      		else{
              diff=arrDiff[i+1];
               return arr[i]+diff;
            }
    	}
    }
    return 0;
  }
}