package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favorite color in a string format and an int format
// Hint2: You will need to return a string. You can concat the int variables and the string variables together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs {
    public static String createStory(String name, int age, String favcolor) {
        String story = name + " is " + age + " years old and loves the color " + favcolor + ".";
        return story;
    }}