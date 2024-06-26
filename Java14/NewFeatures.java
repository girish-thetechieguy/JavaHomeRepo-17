package Java14;

public class NewFeatures {

    public static void main(String[] args) {
        System.out.println(getDayType("Saturday"));
        String day = "MONDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            default -> {
                String s = day.toString();
                int result = s.length();
                yield result;
            }
        };
        System.out.println("numLetters: " + numLetters);

        Person person = new Person("Harish", "Harish");

        System.out.println(person.x);
        System.out.println(person.x.equals(person.y));

        // 3: null pointer exception is more formulated
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("Within catch: "+e);
        }
        // Ourput : Exception in thread "main" java.lang.NullPointerException: Cannot
        // invoke "String.length()" because "name" is null
        // at Java14.NewFeatures.main(NewFeatures.java:26)

        // 4: No casting required
        String obj = "Hello";
        if (obj instanceof String s) {
            System.out.println("casting Result: "+s.contains("Hello"));
        }

    }

    // 1:Switch advancement:
    public static String getDayType(String day) {
        var result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                yield "Weekday";
            case "Saturday", "Sunday":
                yield "Weekend";
            default:
                yield "Invalid day.";
        };

        return result;
    }

    // 2: create pojo class as below
    record Person(String x, String y) {
    }

}
