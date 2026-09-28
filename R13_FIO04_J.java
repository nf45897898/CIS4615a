// Rule 13. Input Output (FIO)
// FIO04-J. Release resources when they are no longer needed

try (FileInputStream fis = new FileInputStream("file.txt")) {

    // Use the file input stream

}
