import java.util.ArrayList;

public class ArrayEx {
    public static void main(String[] args) {

        // ====================================정적 배열=======================================
        // 동적 배열이 있는데 정적 배열을 왜 써요? -> 가늠 가능한 배열의 크기는 정적이 나음, 메모리 절약 가능하기 때문(효율이 좋음)
        String[] stringArrays = new String[5]; // 배열의 크기를 5로 지정, 정적 배열(사이즈를 지정하고 그만큼만 배열 넣기 가능)
        // {"배열1","배열2","배열3","배열4","배열5"}

        // 배열 넣기
        stringArrays[0] = "배열 1번"; // index는 0번부터.
        stringArrays[1] = "배열 2번";
        stringArrays[2] = "배열 3번";
        stringArrays[3] = "배열 4번";
        stringArrays[4] = "배열 5번";

        int[] intArrays = new int[10];
        intArrays[0] = 1;
        intArrays[1] = 2;
        intArrays[2] = 3;
        intArrays[3] = 4;
        intArrays[4] = 5;
        intArrays[5] = 6;
        intArrays[6] = 7;
        intArrays[7] = 8;
        intArrays[8] = 9;
        intArrays[9] = 10;


        // for문을 사용해서 length(배열의 사이즈)만큼 출력
        for (int i = 0; i < intArrays.length; i++) { // fori 단축어가 있음,
            System.out.println(intArrays[i]);
        }

        for (int i = 0; i < stringArrays.length; i++) {
            System.out.println(stringArrays[i]);
        }


        // ====================================동적 배열=======================================
        ArrayList<String> arrayList = new ArrayList<>(); // 데이터 타입 String, 배열 사이즈 지정을 안 함
        arrayList.add("하이"); // 배열 추가
        arrayList.add("주용"); // {"하이","주용"}

        System.out.println(arrayList.get(0)); //가져와!

        for (int i = 0; i < arrayList.size(); i++) { // ArrayList는 length가 아닌 size
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(1); // 배열 삭제 {"하이"}
        arrayList.set(0, "안녕"); // 0번째 index 데이터 수정
        System.out.println(arrayList.get(0));

//      ArrayList<>에 데이터 타입 int나 boolean을 그대로 넣으면 오류남!
        ArrayList<Integer> arrayIntList = new ArrayList<>();
        ArrayList<Boolean> arrayBoolList = new ArrayList<>();

    }
}
