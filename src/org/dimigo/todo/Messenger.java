package org.dimigo.todo;

public class Messenger {
    public String name;
    public String phoneNum;
    public int profile;
    public int picture;
    public String statusMessage;

    public void call(String number) {
        System.out.println(number+"로 전화했습니다.");
    }
    public void texting(String text) {
        System.out.println(text+" 라고 문자를 보냈습니다.");
    }
    public void sendPicture() {
        System.out.println("사진을 보냈습니다.");
    }
    public void sendLocation() {
        System.out.println("현재 위치주소를 보냈습니다.");
    }
    public void sendMoney(int money) {
        System.out.println(money+"원을 보냈습니다.");
    }

}