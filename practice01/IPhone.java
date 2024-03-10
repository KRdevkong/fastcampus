package practice01;

public class IPhone extends SmartPhone{
    private String modelName = "IPhone";
    public String getModelName(){
        return modelName;
    }

    @Override
    public void powerOn(){
        System.out.println("전원을 켭니다.\n(애플 로고)");
    }
    @Override
    public void store(){
        System.out.println("App Store을 켭니다.");
    }

    public void airDrop(){
        System.out.println("에어드랍 기능을 켭니다.");
    }
}
