import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int [] arr=new int[num];
    for(int i=0;i<num;i++){
    arr[i]=sc.nextInt();
    }
    int [] newArr=new int[num];
    int j=0;
    while(j<num){
      newArr[j]=calculate(j,arr,num);
      j++;
    }
    for(int i=0;i<num;i++){
    System.out.println(newArr[i]);
    }
  }
  static int calculate(int j,int [] arr,int num){
    int mul=1;
    for(int i=0;i<num;i++){
      if(i!=j){
        mul=mul*arr[i];
      }
     
    }
     return mul;
  }
}