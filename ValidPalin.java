public class ValidPalin {
    public static void main(String[] args) {
        String str= "race a car";

        boolean result = palin(str);
        System.out.println(result);

    }

    public static boolean palin(String str){
        
        String stri = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left =0, right = stri.length()-1;

        while (left<right) {
            
            if(stri.charAt(left) != stri.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
