import Pack1.Bread;
import Pack1.Bread2;

public class Access extends Bread { // extends 상속 ( Access가 자식, Bread가 부모)

    // 접근 제한자
    // public - 같은 프로젝트 안에만 있다면 어디서든 접근이 가능
    // protected - 같은 패키지 안에서만 접근이 가능하지만 예외적으로 상속관계에서는 다른 패키지에서도 허용 가능
    // default - 같은 패키지 안에서만 접근 가능 (기본)
    // private - 현재 클래스에서만 접근이 가능하고 그 외에는 접근이 불가


    public static void main(String[] args) {
        Bread bread = new Bread(); // 클래스 인스턴스 생성
//      bread.a;      // 같은 패키지가 아닌 Pack1이라는 패키지에서 있기 때문에 오류남
        String a = bread.a; // Bread에서 a를 Public으로 선언하면 가져올 수 있다!

        Access access = new Access();
        String accessStr = access.a; // public
        String accessStrProtected = access.strProtect; // protected

//        Bread2 bread2 = new Bread2();
//      bread2.b; // Bread2의 b는 private로 선언했기 때문에 불러올 수 없음
        // default랑 비슷하지만 private는 같은 패키지에서도 접근 x, 클래스에서만 접근 가능
    }
}
