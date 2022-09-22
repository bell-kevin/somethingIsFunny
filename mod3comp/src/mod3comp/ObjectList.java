/** ****************************************************************************
 * ObjectList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package mod3comp;

import java.io.*;
import java.util.*;

public class ObjectList implements Serializable {

    ArrayList<String> objects = new ArrayList<>();

//******************************************************************************
    public ObjectList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            objects.add(list[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************
} // end ObjectList class
