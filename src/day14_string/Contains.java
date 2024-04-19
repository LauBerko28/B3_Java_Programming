package day14_string;

public class Contains {
    public static void main(String[] args) {

        String weather = "Today it was above 70";

        System.out.println(weather.contains("it was")); // true
        System.out.println(weather.contains("s")); // true
        System.out.println(weather.contains("a")); // true

        System.out.println(weather.contains("itwas"));
        System.out.println(weather.contains("above 70"));

        System.out.println(weather.contains("today"));

        System.out.println(weather.contains("Today, it, 70"));

        System.out.println(weather.contains("Today") && weather.contains("70"));
        System.out.println(weather.contains("Today && 70"));


    }
}
