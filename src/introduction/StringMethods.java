package introduction;

public class StringMethods {

    public static void main(String[] arg){
        String str = "This is the test string";
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";
        String str4 = "";
        String str5 = "        Spaces all around     ";

        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.concat(" Appended"));
        System.out.println(str.contains("is the"));
        System.out.println(str.contains("if"));
        System.out.println(str.startsWith("This"));
        System.out.println(str.startsWith("Out"));
        System.out.println(str.endsWith("string"));
        System.out.println(str.endsWith("not"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str.indexOf("hi"));
        System.out.println(str.indexOf('q'));
        System.out.println(str.isEmpty());
        System.out.println(str5.trim());
        System.out.println(str.replace("T", "F"));
        System.out.println(str.substring(1,8));

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            System.out.println("Index " + i + " is: " + charArray[i]);
        }
    }
}
