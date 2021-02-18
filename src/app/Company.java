package app;
import utilities.Utils;
import workers.Employee;

import java.util.Scanner;

public class Company
{
    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);
        boolean action = true;
        Utils utils = new Utils();
        while (action)
        {
            Utils.viewOptions();
            int userChoice = myScanner.nextInt();
            switch (userChoice)
            {
                case 1 -> utils.addEmployee();
                case 2 -> utils.showsEmployees();
                case 3 -> utils.showEmployee();
                case 4 -> utils.deleteEmployee();
                case 5 -> action = false;
            }
        }

    }
}
