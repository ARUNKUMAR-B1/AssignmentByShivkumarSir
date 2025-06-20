public class PalindromeProblem {
    void isPalindrome(String given){
        String replaceSpace=given.replace(" ","").toLowerCase();
        String compare="";
        for(int i=replaceSpace.length()-1;i>=0;i--){
            compare=compare+replaceSpace.charAt(i);
        }
        System.out.println(replaceSpace);
        System.out.println(compare);

        if(compare.equals(replaceSpace)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
//        return false;
    }

    public static void main(String[] args) {
        PalindromeProblem palindromeProblem=new PalindromeProblem();
        palindromeProblem.isPalindrome("MA L a  YA La     m");
//        System.out.println(k);
//        String str1="a  r       u n";
//        String str2=str1.replace(" ","");
//        System.out.println(str2);

//        String str="";
//        String str2="arun";
//        for(int i=0;i<str2.length();i++){
//            str=str+str2.charAt(i);
//        }
//        System.out.println(str);

    }
}
