package popcornhub;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davip
 */
public class Usuario {
 
    protected String usuario;
    protected String password;
    protected int pin_seguranca;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPin_seguranca() {
        return pin_seguranca;
    }

    public void setPin_seguranca(int pin_seguranca) {
        this.pin_seguranca = pin_seguranca;
    }
    
    
    
    
}
