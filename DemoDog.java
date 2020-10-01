package laba1;

public class DemoDog {
    public static void main(String[] args) {
        dog d1 = new dog ("Popo", 3);
        dog d2 = new dog ("Lolo", 6);
        dog d3 = new dog ("Apu", 2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.setAge(5);
        d1.setName("uma");
        System.out.println(d1);
        ;
    }
}
