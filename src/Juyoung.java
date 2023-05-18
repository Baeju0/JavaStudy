public class Juyoung extends Robot { // 하나의 클래스만 상속 받을 수 있다, Juyoung도 Robot의 한 종류!?

    public static void main(String[] args) {
        Juyoung juyoung = new Juyoung();
        juyoung.robotName = "JJuyoung"; // Robot에서부터 상속받은 속성
    }
}
