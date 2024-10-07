// Java 프로그래밍 - 변수와 자료형_3

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);


//      1-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // true
        String s5 = new String("Hi"); // 새로운 객체 생성
        System.out.println(s3.equals(s5)); // true - 값을 비교한다
        System.out.println(s3 == s5); // false - 객체를 비교한다


//      1-2. indexOf 문자열에서 특정 문자열 찾는 방법
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));


//      1-3. replace 교체하는 방법
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);
        

//      1-4. substring 기존 문자열에서 부분 문자열 뺴는 방법
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!") + 1));


//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("5678");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b;
        System.out.println(a);
        System.out.println(a == bak);
//        문자열의 데이터가 많이 변경/삭제 될때는 StringBuffer 사용이 더 좋다.
//        StringBuffer 같은 경우, 데이터가 변경/삭제 되도 객체가 새로 생성 되지 않고 기존의 데이터를 변경하는 방식이지만
//        String 경우, 데이터의 변화가 일어날때 마다 새롭게 객체를 생성한다.
//        메모리 측면에서 StringBuffer가 유리하다. (속도 딜레이)


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "Wrold!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);

    }
}
