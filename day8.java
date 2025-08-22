/*
Reverse a String Word by Word

You are given a string s that consists of multiple words separated by spaces. Your task is to reverse the order of the words in the string. Words are defined as sequences of non-space characters. The output string should not contain leading or trailing spaces, and multiple spaces between words should be reduced to a single space.
Constraints:
1 ≤ s.length ≤ 10^4
The string s may contain leading or trailing spaces.
Words in s are separated by one or more spaces.
s contains printable ASCII characters.
*/
public class day8 {
    public static void revStringWord(String str) {
        int j=str.length()-1;
        String temp="";
        String ans="";
        while(j>=0){
            temp+=str.charAt(j);
            j--;
        }

        for(int i=0;i<temp.length();i++){
        String word="";
        while(i<temp.length() && temp.charAt(i)!=' '){
            word+=temp.charAt(i);
            i++;
        }
        String wordindi="";
        int k=word.length()-1;
        while(k>=0){
            wordindi+=word.charAt(k);
            k--;
        }

        if(wordindi.length()>0){
            ans+=" "+wordindi;
        }
    
    }
    System.out.println(ans.substring(1)); 


    }
    public static void main(String args[]){
        String str="the sky is blue";
        revStringWord(str);

    }
}
