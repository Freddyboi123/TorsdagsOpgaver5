import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();

        Room roomOne = new Room(4,3);
        rooms.add(roomOne);
        Room roomTwo = new Room(6,2);
        rooms.add(roomTwo);
        Room roomThree = new Room(10,4);
        rooms.add(roomThree);


        Building building = new Building(rooms,3);
        countLampInBuilding(building);

    }
    public static void countLampInBuilding(Building building){
        int totalLamp = 0;
    for(Room r : building.getRoom()){
        totalLamp += r.getLamp();
    }
        System.out.println(totalLamp);
    }
}
