package practice01;

public class SmartPhone implements Phone{

    @Override
    public void call() {
        System.out.println("전화를 겁니다.");
    }

    @Override
    public void charge() {
        System.out.println("충전을 합니다.");
    }

    @Override
    public void message() {
        System.out.println("문자를 보냅니다.");
    }

    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void store(){
        System.out.println("스토어를 켭니다.");
    }
    public void clock(){
        System.out.println("시계 어플을 켭니다.");
    }
    public void weather(){
        System.out.println("날씨 어플을 켭니다.");
    }

}
