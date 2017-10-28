//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240510
//Name: #Munir Azemudeen Bin Ahmad

package com.uum.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import static jdk.nashorn.internal.runtime.ScriptingFunctions.readLine;

public class RTAssignment1 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String folder = Path.getPath();
        final File test = new File(folder);

        int countFiles = 0;
        String[] str;
        //str = str[0];
        for (File file : test.listFiles()) {
            if (file.isFile()) {
                countFiles++;
            }
        }
        Count_issue issue = new Count_issue();
        String [] javalist = issue.javalist;
        issue.on(javalist);
        int munir = issue.iss;
         
        

        System.out.println("File count = " + countFiles);
        System.out.println("File dependencies = "+munir);
    }
}
