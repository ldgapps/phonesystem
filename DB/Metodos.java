// 
// Decompiled by Procyon v0.5.36
// 

package DB;

import java.sql.PreparedStatement;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.awt.Component;
import phonesystem.Error;

public class Metodos
{
    private Error e;
    private Conectar2 conectar2;
    private EncriptadorPassword1 en;
    
    public Metodos() {
        this.e = new Error();
        this.en = new EncriptadorPassword1("ldg");
    }
    
    public boolean email_habilitado() {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`facturacion` ");
            if (consulta.next()) {
                return consulta.getString(4).equals("Habilitado");
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return false;
        }
        finally {
            this.conectar2.desconectar();
            return false;
        }
    }
    
    public float getprecio(final String codigo) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            if (consulta.next()) {
                return consulta.getFloat(11);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
            return 0.0f;
        }
    }
    
    public String email() {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`facturacion` ");
            if (consulta.next()) {
                return consulta.getString(1);
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String emailpendiente(final String id) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`pendientes` WHERE `id` LIKE '" + id + "'");
            if (consulta.next()) {
                return consulta.getString(2);
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String mensajependiente(final String id) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`pendientes` WHERE `id` LIKE '" + id + "'");
            if (consulta.next()) {
                return consulta.getString(3);
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public void eliminasoli(final String id) throws SQLException {
        System.out.println(id);
        this.conectar2 = new Conectar2();
        this.conectar2.getconnection().prepareStatement("DELETE FROM `phonesystem`.`solicitud de compra` WHERE `id` = '" + id + "'").executeUpdate();
        System.out.println("eliminado");
    }
    
    public String empresa() {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`facturacion` ");
            if (consulta.next()) {
                return consulta.getString(3);
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String getproducto(final String codigo) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            if (consulta.next()) {
                return "Producto: " + consulta.getString(3) + " Marca: " + consulta.getString(4) + " Modelo: " + consulta.getString(5) + " Estado: " + consulta.getString(6) + " Precio: " + consulta.getString(10) + "$";
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public int getproductocantidad(final String codigo) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            if (consulta.next()) {
                return consulta.getInt("cantidad");
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
            return 0;
        }
    }
    
    public String contra() {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`facturacion` ");
            if (consulta.next()) {
                return this.en.decrypt(consulta.getString(2));
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public void addproveedor(final int codigo, final String nombre, final String rif, final String telefono, final String ciudad, final String email, final String banco, final String tipo, final String cuenta, final String productos) throws SQLException {
        this.conectar2 = new Conectar2();
        this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`proveedores` (`\u00ecd`, `nombre`, `rif`, `telefono`, `ciudad`, `email`, `banco`, `tipo de cuenta`, `cuenta`, `productos`, `ingresado`) VALUES ('" + codigo + "', '" + nombre + "', '" + rif + "', '" + telefono + "', '" + ciudad + "', '" + email + "', '" + banco + "', '" + tipo + "', '" + cuenta + "','" + productos + "', CURRENT_DATE())").executeUpdate();
        this.conectar2.desconectar();
    }
    
    public void setentregado(final int codigo) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `entregado`=CURRENT_DATE() WHERE `nequipo`=" + codigo + " ").executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void cancelar_ser(final int codigo) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("DELETE FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` = " + codigo + "").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void setcorreciones(final String codigo, final String correciones) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `correciones`='" + correciones + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void cambiatecnico(final int codigo, final String tecnico, String causa) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `tecnico`='" + tecnico + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo`=" + codigo + "");
            while (consulta.next()) {
                final String fallas = consulta.getString("fallas");
                causa = fallas + "  cambio por:" + causa;
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `fallas`='" + causa + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void setprecio(final String codigo, final String precio) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `precio`='" + precio + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("");
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void setservi(final String codigo, final String servici) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `servicios`='" + servici.trim() + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void agregar_inventario(final String codigo, final String proveedor, final String producto, final String marca, final String modelo, final String estado, final String cantidad, final String costo, final String minimo, final String maximo, final String factura) {
        try {
            this.conectar2 = new Conectar2();
            final float costoi = Float.parseFloat(costo);
            final int cantidadi = Integer.parseInt(cantidad);
            final float costot = costoi * cantidadi;
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`inventario` (`codigo`,  `producto`,`marca` ,`modelo`, `estado`, `cantidad`,`minimo`,`maximo`, `costo`, `costo total`, `precio`, `precio total`) VALUES ('" + codigo + "', '" + producto + "','" + marca + "', '" + modelo + "', '" + estado + "', '" + cantidad + "', '" + minimo + "','" + maximo + "', '" + costo + "','" + costot + "', '0.00','0.00');").executeUpdate();
            this.registra_compra(codigo, producto, marca, modelo, proveedor, costo, cantidad, factura);
        }
        catch (SQLException ex) {
            Logger.getLogger(Conectar2.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void addpendiente(final String correo, final String mensaje) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet re = statement.executeQuery("SELECT * FROM `phonesystem`.`pendientes`");
            int i = 0;
            while (re.next()) {
                ++i;
            }
            ++i;
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`pendientes` (`id`,`email`, `mensaje`) VALUES ('" + i + "', '" + correo + "', '" + mensaje + "')").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void add_solicitud(final String codigo, final String producto, final String marca, final String modelo, final String proveedor, final String precio, final String cantidad, final String factura) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet re = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra`");
            int i = 0;
            while (re.next()) {
                ++i;
            }
            ++i;
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`solicitud de compra` (`id`,`codigo`, `producto`,`marca`,`modelo`, `proveedor`, `precio`, `cantidad`, `fecha`, `factura`, `entregado`) VALUES (NULL,'" + codigo + "', '" + producto + "','" + marca + "','" + modelo + "', '" + proveedor + "', '" + precio + "', " + cantidad + ",CURRENT_DATE() , '" + factura + "', 'no')").executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void add_producto(final String codigo, final String producto, final String marca, final String modelo, final String estado, final String minimo, final String maximo) throws SQLException {
        this.conectar2 = new Conectar2();
        this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`productos` (`codigo`, `producto`, `marca`,`modelo`, `estado`,`minimo`,`maximo`) VALUES ('" + codigo + "', '" + producto + "', '" + marca + "','" + modelo + "', '" + estado + "', '" + minimo + "' ,'" + maximo + "')").executeUpdate();
        this.conectar2.desconectar();
    }
    
    public int nservicio() {
        int j = 0;
        this.conectar2 = new Conectar2();
        try {
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet re = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos`");
            while (re.next()) {
                ++j;
            }
            re.close();
            System.out.println(j);
            ++j;
            System.out.println(j);
            return j;
        }
        catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void agregar_cliente(final String nombre, final String ci, final String telefono, final String telefono2, final String email, final String direccion, final String marca, final String modelo, final String gama, final String bateria, final String memoria, final String sim, final String tapa, final String diagnosticar, final String fallas, final String tecnico, final String tipof, final String imei) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet re = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos`");
            int i = 0;
            while (re.next()) {
                ++i;
            }
            ++i;
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`clientes telefonos` (`nombre`, `ci`, `telefono`, `telefono opcional`, `direccion`, `email`, `entrega`, `nequipo`, `marca`, `modelo`, `gama`, `bateria`, `memoria`, `sim`, `tapa`, `diagnosticar`, `fallas`, `tecnico`, `correciones`, `imei`, `precio`,`entregado`,`fecha tope`,`tipo de fallas`,`servicios`) VALUES ('" + nombre + "', '" + ci + "', '" + telefono + "', '" + telefono2 + "', '" + direccion + "', '" + email + "',CURRENT_DATE(), '" + i + "', '" + marca + "', '" + modelo + "', '" + gama + "', '" + bateria + "', '" + memoria + "', '" + sim + "', '" + tapa + "', '" + diagnosticar + "', '" + fallas + "', '" + tecnico + "', 'por corregir', '" + imei + "',0,'no',DATE_ADD(CURDATE(), INTERVAL 30 DAY),'" + tipof + "','');").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void registra_venta(final String codigo, final String producto, final String marca, final String modelo, final String cliente, final String ci, final String telefono, final String precio, final String cantidad, final String email, final String factura) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`ventas` (`codigo`, `producto`, `marca`, `modelo`, `cliente`, `ci`, `telefono`, `email`, `precio`, `cantidad`, `fecha`, `factura`) VALUES ('" + codigo + "', '" + producto + "', '" + marca + "', '" + modelo + "', '" + cliente + "', '" + ci + "', '" + telefono + "', '" + email + "', '" + precio + "', '" + cantidad + "', CURRENT_DATE(), '" + factura + "')").executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(Conectar2.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void registra_fallas(final String marca, final String modelo, final String gama, final String bateria, final String memoria, final String tapa, final String fallas, final String soluciones) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`fallas` (`nombre`, `gama`, `bateria`, `memoria`, `tapa`, `fallas`, `soluciones`) VALUES ('" + marca + " " + modelo + "', '" + gama + "', '" + bateria + "', '" + memoria + "', '" + tapa + "', '" + fallas + "', '" + soluciones + "')").executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void venta(final String codigo, final String cantidad, final String cliente, final String ci, final String telefono, final String email, final String factura) {
        try {
            final String cod = codigo;
            final int j = 0;
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + cod + "'");
            while (consulta.next()) {
                final int c = consulta.getInt("cantidad");
                int can = Integer.parseInt(cantidad);
                if (c > can || c == can) {
                    can = c - can;
                    final float cost = consulta.getFloat("costo");
                    final float costot = cost * can;
                    final float preci = consulta.getFloat("precio");
                    final float preciot = preci * can;
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `cantidad`='" + can + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `cantidad`='" + can + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `costo total`='" + costot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `precio total`='" + preciot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.registra_venta(codigo, consulta.getString("producto"), consulta.getString("marca"), consulta.getString("modelo"), cliente, ci, telefono, preci + "", cantidad.toString(), email, factura);
                }
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void ventaservi(final String codigo, final String cliente, final String ci, final String telefono, final String factura) {
        try {
            final String cod = codigo;
            final int j = 0;
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + cod + "'");
            while (consulta.next()) {
                final int c = consulta.getInt("cantidad");
                int can = 1;
                if (c > can || c == can) {
                    can = c - can;
                    final float cost = consulta.getFloat("costo");
                    final float costot = cost * can;
                    final float preci = consulta.getFloat("precio");
                    final float preciot = preci * can;
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `cantidad`='" + can + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `cantidad`='" + can + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `costo total`='" + costot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `precio total`='" + preciot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                    this.registra_venta(codigo, consulta.getString("producto"), consulta.getString("marca"), consulta.getString("modelo"), cliente, ci, telefono, preci + "", "1", "", factura);
                }
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void registra_compra(final String codigo, final String producto, final String marca, final String modelo, final String proveedor, final String precio, final String cantidad, final String factura) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`compras`  (`codigo`, `producto`,`marca`,`modelo`, `proveedor`, `precio`, `cantidad`, `fecha`, `factura`) VALUES ('" + codigo + "', '" + producto + "','" + marca + "','" + modelo + "', '" + proveedor + "', '" + precio + "', '" + cantidad + "', CURRENT_DATE(),'" + factura + "')").executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(Conectar2.class.getName()).log(Level.SEVERE, null, ex);
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void compra(final String proveedor, final String codigo, final String cantidad, final String costo, final String factura) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta.next()) {
                final int c = consulta.getInt("cantidad");
                int can = Integer.parseInt(cantidad);
                can += c;
                final float cost = consulta.getFloat("costo");
                final float coston = Float.parseFloat(costo);
                final float costot = coston * can;
                final float preci = consulta.getFloat("precio");
                final float preciot = preci * can;
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `cantidad`='" + can + "' WHERE  `codigo` LIKE '" + codigo + "' ").executeUpdate();
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `costo`='" + costo + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `costo total`='" + costot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `precio total`='" + preciot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                this.registra_compra(codigo, consulta.getString("producto"), consulta.getString("marca"), consulta.getString("modelo"), proveedor, costo, cantidad, factura);
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void setentregacompra(final String id) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra` WHERE `id` = " + id + "");
            while (consulta.next()) {
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`solicitud de compra` SET `entregado`= CURRENT_DATE() WHERE `id` = " + id + " ").executeUpdate();
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void agregar_empleado(final String nombre, final String contra, final String tipo, final JLabel error) {
        try {
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`usuarios` (`nombre`, `pass`,`tipo`) VALUES ('" + nombre + "', '" + contra + "', '" + tipo + "')").executeUpdate();
        }
        catch (SQLException ex) {
            error.setText("El usuario ya existe");
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public String iniciar(final String usu, final String pass) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios`");
            while (usuario.next()) {
                if (usuario.getString("nombre").equals(usu) && usuario.getString("pass").equals(pass)) {
                    if (usuario.getString("tipo").equals("admin")) {
                        return "admin";
                    }
                    if (usuario.getString("tipo").equals("tecnico")) {
                        return "tecnico";
                    }
                    if (usuario.getString("tipo").equals("recepcion")) {
                        return "recepcion";
                    }
                    continue;
                }
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
        return "error";
    }
    
    public Statement retorna() {
        try {
            this.conectar2 = new Conectar2();
            final Statement estado = this.conectar2.getconnection().createStatement();
            return estado;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public void cambia_clave(final String usuario, final String claven) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`usuarios` SET `pass` = '" + claven + "' WHERE `usuarios`.`nombre` = '" + usuario + "'").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void agregar_datos(final String marca, final String modelo, final String gama, final String bateria, final String memoria, final String tapa, final String fallas, final String soluciones) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`fallas` (`nombre`,`Gama`,`bateria`,`memoria`,`tapa`,`fallas`,`soluciones`) VALUES ('" + marca + " " + modelo + "', '" + gama + "','" + bateria + "','" + memoria + "','" + tapa + "','" + fallas + "','" + soluciones + "')").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void enviar_chat(final String recep, final String emi, final String mensaje) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("INSERT INTO `phonesystem`.`chat` (`mensaje`, `emisor`,`receptor`,`hora`) VALUES ('" + mensaje + "','" + emi + "', '" + recep + "',CURRENT_TIME())").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void eliminar_usuario(final String usuario) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("DELETE FROM `phonesystem`.`usuarios` WHERE `usuarios`.`nombre` = '" + usuario + "'").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void setemail(final String email, final String contra, final String empresa, final String habilitado) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`facturacion` SET `email`='" + email + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`facturacion` SET `empresa`='" + empresa + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`facturacion` SET `contrase\u00f1a`='" + this.en.encrypt(contra) + "' ").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`facturacion` SET `habilitado`='" + habilitado + "' ").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void editarproducto(final String codigo, final String producto, final String marca, final String modelo) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `producto`='" + producto + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `marca`='" + marca + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `modelo`='" + modelo + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`productos` SET `producto`='" + producto + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`productos` SET `marca`='" + marca + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`productos` SET `modelo`='" + modelo + "' WHERE `codigo` LIKE '" + codigo + "'").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void pendienteenviado(final String id) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("DELETE FROM `phonesystem`.`pendientes` WHERE `pendientes`.`id` = '" + id + "'").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void cambiarprecio(final String codigo, final String precio) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta.next()) {
                final int c = consulta.getInt("cantidad");
                final float precion = Float.parseFloat(precio);
                final float preciot = precion * c;
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `precio total`='" + preciot + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `precio`=" + precio + " WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void cambiarminimo(final String codigo, final String minimo) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta.next()) {
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `minimo`='" + minimo + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
            }
            final ResultSet consulta2 = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta2.next()) {
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`productos` SET `minimo`='" + minimo + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void cambiarmaximo(final String codigo, final String maximo) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta.next()) {
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`inventario` SET `maximo`='" + maximo + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
            }
            final ResultSet consulta2 = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` WHERE `codigo` LIKE '" + codigo + "'");
            while (consulta2.next()) {
                this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`productos` SET `maximo`='" + maximo + "' WHERE `codigo` LIKE '" + codigo + "' ").executeUpdate();
            }
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public ArrayList getdis(final String dis) {
        final ArrayList array = new ArrayList();
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` LIKE'" + dis + "'");
            while (consulta.next()) {
                array.add("Dispositivo N°:" + consulta.getString("nequipo"));
                array.add("Marca: " + consulta.getString("marca"));
                array.add("Modelo: " + consulta.getString("modelo"));
                array.add("Gama: " + consulta.getString("gama"));
                array.add("Memoria: " + consulta.getString("memoria"));
                array.add("Sim: " + consulta.getString("sim"));
                array.add("Tapa: " + consulta.getString("nequipo"));
                array.add("Diagnosticar: " + consulta.getString("diagnosticar"));
                array.add("Fallas: " + consulta.getString("fallas"));
                array.add("Tipo de falla: " + consulta.getString("tipo de fallas"));
                array.add("Imei: " + consulta.getString("imei"));
            }
            return array;
        }
        catch (SQLException ex) {
            return array;
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public ArrayList getdisadmin(final String dis) {
        final ArrayList array = new ArrayList();
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` LIKE'" + dis + "'");
            while (consulta.next()) {
                array.add(consulta.getString("nequipo"));
                array.add(consulta.getString("nombre"));
                array.add(consulta.getString("ci"));
                array.add(consulta.getString("telefono"));
                array.add(consulta.getString("telefono opcional"));
                array.add(consulta.getString("direccion"));
                array.add(consulta.getString("entrega"));
                array.add(consulta.getString("marca"));
                array.add(consulta.getString("modelo"));
                array.add(consulta.getString("gama"));
                array.add(consulta.getString("bateria"));
                array.add(consulta.getString("memoria"));
                array.add(consulta.getString("sim"));
                array.add(consulta.getString("imei"));
                array.add(consulta.getString("diagnosticar"));
                array.add(consulta.getString("tipo de fallas"));
                array.add(consulta.getString("fallas"));
                array.add(consulta.getString("correciones"));
                array.add(consulta.getString("tecnico"));
                array.add(consulta.getString("entregado"));
                array.add(consulta.getString("fecha tope"));
                array.add("Precio: " + consulta.getString("precio"));
                array.add(consulta.getString("email"));
                array.add(consulta.getString("servicios"));
            }
            return array;
        }
        catch (SQLException ex) {
            return null;
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public String getmarca(final String dis) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` LIKE '" + dis + "'");
            if (consulta.next()) {
                return consulta.getString("marca");
            }
        }
        catch (Exception ex) {
            return "";
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String getmodelo(final String dis) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` LIKE '" + dis + "'");
            if (consulta.next()) {
                return consulta.getString("modelo");
            }
        }
        catch (Exception ex) {
            return "";
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String getmarcaci(final String dis) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `ci` LIKE '" + dis + "'");
            if (consulta.next()) {
                return consulta.getString("marca");
            }
        }
        catch (Exception ex) {
            return "";
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public String getmodeloci(final String dis) {
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `ci` LIKE '" + dis + "'");
            if (consulta.next()) {
                return consulta.getString("modelo");
            }
        }
        catch (Exception ex) {
            return "";
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public ArrayList getdisrecep(final String dis) throws SQLException {
        final ArrayList array = new ArrayList();
        this.conectar2 = new Conectar2();
        final Statement statement = this.conectar2.getconnection().createStatement();
        final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo` LIKE '" + dis + "'");
        while (consulta.next()) {
            array.add("Servicio N°:" + consulta.getString("nequipo"));
            array.add(consulta.getString("nombre"));
            array.add(consulta.getString("ci"));
            array.add(consulta.getString("telefono"));
            array.add(consulta.getString("marca"));
            array.add(consulta.getString("modelo"));
            array.add(consulta.getString("gama"));
            array.add(consulta.getString("memoria"));
            array.add(consulta.getString("sim"));
            array.add(consulta.getString("tapa"));
            array.add(consulta.getString("diagnosticar"));
            array.add(consulta.getString("tipo de fallas"));
            array.add("Fallas: " + consulta.getString("fallas"));
            array.add("Correciones: " + consulta.getString("correciones"));
            array.add("Precio: " + consulta.getString("precio"));
            array.add(consulta.getString("entregado"));
            array.add(consulta.getString("fecha tope"));
            array.add(consulta.getString("marca"));
            array.add(consulta.getString("modelo"));
            array.add(consulta.getString("imei"));
            array.add(consulta.getString("servicios"));
        }
        this.conectar2.desconectar();
        return array;
    }
    
    public ArrayList getdisrecepci(final String ci) {
        final ArrayList array = new ArrayList();
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `ci` LIKE '" + ci + "'");
            while (consulta.next()) {
                if (consulta.isLast()) {
                    array.add("Dispositivo N°: " + consulta.getString("nequipo"));
                    array.add(consulta.getString("nombre"));
                    array.add(consulta.getString("ci"));
                    array.add(consulta.getString("telefono"));
                    array.add(consulta.getString("marca"));
                    array.add(consulta.getString("modelo"));
                    array.add(consulta.getString("gama"));
                    array.add(consulta.getString("memoria"));
                    array.add(consulta.getString("sim"));
                    array.add(consulta.getString("nequipo"));
                    array.add(consulta.getString("diagnosticar"));
                    array.add(consulta.getString("tipo de fallas"));
                    array.add(consulta.getString("fallas"));
                    array.add(consulta.getString("correciones"));
                    array.add("Precio: " + consulta.getString("precio"));
                    array.add(consulta.getString("entregado"));
                    array.add(consulta.getString("fecha tope"));
                    array.add(consulta.getString("marca"));
                    array.add(consulta.getString("modelo"));
                    array.add(consulta.getString("imei"));
                    array.add(consulta.getString("servicios"));
                }
            }
            return array;
        }
        catch (SQLException ex) {
            return array;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public ArrayList getdisrecepimei(final String imei) {
        final ArrayList array = new ArrayList();
        try {
            this.conectar2 = new Conectar2();
            final Statement statement = this.conectar2.getconnection().createStatement();
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `imei` LIKE '%" + imei + "%'");
            while (consulta.next()) {
                if (consulta.isLast()) {
                    array.add("Dispositivo N°: " + consulta.getString("nequipo"));
                    array.add(consulta.getString("nombre"));
                    array.add(consulta.getString("ci"));
                    array.add(consulta.getString("telefono"));
                    array.add(consulta.getString("marca"));
                    array.add(consulta.getString("modelo"));
                    array.add(consulta.getString("gama"));
                    array.add(consulta.getString("memoria"));
                    array.add(consulta.getString("sim"));
                    array.add(consulta.getString("nequipo"));
                    array.add(consulta.getString("diagnosticar"));
                    array.add(consulta.getString("tipo de fallas"));
                    array.add(consulta.getString("fallas"));
                    array.add(consulta.getString("correciones"));
                    array.add("Precio: " + consulta.getString("precio"));
                    array.add(consulta.getString("entregado"));
                    array.add(consulta.getString("fecha tope"));
                    array.add(consulta.getString("marca"));
                    array.add(consulta.getString("modelo"));
                    array.add(consulta.getString("imei"));
                    array.add(consulta.getString("servicios"));
                }
            }
            return array;
        }
        catch (SQLException ex) {
            return array;
        }
        finally {
            this.conectar2.desconectar();
            return null;
        }
    }
    
    public void add_dispo(final String dis, final String marca, final String modelo, final InputStream img) {
        try {
            this.conectar2 = new Conectar2();
            final String sql = "INSERT INTO `phonesystem`.`dispositivos` (`nombre`,`imagen`) VALUES ('" + marca + " " + modelo + "',?)";
            final PreparedStatement statement = this.conectar2.getconnection().prepareStatement(sql);
            statement.setBlob(1, img);
            statement.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(Conectar2.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void add_recibo(final String factura, final InputStream pdf) {
        try {
            this.conectar2 = new Conectar2();
            final String sql = "INSERT INTO `phonesystem`.`facturas`  (`id`,`nombre`,`factura`) VALUES (NULL,'" + factura + "',?)";
            final PreparedStatement statement = this.conectar2.getconnection().prepareStatement(sql);
            statement.setBlob(1, pdf);
            statement.executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
    
    public void editaservi(final String codigo, final String servici) {
        try {
            this.conectar2 = new Conectar2();
            this.conectar2.getconnection().prepareStatement("UPDATE `phonesystem`.`clientes telefonos` SET `servicios`='" + servici + "' WHERE `nequipo`=" + codigo + " ").executeUpdate();
        }
        catch (SQLException ex) {
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
        }
        finally {
            this.conectar2.desconectar();
        }
    }
}
