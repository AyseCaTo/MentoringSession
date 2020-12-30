package Unit3;

public class WrapperClassReview {

    /*
    [3.3] Wrapper classes
    -Why do we need Wrapper class?
        Data Structures:
            1. Array: supports both primitives and none primitives
            2. Collection: does not support primitives
            3. Map: does not support primitives

    -What is a Wrapper class?
        *Each of Java’s eight primitive data types has a class dedicated to it. LOYAL
        These are known as wrapper classes because they ”wrap” the primitive data type into an object of that class.
        *The wrapper classes are part of the "java.lang" package, which is imported by default into all Java programs.
        *Wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
                Primitive Types             Wrapper Class
                    boolean                     Boolean
                    char                        Character
                    byte                        Byte
                    short                       Short
                    int                         Integer
                    long                        Long
                    float                       Float
                    double                      Double
     */


    public static void main(String[] args) {

        /*
         -Autoboxing and Unboxing
                                                *Converts
            Primitive------------>Wrapper Class             Primitive<------------Wrapper Class
                     Auto Boxing                                        Unboxing
         */

        byte a = 100;
        Byte a1 = a; // autoboxing

        int i = 10;
        // Byte b3 = i;  // wrapper class is only dedicated to its own primitive(LOYAL)

        Integer I = 20;
        double b = I; // unboxing
        long l = I;


        Integer num = 100;
        long L2 = num; // unboxing

        System.out.println("==================================");

        Character ch = 'A';
        char ch2 = ch;  // unboxing

        long score = 100;
        Long d2 = score; // autobox
        Long d3 = d2; // none

        double d4 = score;  //none

        System.out.println("==============================================================");

        /*
        -Common Wrapper class methods we used
            1- Parse Method: converting string to primitives not case sensitive
            2- Value Of Method: converting string to Wrapper Class not case sensitive
         */

        // Parse Method:

        String data1 = "123";

        System.out.println(data1+3); //1233

        int num1 = Integer.parseInt(data1);  //  none
        //primitive   <===  primitive int

        Integer num2 = Integer.parseInt(data1);  // Autoboxing
        //  wrapper class <=== primitive

        System.out.println(num1+3); //126

        //String s1 = "Hello";  // no digit

        //int num3 = Integer.parseInt(s1);

        //System.out.println(num3);

        System.out.println("================================================================");

        String s2 = "2.5";
        double data = Double.parseDouble(s2);  // none
        // primitive <=== primitive

        Double data2 = Double.parseDouble(s2);  // autoboxing
        // Wrapper class <=== primitive

        System.out.println(data2+1);

        System.out.println("================================================================");

        String s4 = "TRUe";
        boolean r3 = Boolean.parseBoolean(s4);
        System.out.println(r3);  // not case sensitive


        String s3 = "yes";
        boolean java = Boolean.parseBoolean(s3); // none
        Boolean r2 = Boolean.parseBoolean(s3);  // auto boxing
        System.out.println(java); // default value of boolean is false

        System.out.println("================================================================");

        // Value Of Method:

        String  str = "123";
        int number = Integer.valueOf(str); // unboxing
        // primitive  <==== wrapper class

        Integer number1 = Integer.valueOf(str);  // none

        System.out.println(number + 1);  //123+1=124

        String str2 = "2.5";
        double number2 = Double.valueOf(str2);
        System.out.println(number2 + 1);

        String str3 = "False";
        boolean input = Boolean.valueOf(str3); // unboxing

        System.out.println(input);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("================================================================");

        // CHARACTER

        char character = 'W';

        System.out.println(   Character.isDigit(character) );  //false
        System.out.println( Character.isLetter(character) ); // true

        String string = "a1b2c3b4c5d6T@w$y%o^p%!-_ +~`#& ";

        String digits = "";
        String letters = "";
        String specialChar = "";

        for(char each : string.toCharArray() ){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChar += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);


    }
}
