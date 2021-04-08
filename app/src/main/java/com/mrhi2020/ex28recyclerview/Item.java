package com.mrhi2020.ex28recyclerview;

public class Item {
    public String name;  //이름
    public String msg; //메세지
    public int img;

    //생성자는 가급적 오버로딩으로 2개 이상 만들것.
    public Item(String 전과목학원, String s, int studygroup01) {
    }

    public Item(String name, String msg) {
        this.name = name;
        this.msg = msg;
        this.img = img;
    }
}
