
// METHOD WITH RETURN TYPE
// public class sum {
//     // Method to calculate the sum of two integers
//     public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//     }

//     public static void main(String[] args) {
//         // Calling the calculateSum method and storing the result in a variable
//         int result = calculateSum(5, 7);

//         // Printing the result
//         System.out.println("The sum is: " + result);
//     }
// }


// OVERLOADING
// public class methodoverloading{
// public int add(int num1, int num2) {
//     return num1+num2;
// }
// public String add(String str1 , String str2, String str3) {
//     return str1+str2+str3;
// }
//     public static void main(String[] args) {

//     methodoverloading obj = new methodoverloading();
//     int result1 = obj.add(5, 7);
//         System.out.println("Addition of two numbers is: " + result1);
    
//     String result3 = obj.add("Hello ", "world!", " ");
//     System.out.println("Addition of two strings is: " + result3);

// }
// }


// OVERRIDING
class Props {
    void buy() {
        System.out.println("You can buy photography props here");
    }
}
class Wraps extends Props {
    @Override
    void buy() {
        System.out.println("This section is for wraps category");
    }
}
class Basket extends Props {
    @Override
    void buy() {
        System.out.println("This section is for basket category");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Props prop1 = new Wraps();
        Props prop2 = new Basket();

        prop1.buy(); 
        prop2.buy(); 
        
    }
}
