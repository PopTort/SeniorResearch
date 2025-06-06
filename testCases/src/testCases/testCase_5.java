package testCases;
//Designed by Tortoise
/*
Test Name: Printing Counter Test
Please read the [TestCase5 Section] in 'README.md'
for information regarding the usage, expected results
and anything else relevant.
**Only edit where it's marked 'EDIT THIS:'
 */


public class testCase_5 {
    public static void main(String[] args) {
        //EDIT THIS:
        //The integer to count by
        //Can not be greater than total, must be INT
        int countBy = 4;

        //EDIT THIS:
        //The total number to count down from
        //Must be INT
        int total = 256;

        //Calling the AI-Generated Function
        aiGeneratedFunction(countBy, total);
    }




    public static void aiGeneratedFunction(int countBy, int total) {
        if (countBy <= 0) {
            System.out.println("CountBy must be greater than zero.");
            return;
        }

        for (int i = total; i >= 0; i -= countBy) {
            System.out.println(i);
        }
    }
}
