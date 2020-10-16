public class Main {
    public static void main(String[] args) {
        Room[] room = new Room[4];
        room[0] = new Room(59, false, 0, 23, 153);
        room[1] = new Room(43, true, 0.9, 18, 111.8);
        room[2] = new Room(37, true, 0.9, 22, 96.2);
        room[3] = new Room(66, true, 0.99, 20, 171.6 );

        System.out.println(room[0].toString());
        System.out.println(room[0].temperatureSettings());
        System.out.println(room[0].toString() + " (after cooling)\n");

        System.out.println(room[1].toString());
        System.out.println(room[1].temperatureSettings());
        System.out.println(room[1].toString() + " (after cooling)\n");

        System.out.println(room[2].toString());
        System.out.println(room[2].temperatureSettings());
        System.out.println(room[2].toString() + " (after cooling)\n");

        System.out.println(room[3].toString());
        System.out.println(room[3].temperatureSettings());
        System.out.println(room[3].toString() + " (after cooling)\n");


    }
}
