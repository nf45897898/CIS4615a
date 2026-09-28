// Rule 49. Miscellaneous (MSC)
// MSC02-J. Generate strong random numbers

import java.security.SecureRandom;

SecureRandom number = new SecureRandom();
int randomNumber = number.nextInt();
