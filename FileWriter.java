
/**
       File: FileWriter.java
	   Author: Abdul Wahid Pathan
Description:
 */
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter content that you want to write into the file: ");
        String content = input.nextLine();
        String fileName = "FileWriterOutput.txt";

        try {
            File outputFile = new File(fileName);
            if(outputFile.exists()) {
                System.out.println("File already exists, do you want to overwrite it? (y/n)");
                if(input.nextLine().equalsIgnoreCase("n")) {
                    System.out.println("Please enter a new filename:");
                    String newFileName = input.nextLine();
                    if (!newFileName.endsWith(".txt")) {
                        newFileName += ".txt";
                    }
                    outputFile = new File(newFileName);
                }
            }
            try(PrintWriter writer = new PrintWriter(outputFile)) {
                writer.write(content);
                System.out.println("\nContent saved in " + outputFile.getName());
                System.out.println("Would you like to open the file?(y/n)");
                if(input.nextLine().equalsIgnoreCase("y")) {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.edit(outputFile);
                }
            } catch(FileNotFoundException ex) {
                System.out.println("There has been a FileNotFoundException: Error Message: " + ex.getMessage());
            } catch(IOException e) {
                System.out.println("There has been an IOException: Error Message: " + e.getMessage());
            }
        } catch(Exception e) {
            System.out.println("There has been an Exception: Error Message: " + e.getMessage());
        }

        input.close();
    }
}


