package utilities;

import workers.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Save {
    File file = new File("Company.txt");

    public void startfile() throws IOException {
        if(!file.exists())
        {
            try
            {
                file.createNewFile();
                System.out.println("Plik został utworzony");
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        }
        if(file.canWrite()){
            try {
                FileWriter fw = new FileWriter(file, true);
                Formatter fm = new Formatter(fw);
                Scanner sc = new Scanner(System.in);
                System.out.println("Podaj dane do zapisu: ");
                String tekst = sc.nextLine();
                Scanner sf = new Scanner(file);
                fm.format("%s \r\n", tekst);
                fm.close();
                fw.close();
                System.out.println("Dane pliku:");
                while(sf.hasNextLine())
                {
                    System.out.println(sf.nextLine());
                }
                sc.close();
                sf.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

}
