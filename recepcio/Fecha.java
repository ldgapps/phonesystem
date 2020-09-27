// 
// Decompiled by Procyon v0.5.36
// 

package recepcio;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Fecha
{
    private Calendar c2;
    
    public Fecha() {
        this.c2 = new GregorianCalendar();
    }
    
    public String dia() {
        String dia = Integer.toString(this.c2.get(5));
        if (dia.length() == 1) {
            dia = "0" + dia;
            return dia;
        }
        return dia;
    }
    
    public String mes() {
        String mes = Integer.toString(this.c2.get(2) + 1);
        if (mes.length() == 1) {
            mes = "0" + mes;
            return mes;
        }
        return mes;
    }
    
    public String agno() {
        final String annio = Integer.toString(this.c2.get(1));
        return annio;
    }
}
