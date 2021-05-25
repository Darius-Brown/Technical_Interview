public class UniString {

    static boolean isUnique(String Str){
        if (Str.length() > 128){
            return false;
        }
        boolean[] charChecker = new boolean[128];
        for (int i = 0; i < Str.length(); i++){
            int val = Str.charAt(i);
            if (charChecker[val]){
                return false;
            }
            charChecker[val] = true;
        }
        return true;
    }

    // Implement an algorithm to determine if a string has all unique characters. What is you cannot use additional data structures.
    public static void main(String[] args) {
        System.out.println(isUnique("ABCDEFGHIJKLMNOP"));
        System.out.println(isUnique("ABCDEFGHIJKLMNOPP"));
    }
}
