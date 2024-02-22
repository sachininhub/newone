
import java.util.Random;

public class DarkRandomTruth {
    public static void main(String[] args) {
        // Array of dark truths
        String[] darkTruths = {
            "In the end, we all are slaves to technology.",
            "Sleep is just a temporary escape from reality.",
            "The only certainty in life is uncertainty.",
            "The more you know, the more you realize how little you know.",
            "Life is a series of distractions until the inevitable end.",
            "We are all prisoners of our own minds.",
            "Happiness is just a fleeting moment in an otherwise mundane existence.",
            "In the grand scheme of the universe, our existence is insignificant.",
            "The more you care, the more you have to lose.",
            "The pursuit of perfection is a never-ending journey with no destination."
        };

        // Generate a random index
        Random random = new Random();
        int index = random.nextInt(darkTruths.length);

        // Display the dark random truth
        System.out.println("Dark Random Truth: " + darkTruths[index]);
    }
}
