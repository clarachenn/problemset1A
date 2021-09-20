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
    double ak = 5; //last term
    double k = 5; //number of terms

    double sk = k/2 * (a1 + ak);
    

System.out.println("QUADRATIC FORMULA");
System.out.println("The Solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + firstX + " and " + secondX + ".");
    
    
    
    }
}