import java.util.*;
import java.lang.*;
class Str{
    public static void main(String args[]){
        Scanner se=new Scanner(System.in);
        
        int flag=0;
        
        System.out.println("Enter the Sentence");
        String string1=se.nextLine();
        System.out.println("Enter the letter");
        char ltr=se.next().charAt(0);

        for(int i=0;i<string1.length();i++){
            if(string1.charAt(i)==ltr){

                System.out.println(string1.substring((i+1), string1.length()));
                flag=1;
                break;
            }
        }

        if (flag!=1){
            System.out.println("The letter does not exist in the sentence");
        }


    }
}