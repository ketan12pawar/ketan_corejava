public class StringAnalysis {
    public static void main(String[] args) {
        String str = "Ketan_123@gmail.com";

        int numberCount = 0;
        int wordCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isLetter(ch)) {
                wordCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Number count: " + numberCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Symbol count: " + symbolCount);
    }
}
