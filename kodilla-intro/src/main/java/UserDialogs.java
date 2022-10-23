import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static void main(String[] args){
        System.out.println("Witam");
        System.out.println("Podaj pierwszą literę koloru");
        Scanner scanner = new Scanner(System.in);
        String colour = scanner.nextLine();
        //String colour = "C";
        switch(colour) {
            case "C":
                System.out.println("Czerwony");
                break;
            case "P":
                System.out.println("Pomarańczowy");
                break;
            case "B":
                System.out.println("Biały");
                break;
            case "N":
                System.out.println("Niebieski");
                break;
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
