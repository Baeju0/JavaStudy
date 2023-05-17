public class MethodEx {

    // 메소드의 기본 형태 구조
    // 접근제한자, 반환타입, 메소드 이름(매개변수) { }
    public void setPlay () {
        System.out.println("Hello Worldddd!!");
        System.out.println("Hello Worldddd!!!");
    }
//  public(접근제한자), void(반환return 타입이 없다, 단순하게 실행하고 메소드 역할이 끝남), setPlay(메소드 이름), () 매개변수, { }

    public String getPrint() {
        // 반환타입이 String이기 때문에 중괄호 내부에서 구현되는 로직의 최종은 String 타입으로 되돌려줘야 됨!!
        String jy = "juyoung";
        jy = "juyooung " + "Hi!";
        return jy; // 반환타입이 있으면 반드시 return 구문이 있어야만 메소드가 완성이 됨
    }

    public void setPrintTest() {
        System.out.println("Hello from Main");
    }

    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        methodEx.setPlay(); // 메소드 호출(실행)

        String abc = methodEx.getPrint(); // 메소드 호출 후 String 결과 값을 반환 받아 abc 변수에 바로 할당
        System.out.println(abc);

        methodEx.setPrintTest();

    }
}
