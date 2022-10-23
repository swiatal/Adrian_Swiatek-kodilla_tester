public class Application {

    private double age;
    private String name;
    private int height;
    public Application(String name, double age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void validateParams() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }

        }
    }

    public static void main(String[] args) {
        Application app = new Application("Adam",40.5,178);
System.out.println(app.name);
app.validateParams();
      }
    }

