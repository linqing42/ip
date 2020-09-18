package Dukes.Exceptions;

import Dukes.Exceptions.DukeException;

/**
 * Represents a checked exception.
 * A <code>FileNotFoundException</code> object corresponds to an exception that is thrown where file are invalid or
 * have some issues.
 */
public class FileNotFoundException extends DukeException {
    public FileNotFoundException(String message) {
        super(message);
    }
}