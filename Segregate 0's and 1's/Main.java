import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String pattern=sc.nextLine();
    Long newPattern=patternFinder(pattern);
    System.out.println(newPattern);
  }
  static Long patternFinder(String pattern){
    //System.out.println(pattern);
    int k=1;
    Long newp=Long.valueOf(k);
  	int len =pattern.length();
   	int oneNum=0;
    for(int i=0;i<len;i++){
    if(pattern.charAt(i)=='1'){
    oneNum=oneNum+1;
    }
    }
    //System.out.println(oneNum);
  	for(int i=0;i<(oneNum-1);i++){
      newp=(newp*10)+1;
      //System.out.println(newp);
    }
    for(int i=0;i<(len-oneNum);i++){
      //System.out.println(newp);
       newp=(newp*10);
    }
    return newp;
  }
}