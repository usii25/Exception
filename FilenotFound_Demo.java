/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {

    public static void main(String args[]) {
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("Ada Kesalahan");
        }
    }
}
