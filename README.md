# Notes App (Java File I/O)

## Project Overview
This is a **text-based Notes Manager** built using **Java**. It allows users to **write notes**, **view all saved notes**, and **exit** the application. Notes are stored in a text file (`notes.txt`) using **FileWriter** and read back using **FileReader / BufferedReader**, demonstrating Java File I/O functionality.  

---

## Tools & Technologies
- **Language:** Java  
- **IDE:** VS Code 
- **Terminal/Command Line:** For compilation and execution  
- **Java Classes Used:** `FileWriter`, `FileReader`, `BufferedReader`, `Scanner`  

---

## Features
1. **Write a new note** – Saves notes to `notes.txt`.  
2. **View all notes** – Reads and displays all notes saved in `notes.txt`.  
3. **Exit** – Closes the application.  
4. **Persistent storage** – Notes remain in `notes.txt` even after exiting the program.  

---

## How It Works
1. Program displays a menu with three options:  
2. User selects:
- **Choice 1:** Program prompts for a note and appends it to `notes.txt`.  
- **Choice 2:** Program reads all notes from `notes.txt` and displays them with numbering.  
- **Choice 3:** Program exits.  
3. The file `notes.txt` is created in the same folder as the program (if it does not exist).  

---

## Screenshots
1. **Screenshot 1:** Using **Choice 1** to write the first note.  
2. **Screenshot 2:** Using **Choice 1** again to write another note.  
3. **Screenshot 3:** Using **Choice 2** to view all notes and then **Choice 3** to exit.  
4. **Screenshot 4:** `notes.txt` file showing all saved notes.  

---

## How to Run

1. Clone or download the project.  
2. Open terminal in the project directory.  
3. Compile the program:
```bash
javac NotesApp.java
