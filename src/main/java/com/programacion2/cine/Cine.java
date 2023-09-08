
package com.programacion2.cine;

import com.programacion2.cine.igu.MenuInicial;

/**
 *
 * @author DavidRoco
 */
public class Cine {

    public static void main(String[] args) {
        MenuInicial pantallaInicial = MenuInicial.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
    }
}
