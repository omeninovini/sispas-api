package br.com.vinisystem.sispas.modules.cliente.exceptions;

public class PhoneExistsException extends RuntimeException {

    public PhoneExistsException(String number) {
        super("Telefone " + number + " Já existe cadastrado na base de dados!");
    }
    
}
