import java.util.ArrayList;
import java.util.Objects;

public class Building {
    private  ArrayList<Room> rooms = new ArrayList<>();
    private int numbersOfFloors;

    Building(ArrayList rooms,int numbersOfFloors){
        this.rooms = rooms;
        this.numbersOfFloors = numbersOfFloors;
    }

    public ArrayList<Room> getRoom(){
        return this.rooms;
    }
    public int getNumbersOfFloors(){
        return this.numbersOfFloors;
    }
    public void setArrayList(ArrayList list){
        this.rooms = list;
    }
    public void setNumbersOfFloors(){
        this.numbersOfFloors = numbersOfFloors;
    }

}
