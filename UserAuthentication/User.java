package UserAuthentication;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    public void getLogin (){


            String regnumber = null;
            int pinnumber = 0;
            try {
                System.out.print("Enter your Registration number -> ");
                regnumber = sc.nextLine().toUpperCase();

                System.out.print("Enter your user pin number -> ");
                pinnumber = sc.nextInt();

            } catch (Exception e) {
                System.err.println("Invalid Characters.only numbers required for pinnumber");


            }

            if (regnumber.equals("IC211/21") && pinnumber == 2020) {
                System.out.println("<------Welecome user----->");

            }
            else{
                System.out.println("Wrong input made...please check and try again!!");
            }


    }

    }



