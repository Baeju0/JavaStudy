// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // String
        String a = "jy";
        System.out.println(a);
        // jy

        // 위에서 아래로 실행
        a = "juyoung";
        System.out.println(a);
        // juyoung

        // int
        int b = 10;
        System.out.println(b);
        // 10

        // boolean
        boolean c = true;
        System.out.println(c);
        // true

        b = 12;
        // if 조건문 만약 ~라면, 조건이 하나라도 맞으면 그것만 출력됨
        if (b == 10) {
            System.out.println("10이 맞습니다!");
        } else if (b == 11) {  // 다른 조건
            System.out.println("11이 맞습니다!");
        } else { // 최종, if와 else if의 조건이 전부 아닐 때
            System.out.println("10이나 11이 아니에요");
        }

        // switch문, if문보다 보기 쉽게 표현하기 위해 나온 문법
        switch (b) {
            case 10: // if = case b가 만약 10이나 11이다.
            case 11: // 연달아 작성 가능
                System.out.println("10이나 11이 맞습니다"); // true
                break; // 탈출!
            case 12:
                System.out.println("12가 맞습니다");
                break;

            default: // else if = default, 아무것도 해당되지 않을 때
                System.out.println("아무것도 해당 되지 않습니다");
        }

        System.out.println("switch문 끝");
    }
}