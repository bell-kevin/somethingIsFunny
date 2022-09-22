/** ****************************************************************************
 * Mod3comp.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package mod3comp;

import java.io.*;
import java.util.*;

public class Mod3comp {

    public static void main(String[] args) {
        System.out.println("Module 3 Student Scores by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        String stuff;
        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student name: ");
            stuff = computerKeyboardInput.next();
            //System.out.print("Enter test score: ");
            //stuff = computerKeyboardInput.next();
            list[i] = stuff;
            //System.out.print("Enter test score: ");
            //score = computerKeyboardInput.next();
            // list[i] = score;
        } // end for loop
        ObjectList objectList = new ObjectList(list);
        String fileName = "namesAndScores.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(objectList);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Data written to file");
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                objectList = (ObjectList) fileIn.readObject();
                objectList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Mod3comp class
