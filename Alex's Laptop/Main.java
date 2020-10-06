import java.util.Scanner;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

class Laptop{
  public String brandName;
  public String processorName;
  public String os;
  public Long processorRange;
  public Long ram;
  public void displayLaptopDetails(){
    if(this.ram>0 && this.processorRange>0){
    System.out.println("Laptop Details ");
    System.out.println("Laptop Brand: "+this.brandName);
    System.out.println("Processor Name: "+this.processorName);
    System.out.println("OS: "+this.os);
    System.out.println("Processor Range: "+this.processorRange+" bit");
    System.out.println("Ram: "+this.ram+" GB");
   }
    else
      System.out.println("Invalid Input");
}
}
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
   	Laptop lap=new Laptop();
    Scanner sc=new Scanner(System.in);
    lap.brandName=sc.nextLine();
    lap.processorName=sc.nextLine();
    lap.os=sc.nextLine();
    lap.processorRange=sc.nextLong();
    lap.ram=sc.nextLong();
    lap.displayLaptopDetails();
  }
}