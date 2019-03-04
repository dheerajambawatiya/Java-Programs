public class ReverseTheString
{
    public static void main(String[] args)
    {
        String str = "MyJava";
 
        StringBuffer sbf = new StringBuffer(str);
 
        System.out.println(sbf.reverse());    
 
 
        char[] strArray = str.toCharArray();
 
        for (int i = strArray.length - 1; i >= 0; i--)
        {
            System.out.print(strArray[i]);   
        }
 
        System.out.println();
 
 
        System.out.println(recursiveMethod(str));  
    }
 
 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
