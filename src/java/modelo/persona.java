/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

public class persona {

    private String usuario;
    private String constrasena;

    public persona() {

    }

    public persona(String persona, String usuario) {
        this.usuario = persona;
        this.constrasena = usuario;
    }

    public String getPersona() {
        return usuario;
    }

    public void setPersona(String persona) {
        this.usuario = persona;
    }

    public String getUsuario() {
        return constrasena;
    }

    public void setUsuario(String usuario) {
        this.constrasena = usuario;
    }

    public void validarDatos() {

        if (usuario.equals("root") && (constrasena.equals("root"))) {
            JOptionPane.showMessageDialog(null, "Registro Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Registro Incorrecto");
        }
    }

//    public String validarDatos2(String usuario, String password) {
//
//        if (usuario.equals("root") && (password.equals("root"))) {
//            String registro = usuario;
//            JOptionPane.showMessageDialog(null, "Registro Correcto");
//        } else {
//            JOptionPane.showMessageDialog(null, "Registro Incorrecto");
//        }
//        return usuario;
//    }

}
