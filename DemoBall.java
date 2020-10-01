package laba1;

public class DemoBall {
    public static void main(String[] args) {
        Ball b1 = new Ball (4.35, "red");
        Ball b2 = new Ball (8.98,"black");
        Ball b3 = new Ball (14.66, "white");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b2.setRadius(3.4445);
        System.out.println(b2);
    }
}
