public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenu();
        System.out.println(cafe.getArray());
    }
}