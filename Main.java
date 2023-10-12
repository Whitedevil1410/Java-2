class RomanToInteger {
    public static int convertRomanToInt(String s) {
        int result = 0;
        int previousValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));

            if (currentValue > previousValue) {
                result += currentValue - previousValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }

    private static int getValue(char c) {
        int i = switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
        return i;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        int integerValue = convertRomanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral '" + romanNumeral + "' is " + integerValue);
    }
}
