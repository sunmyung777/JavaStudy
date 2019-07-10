package Practice;

public class SmartPhone {
    private String model;
    private String company;
    private int price;

    public SmartPhone(){};
    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnon(){
        System.out.println(model+"의 전원을 켭니다.");
    }
    public void turnoff(){
        System.out.println(model+"의 전원을 끕니다.");
    }
    public void pay(){}
    public void useSpecialFunction(){
        if(this instanceof IPhone){
            IPhone a=(IPhone)this;
            a.useAirDrop();
        }
        if(this instanceof Galaxy){
            Galaxy a=(Galaxy)this;
            a.useWirelessCharging();
        }
    }

    public String toString() {
        return "모델명 : "+model+
                ", 제조사 : "+company+
                ", 가격 : "+ String.format("%,d", price)+"원";
    }
}
