import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mood-Based Food Matcher");
        System.out.print("Please enter your current mood (example: happy, sad, stressed, tired): ");
        String mood = scanner.nextLine().trim().toLowerCase();

        Map<String, MoodSuggestion> moodMap = getMoodSuggestions();

        if (moodMap.containsKey(mood)) {
            MoodSuggestion suggestion = moodMap.get(mood);
            System.out.println("\nSuggestions based on your mood:");
            System.out.println("Suggested foods: " + suggestion.food);
            System.out.println("Suggested color: " + suggestion.color);
            System.out.println("Tip: " + suggestion.tip);
        } else {
            System.out.println("Sorry, there is no suggestion for this mood yet.");
        }

        scanner.close();
    }

    static class MoodSuggestion {
        String food;
        String color;
        String tip;

        MoodSuggestion(String food, String color, String tip) {
            this.food = food;
            this.color = color;
            this.tip = tip;
        }
    }

    private static Map<String, MoodSuggestion> getMoodSuggestions() {
        Map<String, MoodSuggestion> map = new HashMap<>();
        map.put("happy", new MoodSuggestion("strawberries, banana, ice cream", "yellow", "Play your favorite song"));
        map.put("sad", new MoodSuggestion("dark chocolate, green tea, nuts", "light blue", "Take a short walk"));
        map.put("stressed", new MoodSuggestion("oatmeal, banana, herbal tea", "green", "Try deep breathing"));
        map.put("tired", new MoodSuggestion("yogurt, walnuts, coffee", "orange", "Rest for 10 minutes"));
        map.put("energetic", new MoodSuggestion("smoothie, avocado, blueberries", "red", "Use your energy for something creative"));
        return map;
    }
}
