public class Car {
    public static void main(String[] args) {

        // for문, 반복문
        for(int i =0; i < 10; i++) { // i=0, i가 10보다 작을 때(참) {}실행 후, i에 +1 증가
//            System.out.println(i);
            if (i == 2 || i == 4 || i == 6 || i == 8) // if 조건 추가 가능, i가 짝수일 때만 출력하기, || or연산자, && and연산자
                System.out.println("부릉부릉");
        }
        System.out.println("for문 끝!");

    }
}
