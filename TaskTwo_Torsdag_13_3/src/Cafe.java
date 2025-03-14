import java.util.ArrayList;
import java.util.Scanner;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;


public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    Cafe(){}

    public ArrayList getArray(){
        return this.coffeeMenu;
    }
    public void loadMenu(){



        try {
            File file = new File("Data/Coffee.txt");
            Scanner scan = new Scanner(file);


            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());


            }
        }  catch(FileNotFoundException e){
            throw new RuntimeException("File not found. Check path and filename", e);

        }
    }
}
