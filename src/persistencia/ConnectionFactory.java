package persistencia;

import java.sql.Connection;  
import java.sql.DriverManager;  
import javax.swing.JOptionPane;
/**
 *
 * @author Fabio 
 */
public class ConnectionFactory {
    
    private static Connection connection;
    
    private ConnectionFactory(){
        
    }
    
    public static Connection getConexao(){
            if(connection == null){
                    try{
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/forca", "root","");
                    } catch (Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"Erro de conexao ao banco de dados!");
                    }
            }
            return connection;
    }
}