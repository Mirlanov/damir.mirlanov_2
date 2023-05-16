import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(19, 38));
        System.out.println(ageAndTemperature(54, 78));
        System.out.println(ageAndTemperature(random(), 78));
        System.out.println(ageAndTemperature(random(), 3));
        System.out.println(ageAndTemperature(random(), 4));
    }

    public static String ageAndTemperature(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }

    public static int random() {
        int age = 1 + ((int) (Math.random() * 100));
        return age;
    }
}

