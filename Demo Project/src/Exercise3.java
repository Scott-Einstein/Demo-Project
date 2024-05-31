public class Exercise3 {
    public static void main(String[] args) {
        Person p = new Person(0,0,6);
        System.out.println(p.getIndex());
        p.changeDirection();
        System.out.println(p.getIndex());
        p.changeDirection();
        System.out.println(p.getIndex());


    }
}
