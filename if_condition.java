package repo6;

import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
//        int withdrawal_amount = 50000;
//        int available_amount = 40000;
//        if (withdrawal_amount>=available_amount){
//            System.out.println("Insufficient balance");
//        }else {
//            System.out.println("Withdrawal successful");
//        }
//    }
//}
//
//class main {
//    public static void main(String[] args){
//        if(5>=10){
//            System.out.println("5 is greater than or equal to 10");
//        }else {
//            System.out.println("5 is not greater than or equal to 10");
//        }
//    }
//}


//class repo6.if_condition {
//    public static void main(String[] args){
//        int withdrawal_amount = 50000;
//        int available_amount = 60000;
//        available_amount = available_amount - withdrawal_amount;
//        System.out.println("Your new available balance is " + available_amount);
//    }
//}

//class repo6.if_condition{
//    public static void main(String[] args){
//        String today = "Tuesday";
//        if (today == "Monday"){
//            System.out.println("Today is Monday...");
//        }
//        else if (today == "Tuesday"){
//            System.out.println("Today is Tuesday...");
//        }
//        else if (today == "Wednesday") {
//            System.out.println("Today is Wednesday");
//        }
//    }
//}

//public class repo6.if_condition {
//    void SayHello(){
//        System.out.println("Hello world!");
//    }
//    public static void main(String[] args){
//        repo6.if_condition obj = new repo6.if_condition();
//        obj.SayHello();
//    }
//}


//public class repo6.if_condition {
//    public static void main(String[] args){
//        Scanner reader = new Scanner(System.in);
//        String admin = "Stanley";
//        String student = "Emmanuel";
//        String teacher = "Ade";
//        String cleaner = "Vanessa";
//        System.out.println("input your name!");
//        String name = reader.nextLine();
//        System.out.println("Checking name........");
//        if (name.equals(admin)){
//            System.out.println("You are the admin.");
//        }
//        else if (name.equals(student)){
//            System.out.println("You are a student.");
//        }
//        else if (name.equals(teacher)) {
//            System.out.println("You are a teacher");
//        }
//        else if (name.equals(cleaner)) {
//            System.out.println("You are a cleaner");
//        }
//        else {
//            System.out.println("Sorry you aren't a member of the organization");
//        }
//    }
////    void SayHello() {
////        System.out.println("Hello world!");
////    }
//}
//
//public class repo6.if_condition {
//    public static void main(String[] args){
//        System.out.println("Welcome User");
//        Scanner others = new Scanner(System.in);
//        System.out.println("input your first number");
//        int FirstNumber = others.nextLine();
//        System.out.println("input your second number");
//        int SecondNumber = others.nextLine();
//

        System.out.println("Welcome to my calculator!");
        System.out.println("Input your Pin");
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        int pin = reader2.nextInt();
        if (pin == 1914) {
            System.out.println("Correct pin, you can continue using the calculator");
            System.out.println("input your number");
            int First_number = reader.nextInt();
            System.out.println("input your second number");
            int Second_number = reader.nextInt();
            System.out.println("input your operator");
            String operator = reader2.nextLine();
            if (operator.equals("+")) {
                System.out.println(First_number + Second_number);
            } else if (operator.equals("-")) {
                System.out.println(First_number - Second_number);
            } else if (operator.equals("*")) {
                System.out.println(First_number * Second_number);
            }
        } else {
            System.out.println("Incorrect pin");
        }

    }
}