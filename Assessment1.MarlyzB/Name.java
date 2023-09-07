import java.util.Scanner;
public class Name{
        public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter assignemt name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
          in.close();             
          }  
}