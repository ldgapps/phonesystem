// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import DB.Conectar2;
import java.awt.Component;

public class PhoneSystem
{
    public static void main(final String[] args) {
         cargar carga = new cargar();
        carga.setVisible(true);
        carga.setLocationRelativeTo(null);
        final Conectar2 co2 = new Conectar2();
        if (co2.conecta()) {
            Inicio inicio = new Inicio();
            carga.setVisible(false);
            inicio.setVisible(true);
            inicio.setSize(500, 548);
            inicio.setLocationRelativeTo(null);
        }
        else {
            final Error e = new Error();
            carga.setVisible(false);
            e.setLocationRelativeTo(null);
            e.setVisible(true);
            e.setDefaultCloseOperation(3);
        }
        co2.desconectar();
    }
}
