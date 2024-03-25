package com.javaex.ex05;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }

 // int 타입 이외의 값을 출력하는 printer() 메소드 오버로딩
    public void printer(boolean val) {
        System.out.println(val);
    }

    public void printer(double val) {
        System.out.println(val);
    }

    public void printer(String val) {
        System.out.println(val);
    }
    
}
