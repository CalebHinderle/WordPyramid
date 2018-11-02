/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author cahin7692
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y = JOptionPane.showInputDialog("Please enter a word");
        int length = y.length();
        int s=0;
        pyramid(y);
        
        
    }
    
    public static String pyramid(String a){
    
    if (a.length() == 1||a.length() == 2){
        return a;
    }
    else{
        String st2 = a.substring(0, a.length() - 1);
        System.out.println(a);
        String backwardsWord = "";
        for (int pos =st2.length() - 1; pos >= 0; pos--) {
            backwardsWord += st2.charAt(pos);
        }
        String output="", outputII = backwardsWord.substring(0, backwardsWord.length() - 1);
        for (int pos = outputII.length() - 1; pos >= 0; pos--) {
            output += outputII.charAt(pos);
        }
        System.out.println(output);     
        pyramid(output);
        return a;
    }
    
}
}

