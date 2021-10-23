package br.com.vinicius.sispas.shared.exceptions;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiErrors {
    
    List<String> erros = new ArrayList<>();

    public ApiErrors (List<String> errors) {
        this.erros = errors;
    }

    public ApiErrors (String message) {
        this.erros.add(message);
    }

}
