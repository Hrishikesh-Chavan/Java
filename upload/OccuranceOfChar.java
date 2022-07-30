public class OccuranceOfChar {
    public static void main(String[] args) {
        String s = "abbbsfdgter";
        int totalLength = s.length();
        int afterRemoveChar= s.replace("b", "").length();

        int count = totalLength - afterRemoveChar;

        System.out.println("Character occur " + count + " times");
    }    


}
