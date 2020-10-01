package laba1;

public class DemoBook {
    public static void main(String[] args) {
        Book k1 = new Book ("Love", 145);
        Book k2 = new Book("Pain", 459);
        Book k3 = new Book ("Summer",1089);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        k3.setPages(1344);
        System.out.println(k3);

    }
}
