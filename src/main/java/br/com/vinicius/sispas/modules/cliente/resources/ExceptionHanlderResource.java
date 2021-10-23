package br.com.vinicius.sispas.modules.cliente.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.vinicius.sispas.modules.cliente.exceptions.TelefoneExistsException;
import br.com.vinicius.sispas.shared.exceptions.ApiErrors;

@RestControllerAdvice
public class ExceptionHanlderResource {
    
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(TelefoneExistsException.class)
    public ApiErrors handleTelefoneExists(TelefoneExistsException e) {
        return new ApiErrors(e.getMessage());
    }
}
