package test.osmrest.osmrest.exception.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import test.osmrest.osmrest.exception.handler.exception.NoSuchRestException;
import test.osmrest.osmrest.exception.handler.model.RestIncorrectData;


@RestControllerAdvice
public class RestGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<RestIncorrectData> restTemplateNoSuchParamException(final NoSuchRestException exception) {
        final RestIncorrectData data = new RestIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler
    public ResponseEntity<RestIncorrectData> restTemplateException(final Exception exception) {
        final RestIncorrectData data = new RestIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }


}
