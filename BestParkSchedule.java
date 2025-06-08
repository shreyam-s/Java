import java.util.*;

public class BestParkSchedule {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person (A,B,C,D,E) : ");
        String person = sc.nextLine();

        System.out.print("Enter Park (P,Q,R,S) : ");
        String park = sc.nextLine();

        if(person.equals("A")){
            if(park.equals("P") || park.equals("Q") || park.equals("R") || park.equals("S")){
                System.out.println("Allowed to visit");
            }else {
                System.out.println("Not Allowed to visit");
                return;
    }
        }
        else if(person.equals("B")){
            if(park.equals("Q") || park.equals("R") || park.equals("S")){
                System.out.println("Allowed to visit");
            }else{
                System.out.println("Not Allowed to visit");
                return;
            }
        }
        else if(person.equals("C")){
            if(park.equals("R") || park.equals("S")){
                System.out.println("Allowed to visit");
            }else{
                System.out.println("Not Allowed to visit");
                return;
            }
        }
        else if(person.equals("D")){
            if(park.equals("P") || park.equals("Q") || park.equals("R")){
                System.out.println("Allowed to visit");
            }else{
                System.out.println("Not Allowed to visit");
                return;
            }
        }
        else if(person.equals("E")){
            if(park.equals("R") || park.equals("S")){
                System.out.println("Allowed to visit");
            }else{
                System.out.println("Not Allowed to visit");
                return;
            }
        }else{
            System.out.println("Invalid Person Entered.");
            return;
        }

        System.out.print("Choose Package : ");
        System.out.println("1. Business (₹100)");
        System.out.println("2. Economy (₹50)");
        System.out.println("3. Food & Water (₹80)");
        System.out.print("Enter 1, 2 or 3: ");
        int Package = sc.nextInt();

        int costMember = 0;
        if(Package == 1){
            costMember = 100;
        }
        else if(Package == 2){
            costMember = 50;
        }
        else if(Package == 3){
            costMember = 80;
        }
        else{
            System.out.print("Invalid package choice.");
            return;
        }

        System.out.print("Enter number of members: ");
        int members = sc.nextInt();

        int total = costMember * members;

        double discount = 0;
        if (members > 2 && members <= 4) {
            discount = 0.10;
        } else if (members > 4 && members <= 8) {
            discount = 0.25;
        } else if (members > 8 && members <= 15) {
            discount = 0.50;
        } else if (members > 15) {
            discount = 0.75;
        }

        double finalCost = (total - (total * discount));

        System.out.println("\nTotal Cost before discount: ₹" + total);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Cost: ₹" + finalCost);
    }
}
