package prototype;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S1", "Student 1", true, "sv1@gmail.com");

        // Tao ra 1 doi tuong s2, co thong tin giong het s1??
        Student s2 = s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
