// Java 프로그래밍 - 변수와 자료형_4

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();


//      1-1. add 데이터 추가
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);
        
        l1.add(0, 0);
        System.out.println("l1 = " + l1);

//      1-2. get 데이터 꺼내오기
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));


//      1-3. size 리스트의 원소갯수 
        System.out.println(l1.size());


//      1-4. remove 데이터 지우기
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(2
        )));
        System.out.println("l1 = " + l1);


//      1-5. clear 리스트의 모든 데이터 삭제
        l1.clear();
        System.out.println("l1 = " + l1);


//      1-6. sort 내림차순 오름차순 정렬
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);
        
        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println("l2 = " + l2);


//      1-7. contains 데이터가 리스트에 들어있는지 확인
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));



//      2. Maps 쌍을 이루어서 저장
        System.out.println("== Maps ==");
        HashMap map = new HashMap();


//      2-1. put mapping 값 넣기
        map.put("kiwi", 9000);
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);


//      2-2. get mapping 값 꺼내오기
        System.out.println(map.get("mandarin")); // null - 값이 없다
        System.out.println(map.get("kiwi"));


//      2-3. size map 사이즈
        System.out.println(map.size());

//      2-4. remove 데이터 지우기
        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarin"));
        System.out.println("map = " + map);


//      2-5. containsKey 해당 키 값이 map에 존재하는지 확인
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("kiwi"));


//      3. Generics 자료형을 제한하는 기능
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
//        l4.add(1); String이 아니기 때문에 에러
        l4.add("hello");
        System.out.println("l4 = " + l4);
        
        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1);
        
        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put(123, "id") Stringm Ineger 형태가 아니기 때문에 에러
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);



    }

}
