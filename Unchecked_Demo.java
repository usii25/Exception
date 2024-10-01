/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class Unchecked_Demo {

    public static void main(String[] args) {
        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi batas :" + e);
        }

    }
}
