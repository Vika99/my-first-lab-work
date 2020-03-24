package lab4строки;

public class Lab4number19 {
   // Даны три предложения. Определить самое длинное из слов первого предложения,
    // которое есть во втором и третьем предложении.
   public static void main(String[] args) {
       String s1= "accounts loan deposit" ;
       String s2 = "i have accounts in bank" ;
       String s3 = "there are large bank accounts ";
       String[] strings = s1.split(" ");

       int maxLength = -1, maxIndex = 0;
       for (int i = 0; i < strings.length; i++) {
           String max = new String (strings[i]).toString();
           if (max.equals(strings[i]) && strings[i].length() > maxLength) {
               maxIndex = i;
               maxLength = strings[i].length();
           }
       }
       if (maxLength > -1 ) {
           System.out.println(strings[maxIndex]);
       }
       if (maxLength > -1 && s2.contains("accounts") && s3.contains("accounts")) {
           System.out.println(" true, there is - " +  strings[maxIndex]);
       }else System.out.println(" false, there is no word " + strings[maxIndex]);
   }

   }
