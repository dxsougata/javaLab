public class q11 {
    public static void main(String[] args) {
        int iterations = 100000;
        String str = "";
        
        // String performance
        long start = System.nanoTime();
        for(int i = 0; i < iterations; i++) {
            str += "a";
        }
        long stringTime = System.nanoTime() - start;
        
        // StringBuffer performance
        StringBuffer sb = new StringBuffer();
        start = System.nanoTime();
        for(int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long bufferTime = System.nanoTime() - start;
        
        // StringBuilder performance
        StringBuilder sbuilder = new StringBuilder();
        start = System.nanoTime();
        for(int i = 0; i < iterations; i++) {
            sbuilder.append("a");
        }
        long builderTime = System.nanoTime() - start;
        
        System.out.println("String time: " + stringTime + " ns");
        System.out.println("StringBuffer time: " + bufferTime + " ns (Thread-safe)");
        System.out.println("StringBuilder time: " + builderTime + " ns (Not thread-safe)");
        System.out.println("Sougata Kundu , 24155737");
    }
}
