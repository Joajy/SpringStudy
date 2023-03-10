package hello.hellospring.controller;

public class MemberForm {
    public String getName() {
        return name;
    }
    //Alt + Insert로 getter & setter 간단 생성
    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
