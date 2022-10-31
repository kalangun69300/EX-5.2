/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundproperty;

import java.util.Scanner;
public class BoundProperty {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyPropertyBean source = new MyPropertyBean();
        Listener listener1 = new Listener();
        Listener listener2 = new Listener();
        
        source.addPropertyChangeListener(listener1);
        source.addPropertyChangeListener(listener2);
        
        String score = "";
        do{
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if(score.isEmpty()) break;
            source.setScore(score);
        } while(true);
        sc.close();
        
    }
    
}
