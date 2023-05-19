public class Juyoung extends Robot {

    String Sabc = "abc";
    int Intabc = 10;

    // 생성자, Class를 생성할 때 우선적으로 처리해야되는 무언가가 있을 때 데이터 넘겨줄 수 있는
    public Juyoung(String _test) { //String 타입이어야 된다
        System.out.println(_test);
    }

    // 생성자2
    public Juyoung(String _test, int _testInt) {
        System.out.println(_test + _testInt);
    }

    // getter & setter (Alt + Insert 단축키)
    public String getSabc() {
        return Sabc;
    }

    public void setSabc(String sabc) {
        this.Sabc = sabc;
    }

    public int getIntabc() {
        return Intabc;
    }

    public void setIntabc(int intabc) {
        this.Intabc = intabc;
    }

    public static void main(String[] args) {

        String test = "test";
        Juyoung juyoung = new Juyoung(test); //String 타입의 변수를 넘기려고 하기 때문에
        juyoung.robotName = "JJuyoung";

        Juyoung juyoung2 = new Juyoung(test, 10); // 생성자를 여러 개 만들 수 있다.
        // 실행한다고 해서 생성자를 여러 개 타는 게 아니라 상황에 맞는 생성자를 불러올 수 있다

        // getter setter를 사용하는 이유?
        juyoung2.setSabc("hihihi"); // setter를 사용함으로 데이터 삽입
        juyoung2.setIntabc(123);

        System.out.println(juyoung2.getIntabc() + " " + juyoung2.getSabc()); // getter로 현재 데이터를 가져옴
    }
}
