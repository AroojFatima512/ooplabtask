package week3Task;

public class Driver {
    public static void main(String[] args) {
        Music m1 = new Music("I need You", "1:00", "Sad, Emotional", new Date(12, 5,2020), new Singer("Robbin", "Male", "Japanese", new Date (4,2, 1999) ));
        Music m2 = new Music("Atlantis", "0:30", "Sad, Emotional", new Date(30, 12,2015), new Singer("Seafret", "Male", "American", new Date (16,7, 1979) ));
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2.getTitle()));
    }
}
