package HW1;
// Make a method that accepts a string an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,'T')
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String charReplace(String s, int x, char z) {
        if (index < 0 || index >= str.length()) {
            // if the index is out of bounds, return the original string unchanged
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = ch;
        return new String(chars);
    
        return null;
        
    }
    
}
