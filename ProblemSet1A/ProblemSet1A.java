/* Clara Chen   
 * September 20, 2021
 * Problem Set 1A
 */

class ProblemSet1A {
   public static void main (String[] args) {
       
    //Quadratic Formula:
    double a = 1; //value for the coefficient of x^2
    double b = 5; //value for the coefficient of x
    double c = 6; // value for the constant  
    
    double firstX = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/2*a; //finds the first possible x value
    double secondX = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/2*a; //finds the second possible x value

//-------------------------------------------------------------------------------------------------------------------
    
    //Slope Formula:
    double x1 = 0; //first x point
    double x2 = 2; //second x point
    double y1 = 0; //first y point
    double y2 = 3; //second y point
    
    double m = (y2 - y1)/(x2 - x1); //finds the slope for the points
    
//-------------------------------------------------------------------------------------------------------------------
   
    //Midpoint Formula:
    double M1 = (x1 + x2)/2; //finds the x midpoint
    double M2 = (y1 + y2)/2; //finds the y midpoint
    
//-------------------------------------------------------------------------------------------------------------------

    //Sum of arithmetic series:
    double a1 = 1.0; //first term
    double k = 5; //number of terms
    double difference = 1; //the difference between each number
    double ak = a1 + (k - 1) * difference; //last term
    
    double sum = k/2 * (a1 + ak); //finds the sum of the arithmetic series
     
//-------------------------------------------------------------------------------------------------------------------

    //Sum of geometric series
    double g1 = 3.0;
    double kTerms = 3;
    double r = 2.0;
    double gSum = g1 * ((1 - Math.pow(r, kTerms)) / (1 - r));
    
//-------------------------------------------------------------------------------------------------------------------

System.out.println("QUADRATIC FORMULA"); //prints "QUADRATIC FORMULA"
System.out.println("The Solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + firstX + " and " + secondX + "."); //prints the answer for the quadratic formula question

System.out.println();

System.out.println("SLOPE FORMULA"); //prints "SLOPE FORMULA"
System.out.println("A line connecting the points (" + (int)x1 + ", " + (int)y1 + ") " + "and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " + m) ; //prints the answer for the slope question

System.out.println();

System.out.println("MIDPOINT FORMULA"); //prints "MIDPOINT FORMULA"
System.out.println("The midpoint between (" + (int)x1 + ", " + (int)y1 + ") " + "and (" + (int)x2 + ", " + (int)y2 + ") is (" + M1 + ", " + M2 + ")"); //prints the answer for the midpoint question
 
System.out.println();

System.out.println("SUM OF AN ARITHMETIC SERIES"); //prints "SUM OF AN ARITHMETIC SERIES"
System.out.println("The sum of the first " + (int)k + " terms of an arithmetic series that starts with " + a1 + " and increases by " + difference + " is " + sum); //prints the answer to the arithmetic series question

System.out.println();

System.out.println("SUM OF A FINITE GEOMETRIC SERIES"); //prints "SUM OF A FINITE GEOMETRIC SERIES"
System.out.println("The sum of the first " + kTerms + " terms of a finite geometric series that starts with " + g1 + " and increases by a rate of " + r + " is " + gSum); //prints the answer to the geometric series question

    }
}