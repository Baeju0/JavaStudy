package Pack1;

public class Bread {

    protected String strProtect = "protected";
    String strDefault = "default";
    public String a = "Hello";

    public static void main(String[] args) {
        Bread2 bread2 = new Bread2();
//      bread2.b; //Bread2에서의 b는 private라서 자신의 클래스에서만 호출이 됨
    }
}
