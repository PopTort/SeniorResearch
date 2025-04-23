package testCases;
//Designed by Tortoise
/*
Test Name: Simple Tri-Angle Calculator
Please read the [TestCase2 Section] in 'README.md'
for information regarding the usage, expected results
and anything else relevant.
**Only edit where it's marked 'EDIT THIS:'
 */


public class testCase_2 {
    public static void main(String[] args) {

        //EDIT THIS:
        //Must be less than 180
        //Must be an integer
        int angle1 = 45;

        //EDIT THIS:
        //Must be less than 180
        //Must be an integer
        int angle2 = 60;



        //Calling the AI-Generated Function
        aiGeneratedFunction(angle1, angle2);
    }




    public static void aiGeneratedFunction(int angle1, int angle2) {
        // The sum of the angles in a triangle is 180 degrees
        if (angle1 > 0 && angle2 > 0 && angle1 + angle2 < 180) {
            int angle3 = 180 - (angle1 + angle2);
            System.out.println("The third angle is: " + angle3 + " degrees");
        } else {
            System.out.println("Invalid input: The angles do not form a triangle.");
        }
    }
}
