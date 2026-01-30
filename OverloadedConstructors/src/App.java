public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User("Spongebob");
        User user2 = new User(
            "Patrick", 
            "pstar@aol.com"
        );
        User user3 = new User(
            "Sandy", 
            "scheeks@gmail.com",
            27
        );
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
