public class CountLetters {
    public static void main(String[] args) {
          String str="aabbccaa";

         char[] lett=str.toCharArray();
        int count=1;
        int k=0;
        char l=lett[0];
        for(int i=1;i<lett.length-1;i++){
            if(lett[i]==l){
                count+=1;
            }
            else{
                System.out.print(""+l+""+count);
                k=k+count+1;
                l=str.charAt(k);
                count=1;
            }
        }

    }
}
