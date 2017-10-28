//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240510
//Name: #Munir Azemudeen Bin Ahmad

package com.uum.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MUNIR
 */
public class Count_issue {

    public String[] javalist;

    String folder = Path.getPath();

    final File test = new File(folder);
    public int iss;
    public int tjava;

    public Count_issue() {
        Collection<File> all = new ArrayList<>();
        linkedlist(new File(folder), all);
        //Change File Directory Here
        Collection<File> a = all;

        javalist = new String[all.size()];

        Object javaListObject[] = all.toArray();
        
        for (int i=0; i<javaListObject.length; i++){
            javalist[i] = javaListObject[i].toString();
        }
        
        

    }

    static void linkedlist(File file, Collection<File> all) {
        File[] one = file.listFiles();
        if (one != null) {
            for (File two : one) {
                all.add(two);
                linkedlist(two, all);
            }
        }
    }

    public int on(String[] javallist) {
        for (int i = 0; i < javalist.length; i++) {
            try (BufferedReader br = new BufferedReader(new FileReader(javalist[i]))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        
                        iss++;
                    }
                }
            } catch (IOException e) {

            }

            tjava++;
                     
        }
        return tjava;
    }
}
