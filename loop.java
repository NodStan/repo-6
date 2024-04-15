package repo6;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
 //        int num = 0;
//        while (num > 0 && num<=10){
//            System.out.println("VIRUS!!!!!!!!!!!!!!!1");
//            num++;
//        }
//
//        System.out.println("Welcome");
//        int count = 0;
//        while (true){
//            System.out.println("Want to++ know how to keep someone busy?");
//            String answer = new Scanner(System.in).nextLine().toLowerCase();
//            if(answer.equals("no")){
//                if(count>0){
//                    if(count==1){
//                        System.out.println("Ha Ha... I kept you busy " + count + " time");
//                    }else{
//                        System.out.println("Ha Ha... I kept you busy " + count + " times");
//                    }
//                }else {
//                    System.out.println("Alright boss!");
//                }
//                break;
//            }else{
//                count++;
//                continue;
//            }
//        }
//        int number = 1;
//        while(number<=12){
//            System.out.println("2 X " + number + " = " + number*2);
//            number++;
//
//        int number = 0;
//        while(number<=20){
//            if (number%2==0){
//                System.out.println(number + " is an even number");
//            }number++;
//        int number = 0;
//        while(number<=20){
//            if (number%2==1){
//                System.out.println(number + " is an odd number");
//            }number++;
        System.out.println("Welcome!");
        System.out.println("What do you wish to do....");
        System.out.println("1. Check a number....");
        System.out.println("2. Exit....");
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        String userOption = reader.nextLine();
        if (userOption.equals("1")){
                System.out.println("Which number would you like to check");
                int userNumber = reader.nextInt();
                while(true)
                    if (userNumber%2==0){
                        System.out.println(userNumber + " is an even number");
                        break;
                    }else if (userNumber%2==1){
                        System.out.println(userNumber + " is an odd number");
                        break;
                    }
            System.out.println("Would you like to check a number again");
                String useroption = reader2.nextLine();

        }
        else if(userOption.equals("2")){
            System.out.println("Goodbye");
        }

        System.out.println("Welcome to the multiplication table");
        String cont = "yes";
        while (cont.equals("yes")){
            System.out.println("Choose a number you would like to check");
            int UserChoice = new Scanner(System.in).nextInt();
            int number = 1;
            while(number<=12){
                System.out.println( UserChoice + " X " + number++ + " = " + UserChoice*number);
                number++;
                System.out.println("Do you wish to continue");
                System.out.println("1.yes or 2.no");
                cont = new Scanner(System.in).nextLine();
                }
            if (cont.equals("1")){
                System.out.println("ok");
            } else if (cont.equals("2")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}