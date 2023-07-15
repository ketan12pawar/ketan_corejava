//The concat() method is a built-in method in Java's String class that combines two strings into a single string.
public class StringCat {
    public static void main(String[] args) {
        String str = "Ram";
        String str1 = "Kumar";
        String str3 = "Sharma";
        String str2 = str.concat(str1).concat(str3);
        System.out.println(str2);
    }
}
