package practice01;

public class User extends SmartPhone {
    private String userName;
    private SmartPhone smartPhone;
    private IPhone iPhone;
    private SamsungPhone samsungPhone;

    public User(String userName) {
        this.userName = userName;
    }

    public void buyIPhone(){
        smartPhone = new IPhone();  // 업캐스팅, 공통 메서드 사용 가능
        iPhone = (IPhone)smartPhone;    // 다운캐스팅, IPhone 기능 사용 가능
        System.out.println(userName + "님이 " + iPhone.getModelName() + "을 구매하셨습니다.");
    }

    public void buySamsungPhone(){
        smartPhone = new SamsungPhone();    //업캐스팅, 공통 메서드 사용 가능
        samsungPhone = (SamsungPhone) smartPhone;   // 다운캐스팅, Samsung Phone 메서드 사용 가능
        System.out.println(userName + "님이 " + samsungPhone.getModelName() + "을 구매하셨습니다.");
    }

    public void airDrop(){
        System.out.print(userName + "님이 ");
        iPhone.airDrop();
    }
    public void flip(){
        System.out.println(userName + "님이 ");
        samsungPhone.flip();
    }


    @Override
    public void call() {
        System.out.print(userName + "님이 ");
        smartPhone.call();
    }

    @Override
    public void charge() {
        System.out.print(userName + "님이 ");
        smartPhone.charge();
    }

    @Override
    public void message() {
        System.out.print(userName + "님이 ");
        smartPhone.message();
    }

    @Override
    public void powerOn() {
        System.out.print(userName + "님이 ");
        smartPhone.powerOn();
    }

    @Override
    public void store() {
        System.out.print(userName + "님이 ");
        smartPhone.store();
    }

    @Override
    public void clock() {
        System.out.print(userName + "님이 ");
        smartPhone.clock();
    }

    @Override
    public void weather() {
        System.out.print(userName + "님이 ");
        smartPhone.weather();
    }
}
