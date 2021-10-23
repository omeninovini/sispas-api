package br.com.vinicius.sispas.modules.cliente.exceptions;

public class TelefoneExistsException extends RuntimeException {

    public TelefoneExistsException(String numero) {
        super("Telefone " + numero + " Já existe cadastrado na base de dados!");
    }
    
}
