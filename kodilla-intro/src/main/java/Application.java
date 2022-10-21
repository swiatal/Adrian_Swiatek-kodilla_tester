public class Application {

    private double age;
    private String name;
    private int height;
    public Application(String name, double age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public static void main(String[] args) {
        Application sb = new Application("Adam",40.5,178);
System.out.println(sb.name);

        if (sb.name != null) {
            if (sb.age > 30 && sb.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
