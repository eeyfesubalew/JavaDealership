import java.util.Scanner;
public class SectionThree{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to JAVA dealership");
     System.out.println("• Please select 'a' to buy a car");
     System.out.println("• Please select 'b' to sell a car");
     String option  = scan.nextLine();

     switch(option){
         case "a":System.out.println("You chose "+option);
         break;
         case "b":System.out.println("Youc chose "+option);
         break;
         default:System.out.println("Invalid option");
     }
     scan.close();
    }
}