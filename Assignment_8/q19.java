public class q19 {
    public static void main(String[] args) {
        String paragraph = "Java is great. Java is powerful. Java is easy to learn.";
        String result = mostRepeatedWord(paragraph);
        
        System.out.println("Most repeated word: " + result);
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static String mostRepeatedWord(String paragraph) {
        String[] words = paragraph.toLowerCase().split("[\\s.,!?;]+");
        int maxCount = 0;
        String maxWord = "";
        
        for(int i = 0; i < words.length; i++) {
            int count = 0;
            for(int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }
        return maxWord + " (" + maxCount + " times)";
    }
}
