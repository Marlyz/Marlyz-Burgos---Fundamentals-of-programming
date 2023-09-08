import java.util.Scanner;
import java.util.ArrayList;
public class AssignmentCalculations{
    
        public static void main(String [] args){  
          Scanner scanner = new Scanner(System.in); //system.in catch input from user 
          
        //F1:
          System.out.print("Enter assignemt name: ");  //Allow to input assignment name
          String name = scanner.nextLine();  //receive and store             
                      
          
    
        //F2:
            ArrayList<Integer> studentMarks = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                while (true){
                    try{
                    System.out.print("Enter the Mark for the assignment " + (i + 1) + ": ");
                    int studentMark = Integer.parseInt(scanner.nextLine());
                     // check input as a valid number
                     if (studentMark >= 0.0 && studentMark <= 30.0){
                        studentMarks.add(studentMark);
                      break;
                        //F3
                    } else {            
                        System.out.print("Error, Write a valid number :"); //Display error message

                    }
                    }catch (NumberFormatException e){
                    System.out.println("Error, Write a valid number: ");
            }
        }
        }
    }
}