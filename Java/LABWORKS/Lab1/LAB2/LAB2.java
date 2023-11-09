
public class LAB2 {

    public static void main(String[] args) {
        String str1 = "The paragraph is : %s";
        String str  ="We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";;
        String mystr1 = "Pavi";
        String mystr2 = "tharani";
        String mystr3 = "PAVI";
        String mystr4 = "    Hello!";
        String name = "Lava";
        System.out.println(str.charAt(0));
        System.out.println(mystr1.compareTo(mystr2));
        System.out.println(mystr1.concat(mystr2));
        System.out.println(mystr1.contains("avi"));
        System.out.println(mystr2.endsWith("ii"));
        System.out.println(mystr3.equals(mystr1));
        System.out.println(mystr1.equalsIgnoreCase(mystr2));
        System.out.println(String.format("name is : %s",name));
        System.out.println(str.indexOf("workers"));
        System.out.println(mystr3.isEmpty());
        System.out.println(str.lastIndexOf("surrounding"));
        System.out.println(mystr1.length());
        System.out.println(mystr1.replace("i", "ii"));
        System.out.println(mystr3.replaceAll(mystr3, "Hello"));
        System.out.println(mystr1.startsWith("P"));
        System.out.println(name.toUpperCase());
        System.out.println(mystr3.toLowerCase());
        System.out.println(mystr4);
        System.out.println(mystr4.trim());
        System.out.println(mystr3.substring(2));
        System.out.println(mystr3.intern());
        String s6 = String.valueOf(30);
        System.out.println(10 + s6);
        char[] charArr = str.toCharArray();
        System.out.println(charArr);
        System.out.println(String.join("-",mystr3, mystr2));
        System.out.println(mystr1.getBytes());
        char[] destArray = new char[20];
        str.getChars(12, 20, destArray, 0);
        System.out.println(destArray);
        String[] arrOfStr = str.split(".", 10);
 
        for (String a : arrOfStr)
            System.out.println(a);


        }
}
