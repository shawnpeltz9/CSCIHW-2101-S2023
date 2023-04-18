package HW2;


public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5
    public static double calculateMS(double side1, double side2){
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }

    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(69.3) would return a D
        public static String calcGrade(double grade) {
            int roundedGrade = (int) Math.ceil(grade);
            if (roundedGrade >= 90 && roundedGrade <= 100){
                return "A";
            } else if (roundedGrade >= 80 && roundedGrade <= 89){
                return "B";
            } else if (roundedGrade >= 70 && roundedGrade <= 79){
                return "C";
            } else if (roundedGrade >= 60 && roundedGrade <= 69){
                return "D";
            } else {
                return "F";
            }
        }
    
    





    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0
    public static double calcTipPP(double totalBill, int numOfPeople, double tipPercent) {
        double totalTip = (totalBill * tipPercent / 100);
        double tipPP = totalTip / numOfPeople;
        tipPP = Math.ceil(tipPP); 
        return tipPP;
    }
 


    // You can either create a tester class or put your code here
     public static void main(String[] args){
        double side1 = 3;
        double side2 = 4;
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("The hypotenuse is: " + hypotenuse);

        double myGrade = 86.4;
        String gradeLetter = calcGrade(myGrade);
        System.out.println("My grade is: " + gradeLetter);

        double totalBill = 100;
        int numOPeople = 4;
        double tipPercent = 18;
        double tipPP = calcTipPP(totalBill, numOPeople, tipPercent);
        System.out.println("Tip per person: $" + tipPP);
    
    }
}
