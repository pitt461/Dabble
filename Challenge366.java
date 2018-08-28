import java.util.*;
import java.io.*;
public class Challenge366  {
   public static void main(String[] args) throws FileNotFoundException{
      String a = "eave";
      String b = "leave";
      System.out.print(bonus("affidavit"));
   }
   
   public static List<String> bonus(String a) throws FileNotFoundException{
      Scanner fileIn = new Scanner(new File("enable1.txt"));
      List<String> valid = new ArrayList<String>();
      while(fileIn.hasNextLine()) {
         String s = fileIn.nextLine();
         if(funnel(a, s) == true) {
            valid.add(s);
         }
      }
      return valid;
   }
   
   public static boolean funnel(String a, String b) {
      if(a.length() - 1 != b.length()) {
         return false;
      }
      for(int i = 0; i < a.length(); i++) {
         String s = a.substring(0, i) + a.substring(i + 1);
         if(s.equals(b)) {
            return true;
         }
      }
      return false;
   }
   
   public static int wordFunnel() {
   
   }
   
   private static int wordFunnel(String a, ) {
   
   }
}