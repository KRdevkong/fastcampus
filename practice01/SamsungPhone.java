package practice01;

public class SamsungPhone extends SmartPhone{
    private String modelName = "Samsung Phone";
    public String getModelName(){
        return modelName;
    }
    private boolean isFold = true;

    public void flip(){ // 휴대폰 접기 기능
        if(this.isFold){
            System.out.print("휴대폰을 펼칩니다.");
            this.isFold = false;
        }else{
            System.out.print("휴대폰을 접습니다.");
            this.isFold = true;
        }
    }

    @Override
    public void powerOn(){
        System.out.println("전원을 켭니다.\n(삼성로고)");
    }
    @Override
    public void store(){
        System.out.println("플레이 스토어를 켭니다.");
    }

}
