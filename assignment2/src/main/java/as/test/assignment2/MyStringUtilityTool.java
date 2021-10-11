package as.test.assignment2;

public class MyStringUtilityTool {


    public static String reverseString(String input) {
        String returnString = "";
        for (int i = input.length() -1; i >= 0; i--) {
            returnString += input.charAt(i);
        }
        return returnString;
    }

    public static String capitalizeString(String input) {
        char[] inputArray = input.toCharArray();
        for (int x = 0; x < inputArray.length; x++) {
            if (inputArray[x] >= 'a' && inputArray[x] <= 'z') {
                inputArray[x] = (char) ((int) inputArray[x] - 32);
            }
        }
        return String.valueOf(inputArray);
    }

    public static String lowercaseString(String input) {
        char[] inputArray = input.toCharArray();
        for (int x = 0; x < inputArray.length; x++) {
            if (inputArray[x] >= 'A' && inputArray[x] <= 'Z') {
                inputArray[x] = (char) ((int) inputArray[x] + 32);
            }
        }
        return String.valueOf(inputArray);

    }
}
