public class S2 {
    public static void main(String[] args) {
        //Write a function that takes a string as a parameter and returns true or false based on how many times “is”
//and “not” words appear on that string. If the appearances are equal then function should return true, if not
//then the function should return false. (case sensitive)
//Examples:
//equalIsNot("This is not") → false
//equalIsNot("This is notnot") → true
//equalIsNot("noisxxnotyynotxisi") → true


        String str1 = "This is not";
        String str2 = "This is notnot";
        String str3 = "noisxxnotyynotxisi";

        System.out.println(equalIsNot(str1));
        System.out.println(equalIsNot(str2));
        System.out.println(equalIsNot(str3));


    }

    private static boolean equalIsNot(String str) {
        boolean result = false;
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++){
            if (i<=str.length()-3){
                if (str.substring(i,(i+2)).equals("is")){
                    countIs++;
                }
            } else {
                if (str.substring(i).equals("is")){
                    countIs++;
                }
            }

            if (i<=str.length()-4){
                if (str.substring(i,(i+3)).equals("not")){
                    countNot++;
                }
            }
            else {
                if (str.substring(i).equals("not")){
                    countNot++;
                }
            }

        }

        if(countIs==countNot){
            result=true;
        }
        return result;

    }
}
