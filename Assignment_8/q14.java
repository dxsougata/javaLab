public class q14 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        
        String longest = words[0];
        String shortest = words[0];
        
        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
            if(word.length() < shortest.length()) {
                shortest = word;
            }
        }
        
        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Sougata Kundu , 24155737");
    }
}
