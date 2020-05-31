package allofobject.test;

/**
 * @author 李昭
 * @Date 7:56 2020/5/11
 * @Description:
 * @Modified By:
 */
public class Test03 {
    public int length(String str) {
        return str.length() * 2;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        int length = test03.length("s");
        System.out.println(length);
        System.out.println(Test02.i);
        increment();
        System.out.println(Test02.i);
    }

    static int increment() {
       return Test02.i++;
    }
}
