public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(); // invoke default constructor
        time.setTime(23,04,56);
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
    }
}
