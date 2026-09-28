// Rule 07. Exceptions (ERR)
// ERR00-J. Do not suppress or ignore checked exceptions

try {
    // ...
} catch (IOException ioe) {
    throw new RuntimeException(ioe);
}
