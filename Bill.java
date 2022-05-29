import java.util.*;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;   
interface calculate
{
    int calc(int Quanlity,int unit_Price);

}
class Order implements calculate
{
    int Productid,Quanlity,unit_Price;
    String Name;
    public Order(int Productid,String Name,int Quanlity,int unit_Price)
    {
      this.Productid=Productid;
      this.Name=Name;
      this.Quanlity=Quanlity;
      this.unit_Price=unit_Price;
    }
    public int calc(int Quanlity,int unit_Price)
    {
        int Total=unit_Price*Quanlity;
        return Total;

    }
     public void display()
    {
    int Total;
    int Net_Amount=0;
    Total=calc(Quanlity,unit_Price);
    System.out.println("\t" + Productid + "\t\t" + Name + "\t\t" + Quanlity + "\t\t" + unit_Price + "\t\t" + Total);

}
}
public class Bill
{
    public static void main(String[] args)
    {   int i,n;
       int Total;
       int Net_Amount=0;
        int Productid,Quanlity,unit_Price;
        String Name,Ono;
        
        Scanner in =new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();   
        System.out.println("Enter the order no");
        Ono=in.nextLine();
        System.out.println("enter the number of product");
        n=in.nextInt();
         Order Obj[]=new Order[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Product id");
            Productid=in.nextInt();
            System.out.println("Enter the Name");
            Name=in.nextLine() + in.nextLine();
            System.out.println("Enter the  Quanlity ");
            Quanlity=in.nextInt();
            System.out.println("Enter the unit price");
            unit_Price=in.nextInt();
            Obj[i] =new Order(Productid,Name,Quanlity,unit_Price);
            Total= Obj[i].calc(Quanlity,unit_Price);
            Net_Amount=Net_Amount+Total;
        }
          System.out.println("Order no: " +Ono);
          System.out.println( "Date : " +dtf.format(now));  
         System.out.println(" \t Productid \t Name \t Quanlity \t unit_Price \t Total \t ");
         System.out.println("___________________________________________________________________________");
        for(i=0;i<n;i++)
        {
          
            
              Obj[i].display();
        }
        

        System.out.println("____________________________________________________________________________");
       System.out.println("\t\t\t\t\t    Net Amount="+  Net_Amount);
        
    }
}