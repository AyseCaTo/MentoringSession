package Unit3;

public class MethodsReview {

    /*
    [3.1] Custom Methods
    -What is Method?
        *A method is a collection of statements that perform some specific task.
        *Methods allow us to reuse the code without retyping the code.
        *Methods only run when it is called.
        *Methods are also know as functions.

    -Different type of methods: void and return type
    -Rules for creating methods
        Access Modifier(AM) specifier returnType methodName(parameter){---->action
        statements;---->plan
        }
    -How do the void and return type methods behave?
    -How do you call a method?
    -Data transfer (passing information to a method by having parameters)
        * If methods need additional information to perform task, You can pass data, known as parameters, into a method.
    -Datatype promotion
    -What is method overloading and how do you achieve it?
    -The code analysis questions for methods will be about analyzing how a method behaves and what the output will be from that action given any inputs
    -The code inside of the methods will be topics we have been using: strings, arrays, loops, etc.
     */

    public static void main(String[] args) {

       printOddNumbers1To100();
       calculator(9, '%', 2);

        String str = reverseStr2("cybertek");
        System.out.println(str);

        int[] arr ={1,2,3,4,5};
        System.out.println(max(arr));

        double[] arr1 = {1.5, 9.8,6.4};
        System.out.println(min(arr1));

        int number = calculator(87, 90);
        System.out.println(number*9);


    }

    /*
    -Rules for creating methods
        Access Modifier(AM) specifier returnType methodName(parameter){---->plan
                        statements;---->action
        }
     */

   /*
   VOID:
        *If the return type of the method is void, the method cannot return any value
    */

    // VOID METHOD WITHOUT PARAMETER

    public static void printOddNumbers1To100(){ // ----> plan

        for(int i=1; i <= 100; i++){
            if(i%2 != 0) {
                System.out.print(i + " ");   //---->action
            }
        }
        System.out.println();
    }

    public static void printEvenNumber1to100(){

        for(int i=1; i <= 100; i++){
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //VOID METHOD WITH PARAMETER

    public static int calculator(int a, int b){
        return a+b;
    }

    public static void calculator(double n1, char operator, double n2){
        boolean isValid = operator == '+' || operator == '-' ||operator == '*' || operator =='/' || operator =='%';

        if(isValid){
            switch (operator){
                case '+': System.out.println("Addition: "+  (n1+n2) );
                    break;

                case '-': System.out.println("Subtraction: "+  (n1-n2) );
                    break;

                case '*': System.out.println("Multiplication: "+  (n1*n2) );
                    break;

                case '/': System.out.println("Division: "+  (n1/n2) );
                    break;

                default:
                    System.out.println("Remainder: "+(n1%n2));
            }

            /*
            System.out.println(
                    (operator=='+')?"Addition: "+(n1+n2) :(operator =='-')? "Subtraction: "+(n1-n2)
                    :(operator=='*')?"Multiplication: "+(n1*n2) :(operator=='/')? "Division"+(n1/n2):"Remainder: "+(n1%n2)
            );
             */

        }else{
            System.err.println("Invalid Operator");
        }


    }

    /*
    RETURN METHOD
    *Returning value MUST match with the return Type of the method
    *Closing statement MUST be ended with a return statement.
    *Return statement exits the method.
     */
    public static String reverseStr2(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    /*
    METHOD OVERLOADING:
    * Return Type of the overload method does not have to be same.
    * Parameters MUST be different
    * Pretty much all methods in java, can be overload
     */
    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static double max(double[] arr){
        double max =arr[0];
        for( double each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static double min(double[] arr){
        double min = arr[0];

        for(double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

}


