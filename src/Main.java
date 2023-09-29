
import controller.ManagerNumbers;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
    public static void main(String[] args) {
        
        String title = "Equation Program";
        String[] s = new String[]{"Calculate Superlative Equation ", "Calculate Quadratic Equation ", "Exit"};
        Menu<String> menu = new ManagerNumbers(title, s);
        menu.run();
    }
    
}
