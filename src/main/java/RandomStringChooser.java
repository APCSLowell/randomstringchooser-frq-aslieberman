import java.util.ArrayList;
public class RandomStringChooser {
    private ArrayList<String> availableStrings;

    public RandomStringChooser(String[] wordArray) {
        availableStrings = new ArrayList<String>();
        for (String word : wordArray) {
            availableStrings.add(word);
        }
    }

    public String getNext() {
        if (availableStrings.size() == 0) {
            return "NONE";
        }
        int index = (int)(Math.random() * availableStrings.size());
        return availableStrings.remove(index);
    }
}
