import java.util.StringTokenizer;

public class TokenizeString
{
    public static void main(String[] args) {
        String phone = "TEL 82 - 02 - 997 - 2059";
        String javacode = "num1 += 1";

        System.out.println("1");
        StringTokenizer str1 = new StringTokenizer(phone);
        while (str1.hasMoreTokens())
        {
            System.out.println(str1.nextToken());
        }

        System.out.println("\n2");
        StringTokenizer str2 = new StringTokenizer(phone,"-");
        while (str2.hasMoreTokens())
        {
            System.out.println(str2.nextToken());
        }

        System.out.println("\n3");
        StringTokenizer str3 = new StringTokenizer(javacode,"+=",true);
        while (str3.hasMoreTokens())
        {
            System.out.println(str3.nextToken());
        }
    }
}
