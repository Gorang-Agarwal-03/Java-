package Recursion;

public class Keypadcombination {
    public static void keyPad(String digit,String[] kp, String result){
        if(digit.length()==0){
            System.out.print(result +", ");
            return;
        }
        int currnum = digit.charAt(0)-'0';
        String currChoices = kp[currnum];

        for(int i =0;i<currChoices.length();i++){
            keyPad(digit.substring(1),kp,result+currChoices.charAt(i));
        }


    }
    public static void main(String[] args) {
        String digit = "23";
        String []kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPad(digit, kp, "");
        
    }
    
}
