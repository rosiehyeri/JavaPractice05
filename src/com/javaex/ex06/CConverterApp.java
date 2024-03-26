package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1341.30);		//환율 세팅
        
        //100만원을 달러로 출력하기
        won = 1000000;
        dollar = CConverter.toDollar(won);
        //dollar = CConverter.toDollar(1_000_000); 위에 두줄을 이렇게 써도 됨
        System.out.println("100만원은 " + dollar + "달러입니다.");
        
        
        //100달려를 원으로 출력하기
        dollar = 100;
        won = CConverter.toKWR(dollar);
//        won = CConverter.toKWR(100); 로 써도됨
        System.out.println("100달러는 " + won + "원입니다.");
       
        
    }

}
