package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
Hint3: The print statement is System.out.println();
*/
public class Pyramid {
    public static void Output() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


}
