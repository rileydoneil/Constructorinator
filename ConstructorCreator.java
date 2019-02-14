// constructor creator
//Riley O'Neil
//automatically creates constructors

import java.util.*;
import java.io.*;

public class ConstructorCreator{
   
   public static void main(String[] args)
                                          throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      introduction();
      String filePath = findFiles(console);
      scanFile(console, filePath);
   }
      
      
   public static void introduction(){
      System.out.println("welcome to the constructorinator!");
      System.out.println("Please run each file individually and follow the on screen instructions");
      System.out.println("To start off we are going to ask for the location of the selected files");
   }
   
   public static String findFiles(Scanner console)   throws NullPointerException{
      List<String> results = new ArrayList<String>(); //Array list for 
      int number = 0;
      System.out.println("Please enter your full location path of the folder");
      System.out.println("EX. C:/Program Files/Common Files/Services");
      System.out.println("WARNING: Unix environemtns require '/' as a path seperator, not '\\'");
      String fileDestination = console.nextLine(); //C:/Users/riley laptop/OneDrive - Shoreline Community College/CS141/141Day19
      File[] files = new File(fileDestination).listFiles();
      for (File file : files) {
         if (file.isFile()) {
         results.add(file.toString());
         System.out.println(number + "  " + file.getName());
         number++;
         }
      }
      System.out.println("please select a file number >");
      String filePath = results.get(console.nextInt());
      return filePath;
   }
   
   public static void scanFile(Scanner console, String filePath)
                                                                  throws FileNotFoundException{
      ArrayList<Feild> list = new  ArrayList<Feild>();
      int count = 0;
      Scanner in = new Scanner(new File(filePath));
      while(in.hasNext()){
         if(in.next().equals("private")){
            list.add(new Feild(in.next(),in.next())) ;
         }
      }
      System.out.println(list);
      }
}
   public static void createAccessor(){
   }
   
   public static void createMutator(){
   }
   
   public static void createStringTo(){
   }