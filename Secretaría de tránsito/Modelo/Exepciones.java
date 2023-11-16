package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exepciones {
    
    public void verificarNumero(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo numeros", "numeros", 0);
        }
    }

    public void verificarLetra(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo letras", "Letras", 0);
        }

    }

    public boolean verificaCorreo(String correo) {
       Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                    + "[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$");


        Matcher mat = patron.matcher(correo);

        return mat.find();
    }

}

