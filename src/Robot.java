public class Robot {
    // 생성자를 따로 구현하지 않으면 프로그램이 자동으로 default 생성자를 만든다
//    public Robot() {
//
//    }

    // 자바 - 객체 지향 프로그래밍(OOP, Object Oriented Programming)
    // 객체는 상태랑 행동이 있음

    // 객체의 상태 (필드)
    public String robotName;
    public String robotType;


    // 객체의 행동 (메소드)
    public void setWalking() {
//        walking
    }
    public void setStop() {
//        stop
    }

    public static void main(String[] args) {
        Robot robot = new Robot(); // robot 이라는 클래스를 생성하여 인스턴스화, 이때부터 클래스를 활용하기 시작한 것
        robot.robotName = "JY";

        Robot robot2 = new Robot(); // 이름만 바꿔서 더 만들기도 가능
        robot2.robotName = "jy";
    }
}
