package ex01;

public class User extends SmartPhone {
    private String userName;
    private SmartPhone smartPhone;

    public User(String userName) {
        this.userName = userName;
    }

    public void buyIPhone(){
        smartPhone = new IPhone();  // 업캐스팅, 부모 메서드 사용 가능
        System.out.println(userName + "님이 " + ((IPhone)smartPhone).getModelName() + "을 구매하셨습니다.");
    } 

    public void buySamsungPhone(){
        smartPhone = new SamsungPhone();    //업캐스팅, 부모 메서드 사용 가능
        System.out.println(userName + "님이 " + ((SamsungPhone)smartPhone).getModelName() + "을 구매하셨습니다.");
    }

    public void airDrop(){
        if (smartPhone instanceof IPhone) {
            System.out.print(userName + "님이 ");
            ((IPhone)smartPhone).airDrop();
        }else{
            System.out.println("사용할 수 없는 기능입니다.");
        }

    }
    public void flip(){
        System.out.println(userName + "님이 ");
        ((SamsungPhone)smartPhone).flip();
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
