/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseno;

/**
 *
 * @author jelly_joneske
 */
public class ReverseNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1234,reversed=0;
        System.out.println("Original Number:" +num);
        while(num!=0){
            int digit=num % 10;
            reversed = reversed*10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number:" +reversed);
    }
    
}
