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
    int toFind=sc.nextInt();
   int pos=binarySearch(arr,0,num-1,toFind);
    if(pos!=-1){
       System.out.println(pos);
    }
    else
       System.out.print("Not found");
  }

private static int binarySearch(int[] arr1, int low, int high, int value) {
	int mid=(high+low)/2;
  if(high>=low){
	if(value==arr1[mid]){
    return mid;
    }
 	else if(value>arr1[mid])
    {
    return binarySearch(arr1,mid+1,high,value);
    }
 	else{
      return binarySearch(arr1,low,mid-1,value);
    }
  }
  else 
    return -1;
}
}