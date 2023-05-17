package Pack1;

public class Bread2 {

    private String b = "b";

    public static void main(String[] args) {
        Bread bread = new Bread();
        String a = bread.a; // 같은 패키지이기 때문에 Bread1에 있는 a를 가지고 올 수 있음

        Bread2 bread2 = new Bread2();
        String b = bread2.b; //자신의 클래스에서만 호출이 됨
    }
}
