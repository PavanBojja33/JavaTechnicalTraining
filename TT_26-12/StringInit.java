
public class StringInit {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        // String str2 = new String("Hello, World!").intern();
        String str2 = new String("Hello, World!");
        System.out.println("Comparing Using '==' : "+(str1 == str2));
        System.out.println("Comparing Using 'equals()' : "+str1.equals(str2));

    }
}
