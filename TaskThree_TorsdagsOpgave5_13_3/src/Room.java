public class Room {
    private int numbersOfLamps;
    private int numbersOfWindows;

    Room(int numbersOfLamps, int numbersOfWindows){
        this.numbersOfLamps = numbersOfLamps;
        this.numbersOfWindows =  numbersOfWindows;
    }
    public int getLamp(){
        return this.numbersOfLamps;
    }
    public int getWindows(){
        return this.numbersOfWindows;
    }
    public void setLamp(int number){
        this.numbersOfLamps = number;
    }
    public void setWindows(int number){
        this.numbersOfWindows = number;
    }
}



