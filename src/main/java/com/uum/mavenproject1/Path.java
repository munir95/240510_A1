//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240510
//Name: #Munir Azemudeen Bin Ahmad

package com.uum.mavenproject1;

import java.nio.file.Paths;

public class Path {
    
    public static String getPath(){
     
        return Paths.get("").toAbsolutePath().toString() + "\\" + "TESTER";
        
    }
    
    
}
