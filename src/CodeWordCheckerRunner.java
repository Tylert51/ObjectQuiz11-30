public class CodeWordCheckerRunner {
    public static void main(String[] args) {
        CodeWordChecker sc1 = new CodeWordChecker(5,8,"$");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));

        System.out.println("\n\n");

        CodeWordChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("Mypassport"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
