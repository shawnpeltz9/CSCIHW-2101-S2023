package HW1;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");}
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)
        Pyramid pyramid = new Pyramid();
        pyramid.Output();
        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)
        String name = "Shawn";
        int age = 21;
        String favcolor = "blue";
        String story = createStory(name, age, favcolor);
        private String createStory(String name, int age, String favcolor) {
            return null;
        }
        System.out.println(story); // prints "Hello! My name is Shawn, and I am 21, and my favorite color is blue"
        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        String str = "I MAKE BREAD";
        int index = 2;
        char ch= 'T';
        String newStr = charReplace(str, index, ch);
        private String charReplace(String str2, int index2, char ch2) {
            return null;
        }
        System.out.println(newStr);
    }        