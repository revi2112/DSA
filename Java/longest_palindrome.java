// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String longestPalindrome(String s) {

        /*

            if string is odd length strat from middle and go till the end at both ends ti check if charecters are matching 

            if string is even it will have 2 mids 
            tabbay 
            have 2 mids as two pointers and move 
        */
        int len = s.length();
        String res = "";
        int a; int b;
        int mid = len/2;
        if(len/2 != 0){
            // odd length
            // uyabayu
            // mid is b 7/2 3 (index 3)
            a =  mid -1;
            b = mid + 1;
        }
        else{
            // even length 
            // babbab
            // mid is 6/2 = 3
            // cbbd
            // mid = 2 ; a = 1, b = 2
            // a = 0 , b = 3

            a = mid -1; 
            b = mid;
        }

        while(a>=0 && b<len && s.charAt(a) == s.charAt(b)){
          
            a--;
            b++;
            System.out.print("hi"+ a);
            System.out.print("hi"+ b);
        }
        return s.substring(a + 1, b);
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a = longestPalindrome("cbba");
        System.out.println(a);
    }
}