package org.algos.exception;

import org.algos.enums.DataStructureEnum;

public class AlgosException extends RuntimeException{
    public AlgosException(String errorMessage) {
        super(errorMessage);
    }

    /**
     * Constructs a new runtime exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public AlgosException(String message, Throwable cause) {
        super(message, cause);
    }

}
