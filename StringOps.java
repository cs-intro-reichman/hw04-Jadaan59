public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String checkVowels = "vowels are fun", checkCamel = "    Intro to  coMPUter   sCIEnce";
        int [] checkAllInIndex = allIndexOf( "Hello world", ' ');
        System.out.println(capVowelsLowRest(checkVowels));
        System.out.println(camelCase(checkCamel));
        printarray(checkAllInIndex);
    }

    /* The function returns a string in which all the English vowels
    (a,e,i,o,u) in the original strings are changed to uppercase,
     and all the other characters are changed to lowercase */
    public static String capVowelsLowRest(String string) {
        String NewString = lowerCase(string);
        String finalString = "";

        for (int i = 0; i < NewString.length(); i++) {
            char currentchar = NewString.charAt(i);
            switch (currentchar) {
                case 'a':
                    finalString += 'A';
                    break;
                case 'e':
                    finalString += 'E';
                    break;
                case 'i':
                    finalString += 'I';
                    break;
                case 'o':
                    finalString += 'O';
                    break;
                case 'u':
                    finalString += 'U';
                    break;
                default:
                    finalString += currentchar;
                    break;
            }
        }
        return finalString;
    }
    /*
     * This function takes an input string that contains only letters. Returns the string:
     * 1: The first word is changed to lower-case letters.
     * 2: The first letter of each word is changed to upper-case letter
     *    and all the remaining letters in the word is changed to lower-case letters.
     * 3: All spaces are removed.
     */
    public static String camelCase(String string) {
        String str1 = lowerCase(string);
        String finString = "";
        for (int i = 0; i < string.length(); i++) {
            if (str1.charAt(i) == ' ' && ('a' <= str1.charAt(i+1) && str1.charAt(i+1) <= 'z')) {
                ++i;
                finString += (char) (str1.charAt(i) - 32);
            }
            else if ( str1.charAt(i) == ' ' ) {
                i = i ;
            }else{
                finString += (char) str1.charAt(i);
            }
        }
        return finString;
    }

    public static int[] allIndexOf(String string, char chr) {
        int [] arr = new int[containLetter(string, chr)]; // The length is how many times the char in the string.
        int index = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr) {
                arr[index] = i;
                index++;
            }
        }
        return arr ;
    }

    /**
     * //  * Returns a string which is identical to the original string,
     * //  * except that all the upper-case letters are converted to lower-case letters.
     * Non-letter characters are left as is.
     * we assume that we make this proces on a single String
     */
    public static String lowerCase(String string) {
        String newstr = "";
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) >= 'A') && (string.charAt(i) <= 'Z')) {
                newstr += (char) (string.charAt(i) + 32);
            } else {
                newstr += (char) string.charAt(i);
            }
        }
        return newstr;
    }

    /*
     * This function returns the number of times the char in the string
     */

    public static int containLetter (String s , char c) {
        int contains = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                contains ++;
            }
        }
        return contains;
    }

    public static void printarray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}