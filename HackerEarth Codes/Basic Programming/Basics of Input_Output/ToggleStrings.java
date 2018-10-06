/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranesh
 */
import java.util.*;
public class ToggleStrings {
    public static void main(String[] args){
        String a;
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        char str[] = a.toCharArray();
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(str[i])){
                str[i] = Character.toLowerCase(str[i]);
            }
            else if(Character.isLowerCase(str[i])){
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        //System.out.println(Arrays.toString(str));
        System.out.println(String.valueOf(str));
    }
}
