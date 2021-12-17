package br.com.vinisystem.sispas.shared.exceptions;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiErrors {
    
    List<String> errors = new ArrayList<>();

    public ApiErrors (List<String> errors) {
        this.errors = errors;
    }

    public ApiErrors (String message) {
        this.errors.add(message);
    }

}
