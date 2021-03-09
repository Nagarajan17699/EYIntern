/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Nagarajan
 */
public class FileFunctionsDemo {
 
    public static void main(String[] args) throws IOException {
        
        File file = new File("d:/NetBeans Project/InternExercise/src/Day15/createFile.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.isDirectory());
        File f2 = new File("d:/NetBeans Project/InternExercise/src/Day15");
        System.out.println("-----------------------");
        String s[] = f2.list((dir,name)->{
            System.out.println(dir);
            System.out.println("Name is:" +name);
                return name.endsWith(".java");
        });
        
        for(String x:s){
            System.out.println(x);
        }
        
        
    }
}
