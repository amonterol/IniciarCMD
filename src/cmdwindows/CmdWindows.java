/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdwindows;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * , "-l CUADRO.LGO"
 *
 * @author PC
 */
public class CmdWindows {

    public static void main(String[] args) throws IOException, InterruptedException {

        
       
        
        ProcessBuilder processBuilder = new ProcessBuilder();
        

//Con la version en ingles
        //processBuilder.environment().put("Path", "C:\\Program Files (x86)\\Softronics\\Microsoft Windows Logo");
        //processBuilder.command("cmd.exe", "/c", "logo32.exe -l C:\\Program Files (x86)\\Softronics\\Microsoft Windows Logo\\cuadro.LGO").start();
        
        
        //Con el programa que me paso mario ESTOY USANDO UN FICHERO QUE VIENE COMO EJEMPLO
        //PARA MI EL PROBLEMA ESTA CON LA PANTALLA INICIAL DONDE SE ESCOJE EL ENTORNO
        processBuilder.environment().put("Path", "C:\\Program Files (x86)\\MSWLogo");
        processBuilder.command("cmd.exe", "/c", "LOGO32.EXE -L C:\\Program Files (x86)\\MSWLogo\\TORRESHANOI.LGO").start();
        
        //Con otra version en espannol
        //processBuilder.environment().put("Path", "C:\\Program Files (x86)\\MSWLogoEs65b");
        //processBuilder.command("cmd.exe", "/c", "MSWLOGO.EXE -L C:\\Program Files (x86)\\MSWLogoEs65b\\CUADRADO.LOG").start();
      
        processBuilder.redirectErrorStream();
       
        
        
        
        /* ESTAS SON OTRAS PRUEBAS 
       Funciona pero con el mismo problema
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/C", "start", "logo32.exe", "-l cuadro");
        Map<String, String> envs = processBuilder.environment();
        envs.clear();
        System.out.println(envs.get("Path"));
        envs.put("Path", "C:\\Program Files (x86)\\Softronics\\Microsoft Windows Logo");
             
        
        System.out.println(envs.get("Path"));
        processBuilder.command("cmd.exe", "/c", "logo32.exe -l AXIS.LGO").start();
                
        
        
        System.out.println(envs.get("Path"));
        processBuilder.redirectErrorStream();
        
        System.out.println(envs.get("Path"));
         */
    }

    /*
     public static void main(String[] args) throws IOException,
     InterruptedException {
     
     ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "start", "logo32.exe", "-l CUADRO.LGO" );
     Map<String, String> envs = pb.environment();
     //envs.clear();
     System.out.println(envs.get("Path")); 
     envs.put("Path", "C:\\Program Files (x86)\\Softronics\\Microsoft Windows Logo");
     
     System.out.println(envs.get("Path")); 
     pb.redirectErrorStream();
     pb.start();
     System.out.println(envs.get("Path"));
    
     }
     */
 /*
    
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }
     */
 /*
    @NotNull
protected Process startProcess(@NotNull List<String> commands) throws IOException {
  ProcessBuilder builder = new ProcessBuilder(commands);
  setupEnvironment(builder.environment());
  builder.directory(myWorkDirectory);
  builder.redirectErrorStream(false);
  return builder.start();
}
    
     */
}
