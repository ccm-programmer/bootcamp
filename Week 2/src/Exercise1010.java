public class Exercise1010 {
  public static void main (String[] args){
    // String str1 = "Diamond Hill";
    // int length = str1.length();
    // System.out.println(length);

//     String str1 = "hello";		
// String str2 = "hello";		
// String str3 = "world";		
// boolean isEqual = str1.equals(str2);		
// boolean isnotEqual = str2.equals(str3);		
// System.out.println(isEqual);		
// System.out.println(isnotEqual);		

// String str = "Wonderful";
// char ch1 = str.charAt(0);
// System.out.println(ch1);
// char ch2 = str.charAt(2);
// System.out.println(ch2);
// char ch3 = str.charAt(4);
// System.out.println(ch3);
// char ch4 = str.charAt(6);
// System.out.println(ch4);

// String str = "Love";
// char ch = str.charAt(str.length()-1);
// System.out.println(ch);

// String word = "Diamond";
// String word2 = word.replace('D','d').replace('a','A');
// System.out.println(word2);

// String word = "God loves us".toUpperCase();
// System.out.println(word);

// String word2 = "God loves us".toLowerCase();
// System.out.println(word2);

// System.out.println(word.concat(word2));

// String place = "Diamond Hill";
// String x = place.substring(5);
// System.out.println(x);

// String place = "Diamond Hill";
// String x = place.substring(3,10);
// System.out.println(x);










  // String str9 = "Diamond Hill";
  // System.out.println("case 1: " + str9.substring(5)); //print from no. 5 letter, = nd Hill
  // System.out.println("case 2: " + str9.substring(3, 10)); //print from no. 3 letter to no. 9 (10-1) = mond Hi 
  // //end index will deduct 1 automatically

  // System.out.println("case 3: " + (str9.charAt(3) == 'M')); //false
  // System.out.println("case 4: " + (str9.charAt(3) == 'm')); //True

  // String str10 = "";
  // String str11 = " ";
  // System.out.println("str10.isEmpty: " + (str10.isEmpty())); //true
  // System.out.println("str11.isEmpty: " + (str11.isEmpty())); //false
  // System.out.println();
  //isEmpty就係有space都當係not empty

  // String str12 = ".";
  // System.out.println("str10.isBlank: " + (str10.isBlank())); //true
  // System.out.println("str11.isBlank: " + (str11.isBlank())); //true
  // System.out.println("str12.isBlank: " + (str12.isBlank())); //false
  // System.out.println();
  //isBlank就係""裡面沒有字
    
    
    
    
    
    //Expect Result:
    // 1. VENTURENIXLAB, JAVA
    //2. venturenixlab, java
    //3. V*NTUR*NIXLAB, JAVA!!!!
    
    // String str1 = "VenturenixLAB, Coding";
    // String str2 = str1.replace("Coding","JAVA");
    // System.out.println(str2.toUpperCase());
    // System.out.println(str2.toLowerCase());
    // String str3 = str2.replace('e','*');
    // System.out.println(str3.toUpperCase().concat("!!!"));
  }
}