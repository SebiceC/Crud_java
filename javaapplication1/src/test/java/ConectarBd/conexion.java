/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConectarBd;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class conexion {
    Connection con = null;//con de conectar
    String driver="com.mysql.jdbc.Driver";
    String user="root";
    String pass="Abc123";
    //String url="jdbc:mysql://localhost:3306/vehiculos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String url="jdbc:mysql://localhost:3306/vehiculos";

    public conexion(){
        //con=null;
        try {//excepciones en el transcurso de la ejecución de un programa
            Class.forName(driver);//
        }con = DriverManager.getConnection(url,user,pass);
                JOptionPane.showMessageDialog(null, "Conexión Activada");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de acceso "+e.toString());

            }
        }
        public Connection getConnection(){
            return con;// retorna el valor de la conexion
    }

// MySQL
create table propietario(
numident int primary key not null,
nombres varchar(50) not null,
genero varchar(1) not null,
idciudad int not null
);
INSERT INTO propietario 
VALUES 
(20,'ANTONIO CASTRO','M',1), 
(21,'JAMES TRUJILLO','M',1), 
(22,'SANDRA PEREZ','M',2)