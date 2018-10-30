package by.bsuir.qasw.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Wrong vector length")
public class VectorLengthException extends OperationException {
    public VectorLengthException() {
    }

    public VectorLengthException(String message) {
        super(message);
    }

    public VectorLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public VectorLengthException(Throwable cause) {
        super(cause);
    }
}
