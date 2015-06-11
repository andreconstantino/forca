/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Jogador;

/**
 *
 * @author a1320548
 */
public class JogadorJDBCDAO implements IJogadorDAO{

    @Override
    public void novoJogador(Jogador jogador) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("insert into Jogador(login,senha)");
            sql.append("values(?,?)");
            psmt = con.prepareStatement(sql.toString());
            
            psmt.setString(1,jogador.getLogin());
            psmt.setString(2, jogador.getSenha()); 
            psmt.execute();            
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
            ex.printStackTrace();
        }finally{
            try {
                psmt.close();
                con.close();
            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
               e.printStackTrace();
            }
            
        }
    }

    @Override
    public Jogador obterJogador(String login) {
        Jogador user = new Jogador();
        Connection con = ConnectionFactory.getConexao();
        ResultSet rs = null;
        PreparedStatement psmt = null;
        String sql;
        try{
            psmt = con.prepareStatement("select * from Jogador where login = '"+login+"'");
            rs = psmt.executeQuery();
            while(rs.next()) { 
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
            ex.printStackTrace();
        }finally{
            try {
                psmt.close();
                rs.close();
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conexão com o banco de dados.");
                e.printStackTrace();
            }
       }
    return user;
    }
    
}
