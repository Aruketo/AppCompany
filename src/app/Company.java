package app;
import utilities.Utils;

import java.io.IOException;
import java.util.Scanner;
import utilities.Save;

public class Company
{
    public static void main(String[] args) throws IOException {
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
                default -> System.out.println("Wybrana przez ciebie opcja nie istnieje.\n" +
                        "Spróbuj ponownie.");
            }


        }


    }
}
