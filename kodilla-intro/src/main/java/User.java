public class User {

    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void main (String[]args) {
        User Carol = new User("Carol", 24);
        User Antonio = new User("Antonio", 32);
        User Anatasya = new User("Anatasya", 15);
        User Gabriel = new User("Gabriel", 46);
        User[] Users= {Carol, Antonio, Anatasya, Gabriel};

        double srednia = 0;
        for(int i = 0; i < Users.length; i++){
            srednia = srednia + Users[i].age;

        }
        srednia = srednia/ Users.length;
        System.out.println(srednia);
        for(int i = 0; i < Users.length; i++) {
            if(Users[i].age<srednia) System.out.println(Users[i].name);
        }
        }
}
