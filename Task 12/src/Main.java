public class Main {
    public static void main(String[] args) {
        String expression = "I like java!!!";

        boolean containsFirstSubstr = expression.contains("java");
        boolean starsWithSubstr = expression.startsWith("I like");
        boolean endsWithSubstr = expression.endsWith("!!!");

        convertStr(expression, containsFirstSubstr, starsWithSubstr, endsWithSubstr);

        replaceCharStr(expression);
    }

    public static void convertStr(String expression, boolean containsFirstSubstr, boolean starsWithSubstr, boolean endsWithSubstr) {
        if (containsFirstSubstr && starsWithSubstr && endsWithSubstr) {
            System.out.println(expression.toUpperCase());
        } else {
            System.out.println("Условие не выполнено");
        }
    }

    private static void replaceCharStr(String expression) {
        String replacedChar = expression.replace('a', 'o');
        String substr = replacedChar.substring(7, 11);

        System.out.println(substr);
    }
}