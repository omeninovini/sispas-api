package br.com.vinisystem.sispas.modules.cliente.resources;

import br.com.vinisystem.sispas.modules.cliente.exceptions.PhoneExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.vinisystem.sispas.shared.exceptions.ApiErrors;

@RestControllerAdvice
public class ExceptionHandlerResource {
    
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PhoneExistsException.class)
    public ApiErrors handlPhoneExists(PhoneExistsException e) {
        return new ApiErrors(e.getMessage());
    }
}
