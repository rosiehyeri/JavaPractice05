package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       String result = ""; // 결과 문자열 초기화
       
       // 문자열 배열의 각 요소를 반복하여 문자열을 결합
       for (String str : strArray) {
           result += str; // 각 요소를 결과 문자열에 추가
       }

       return result; // 최종 결과 문자열을 반환
    }

}

