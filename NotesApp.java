import java.io.*;
import java.util.*;

public class NotesApp{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String filename = "notes.txt";

        // using loop for user 
        while(true){
            System.out.println("\n===== NOTES APP =====");
            System.out.println("1. Write your note");
            System.out.println("2. View your notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // getting input for choice
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    writeNote(filename, sc);
                    break;
                
                case 2:
                    readNote(filename);
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choise! Please try again.");
                    
            }
        }
    }

    // writing note to file
    public static void writeNote(String filename, Scanner sc){
        try {

            // take input 
            System.out.println("Enter your note: ");
            String note = sc.nextLine();
            FileWriter writer = new FileWriter(filename, true);
            writer.write(note + "\n");
            writer.close();

            System.out.println("=====Note saved successfully !=====");

        } catch (IOException e) {
            System.out.println("Error in writing to the file !");
        }
    }

    // Here we read and display all notes
    public static void readNote(String filename){
        try {
            
            File file = new File(filename);
            if(!file.exists()){
                System.out.println("===No notes found!===");
                return;
            }

            // now reading line by line by usiing bufferreader
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\n Your Notes:");
            int count = 0;

            while((line = reader.readLine()) != null){
                count ++;
                System.out.println(count + ". " + line);
            }
            reader.close();

            if(count == 0){
                System.out.println("No notes are available.");
            }
        } catch (IOException e) {
            System.out.println("Error in reading the file!");
        }
    }
}