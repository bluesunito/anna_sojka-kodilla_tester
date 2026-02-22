package Module25;

public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int sum = 0;
        for (User u : users) {
            sum += u.getAge();
        }
        int avg = sum / users.length;
        System.out.println("The average user's age is " + avg);

        for (User u : users) {
            if (u.getAge() <= avg) {
                System.out.println(u.getName() + " is younger than the group's average.");
            }
        }
    }
}






