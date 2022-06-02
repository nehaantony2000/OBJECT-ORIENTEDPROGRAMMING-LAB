import java.util.Scanner;

public class AverageException{
    public static class InvalidNumberException extends Exception {

        public InvalidNumberException() {
            super("Please provide a valid number!");
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int c,num,sum=0;
        double avg;
        System.out.println("enter the count");
        c=sc.nextInt();
        for(int i=0;i<c;i++){
            try{
                num=sc.nextInt();
                if(num>0){
                    sum+=num;
                }else{
                    i--;
                    throw new InvalidNumberException();
                }
            }
            catch(InvalidNumberException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("sum is"+sum);
        System.out.println("avg is"+sum/c);



    }
}