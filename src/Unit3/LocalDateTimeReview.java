package Unit3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeReview {

    /*
    [3.2] LocalDate and LocalTime( only 3 questions total )
    -Creating a LocalDate and LocalTime object
    -Using of and now methods
    -Understanding how DateTimeFormatter works
    -Basic patterns and default pattern (default pattern vs custom pattern)
    -Are LocalDate and LocalTime objects mutable?
         *IMMUTABLE
     */

    /*
    java.time: a package that contains all time units and data types
    LocalDate: year, month, day
        2020-11-23
    LocalTime: hour, minute, second
        10:49:40
    LocalDateTime: combination of both LocalDate & LocalTime
        year, month, day, hour, minutes, seconds, milliseconds

    METHODS:
    *of
    *now(automation test, whenever test case failed!)
    *format
    *isBefore
    *isAfter
    *minus-plus day, month, year, hour, minutes
    *getYear
    *getMonthValue---> returns int
    *getDayOfMonth
     */

    public static void main(String[] args) {

        // Local Date: year, month, day

        // "of" Method: in order to declare, static method, we are calling through the class name, overloaded method, sensitive we have to pass valid date and time

        LocalDate yesterday = LocalDate.of(2020, 12, 18);

        System.out.println(yesterday);

        //LocalDate d1 = LocalDate.of(2019, 2, 29);  //Invalid date 'February 29' as '2019' is not a leap year
        //System.out.println(d1);

        System.out.println(  yesterday.isLeapYear() ); // Leap ==> true, otherwise ==> false

        // "now" Method:

        LocalDate today = LocalDate.now();

        System.out.println(today);

        // "isBefore - isAfter"

        LocalDate first = LocalDate.of(2000,11,23);
        LocalDate second = LocalDate.of(1995,02,10);

        if(first.isBefore(second)){
            System.out.println("First person is older.");
        }else if(second.isBefore(first)){
            System.out.println("Second person is older.");
        }else{
            System.out.println("Their ages are same!");
        }

        // "getYear"
        // current age:
        // int age1 = LocalDate.now().getYear() - first.getYear();
        // int age2 = LocalDate.now().getYear() - second.getYear();

        // 30 year after:
         // minus-plus day, month, year, hour, minutes
                                 //  2050                          -  2000     = 50
        int age1 = LocalDate.now().plusYears(30).getYear() - first.getYear();
                                 // 2050                            - 1990     = 60
        int age2 = LocalDate.now().plusYears(30).getYear() - second.getYear();

        System.out.println("After thirty years, first person will be: "+age1);
        System.out.println("After thirty years, second person will be: "+age2);

        LocalDate DofB = LocalDate.of(1985, 4, 5);

        // 10 years ago:
        int age = LocalDate.now().minusYears(10).getYear() - DofB.getYear();
        //                   2020 - 10  = 2010 - 1985 = 25

        System.out.println("10 years ago you were: "+age+" years old");

        System.out.println("=====================================================");

        // Local Time: hour, minute, second

        LocalTime time = LocalTime.of(2,50, 55);  // 24

        System.out.println("time = " + time);

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);

        System.out.println("====================================================");

        // Local Date Time: combination of both LocalDate & LocalTime

        LocalDateTime t2 =  LocalDateTime.of(2020, 11, 23, 11, 50);

        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.now();

        System.out.println(t3);

        System.out.println("=====================================================");


        /*
         DateTimeFormatter:
            LocalDate:
                year: yy, yyyy
                month: MM (number), MMM(three letters of month), MMMM(full name)
                days: dd
                name of day: E(three letters) , EEEE (full name)

            LocalTime:
                hours: hh
                minutes: mm
                seconds: ss
                am/pm: a
         */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE"); // String

        LocalDate toDay = LocalDate.now();  //2020-12-19---> default format
        System.out.println(toDay);
        System.out.println(toDay.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(  now.format(tf) );

        LocalTime t1 = LocalTime.of(23, 35, 55); //23:35:55 -----> default format
        System.out.println(t1);
        System.out.println(t1.format(tf));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


    }

}
