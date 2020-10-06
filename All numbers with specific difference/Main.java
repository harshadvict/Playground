import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int d=sc.nextInt();
    int result=findAll(num,d);
    System.out.println(result);
  }
  static int findAll(int num,int d){
    int temp=0;
 
  	for(int i=num;i>=10;i--){
    	if(Long.toString(i).length()>1){
          	int temp1=i;
          	int sum=0;
          	int j;
        	while(temp1>0){
              j=temp1%10;
              sum=sum+j;
              temp1=temp1/10;
            }
          if((i-sum)>=d){
          temp=temp+1;
          }
        }
     
    }
  return temp;
  }
}