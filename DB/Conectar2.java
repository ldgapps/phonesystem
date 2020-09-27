// 
// Decompiled by Procyon v0.5.36
// 

package DB;

import java.awt.Component;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.crypto.Cipher;
import phonesystem.Error;
import java.sql.Connection;
import phonesystem.Inicio;

public class Conectar2
{
    Inicio ini;
    EncriptadorPassword1 en;
    private static Connection con;
    private String host2;
    private static final String user2 = "phonesystem";
    private static final String driver = "com.mysql.jdbc.Driver";
    Error e;
    Cipher dcipher;
    
    public Conectar2() {
        this.en = new EncriptadorPassword1("ldg");
        this.host2 = "jdbc:mysql://192.168.0.100:3306";
        this.e = new Error();
        Conectar2.con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conectar2.con = DriverManager.getConnection(this.host2, "phonesystem", "");
            if (Conectar2.con != null) {}
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getconnection() {
        return Conectar2.con;
    }
    
    public boolean conecta() {
        return Conectar2.con != null;
    }
    
    public void desconectar() {
        try {
            Conectar2.con.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Conectar2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void base() {
        try {
            final String encrip = this.en.encrypt("12345");
            Conectar2.con.prepareCall("CREATE DATABASE `phonesystem`").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`productos`( `codigo` VARCHAR(15) NOT NULL,`producto` VARCHAR(30) NOT NULL , `marca` VARCHAR(40) NOT NULL,`modelo` VARCHAR(40) NOT NULL,`estado` VARCHAR(15) NOT NULL,`minimo` INT(15) NOT NULL,`maximo` INT(15) NOT NULL,  PRIMARY KEY (`codigo`)) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`usuarios`( `nombre` VARCHAR(25) NOT NULL , `pass` VARCHAR(30) NOT NULL,`tipo` VARCHAR(15) NOT NULL,PRIMARY KEY (`nombre`)) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`proveedores`( `\u00ecd` INT(50) NOT NULL,`nombre` VARCHAR(40) NOT NULL , `rif` VARCHAR(25) NOT NULL,`telefono` VARCHAR(20) NOT NULL,`ciudad` VARCHAR(25) NOT NULL,`email` VARCHAR(30) NOT NULL,`banco` VARCHAR(25) NOT NULL,`tipo de cuenta` VARCHAR(50) NOT NULL,`cuenta` VARCHAR(50) NOT NULL,`productos` VARCHAR(400) NOT NULL,`ingresado` VARCHAR(15) NOT NULL,PRIMARY KEY (`nombre`)) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("INSERT INTO  `phonesystem`.`usuarios` (`nombre`, `pass`,`tipo`) VALUES ('admin', '" + encrip + "', 'admin')").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`solicitud de compra`( `id` INT(30) NOT NULL,`codigo` VARCHAR(15) NOT NULL,`producto` VARCHAR(40) NOT NULL,`marca` VARCHAR(40) NOT NULL,`modelo` VARCHAR(30) NOT NULL,`proveedor`  VARCHAR(30)  NOT NULL,`precio` FLOAT(15) NOT NULL,`cantidad` INT(40),`fecha` DATE NOT NULL,`factura` VARCHAR(15) NOT NULL,`entregado` VARCHAR(20) NOT NULL,PRIMARY KEY (`id`)) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`clientes telefonos`( `nombre` VARCHAR(40) NOT NULL , `ci` VARCHAR(15) NOT NULL,`telefono` VARCHAR(20) NOT NULL,`telefono opcional` VARCHAR(20) NOT NULL,`direccion` VARCHAR(100) NOT NULL,`email` VARCHAR(30) NOT NULL,`entrega` DATE NOT NULL,`nequipo` INT(40) NOT NULL,`marca` VARCHAR(40) NOT NULL,`modelo` VARCHAR(40) NOT NULL,`gama` VARCHAR(20) NOT NULL,`bateria` VARCHAR(20) NOT NULL,`memoria` VARCHAR(20) NOT NULL,`sim` VARCHAR(20) NOT NULL,`tapa` VARCHAR(20) NOT NULL,`diagnosticar` VARCHAR(20) NOT NULL, `fallas` VARCHAR(100) NOT NULL,`tecnico` VARCHAR(15) NOT NULL,`correciones` VARCHAR(100) NOT NULL,`imei` VARCHAR(40) NOT NULL ,`precio` FLOAT(15),`entregado` VARCHAR(15) NOT NULL,`fecha tope` DATE NOT NULL,`tipo de fallas`  VARCHAR(40) NOT NULL) ENGINE = InnoDB").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`fallas`(`nombre` VARCHAR(80) NOT NULL, `gama` VARCHAR(20) NOT NULL,`bateria` VARCHAR(20) NOT NULL,`memoria` VARCHAR(20) NOT NULL,`tapa` VARCHAR(20) NOT NULL,`fallas` VARCHAR(100) NOT NULL,`soluciones` VARCHAR(100) NOT NULL) ENGINE = InnoDB").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`inventario` ( `codigo` VARCHAR(15) NOT NULL , `producto` VARCHAR(40) NOT NULL ,`marca` VARCHAR(40) NOT NULL, `modelo` VARCHAR(40) NOT NULL , `estado` VARCHAR(15) NOT NULL ,`cantidad` VARCHAR(25) NOT NULL,`minimo` INT(15) NOT NULL, `maximo` INT(15) NOT NULL, `costo` VARCHAR(50) NOT NULL,`costo total` VARCHAR(50) NOT NULL, `precio` VARCHAR(50) NOT NULL,`precio total` VARCHAR(50) NOT NULL,PRIMARY KEY (`codigo`) ) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`chat` (`mensaje` VARCHAR(100)  NOT NULL, `emisor` VARCHAR(30) NOT NULL , `receptor` VARCHAR(30) NOT NULL,`hora` VARCHAR(30) NOT NULL) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`ventas` ( `codigo` VARCHAR(100) NOT NULL , `producto` VARCHAR(30) NOT NULL,`marca` VARCHAR(40) NOT NULL,`modelo` VARCHAR(40) NOT NULL,`cliente`  VARCHAR(50)  NOT NULL,`ci` VARCHAR(30) NOT NULL,`telefono` VARCHAR(20) NOT NULL,`email` VARCHAR(30) NOT NULL,`precio` FLOAT(15) NOT NULL,`cantidad` INT(30) NOT NULL,`fecha` DATE NOT NULL,`factura` VARCHAR(25) NOT NULL) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`compras` ( `codigo` VARCHAR(100) NOT NULL , `producto` VARCHAR(30) NOT NULL,`marca` VARCHAR(40) NOT NULL,`modelo` VARCHAR(40) NOT NULL,`proveedor`  VARCHAR(50)  NOT NULL,`precio` FLOAT(15) NOT NULL,`cantidad` INT(15) NOT NULL,`fecha` DATE NOT NULL,`factura` VARCHAR(15) NOT NULL) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`facturacion`( `email` VARCHAR(50) NOT NULL,`contrase\u00f1a` VARCHAR(30) NOT NULL,`empresa` VARCHAR(50) NOT NULL,`habilitado` VARCHAR(20) NOT NULL) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("INSERT INTO  `phonesystem`.`facturacion` (`email`, `contrase\u00f1a`,`empresa`,`habilitado`) VALUES ('', '', 'PhoneSystem','Inhabilitado')").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`pendientes`( `id` INT(130) NOT NULL,`email` VARCHAR(50) NOT NULL,`mensaje` VARCHAR(1000) NOT NULL) ENGINE = InnoDB;").execute();
            Conectar2.con.prepareCall("CREATE TABLE `phonesystem`.`dispositivos`(`nmbre` VARCHAR(70) NOT NULL,`imagen` MEDIUMBLOB NOT NULL,  PRIMARY KEY (`nombre`)) ENGINE = InnoDB;").execute();
        }
        catch (Exception ex) {}
    }
    
    public Statement retorna() {
        try {
            final Statement estado = Conectar2.con.createStatement();
            return estado;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            this.e.setLocationRelativeTo(null);
            this.e.setVisible(true);
            return null;
        }
    }
}
