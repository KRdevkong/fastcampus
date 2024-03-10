package practice01;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============== jy ================");
        User jy = new User("재용");
        jy.buySamsungPhone();
        jy.flip();
        jy.powerOn();
        jy.call();
        jy.store();
        jy.flip();

        System.out.println("=============== js Iphone ================");
        User js = new User("잡스");
        js.buyIPhone();
        js.powerOn();
        js.message();
        js.store();
        js.airDrop();

        System.out.println("=============== js Samsung ================");
        js.buySamsungPhone();
        js.flip();
        js.call();
        js.store();
        js.flip();

    }

}
