//equals() method in Java's String class to compare two strings for equality. 
public class StringEquals {
    public static void main(String[] args) {
        String str  = "RAM";
        String str1 = "RAM";
        boolean str2;
        str2 = str.equals(str1);
        System.out.println(str2);
        if(str.equals(str1)){
            System.out.println("Equals");
        }
        else {
             System.out.println(" Not Equals");
        }
    }
    
}
