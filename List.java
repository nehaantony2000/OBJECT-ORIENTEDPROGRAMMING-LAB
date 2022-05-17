class CPU
{
float price=20000;
class Processor
{
int NoOfCores=4;
String  Manufacturers="Rayzen s5";
}
static class RAM
{
static int Memory=8;
String M_Manufacturer="HP";
}
}
public class List
{
public static void main(String args[])
{
CPU C1 =new CPU();
CPU.Processor Pro =C1.new Processor();
CPU.RAM R=new CPU.RAM();
System.out.println("Price=" + C1.price);
System.out.println("Number of cores" + Pro.NoOfCores);
System.out.println("Manufacturers=" + Pro.Manufacturers);
System.out.println("Memory=" +CPU.RAM.Memory);
System.out.println("Memory Manufacturers=" + R.M_Manufacturer);
}
}
