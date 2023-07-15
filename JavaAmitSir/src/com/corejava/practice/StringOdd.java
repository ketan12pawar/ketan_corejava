public class StringOdd {
    public static void main(String[] args) {
        String str = "Ramesh";
        int n = str.length();
        int i;

        for(i=0; i<n; i++){
            if(i%2!=0){
                System.out.println(str.charAt(i));
            }
        }
    }
    
}
