public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = "Java   Is   good Language  ok";
        s=s.replaceAll("\\s", "");

        System.out.println(s);
    }
}
