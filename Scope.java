public class Scope {
  static  int apple = 50;
    public static void main(String[] args) {
        someFunction();
    }
    public static void someFunction(){
        System.out.println(apple);
    }
}
