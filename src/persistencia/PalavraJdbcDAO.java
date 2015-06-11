package persistencia;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Random;
import model.Jogador;
import model.Palavra;

/**
 * @author a1320556
 */
public class PalavraJdbcDAO implements IPalavraDAO{
    public Palavra obterPalavraAleatoria(){
        List palavras = null;
        Palavra palavraEscolhida = null;
        int numeroAleatorio;
        PreparedStatement pst = null;
        ResultSet rset = null;
        Connection cnct = null;
        try{
            cnct = ConnectionFactory.getConexao();
            pst = cnct.prepareStatement("select * from Palavra");
            rset = pst.executeQuery();
            Random gerador = new Random();
            numeroAleatorio = gerador.nextInt(quantidadePalavras());
            int contador = 0;
            while(rset.next() && contador < numeroAleatorio) {
                contador++;
            }
            
            //recuperar os dados da palavra na posicao numeroAleatorio
            palavraEscolhida = new Palavra();
            palavraEscolhida.setPalavra(rset.getString("palavra"));
            palavraEscolhida.setDica(rset.getString("dica"));
            //obter o jogador
            IJogadorDAO jogadorDAO = new JogadorJDBCDAO();
            Jogador jogador = jogadorDAO.obterJogador(rset.getString("loginjogador"));
            palavraEscolhida.setAutorPalavra(jogador);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return palavraEscolhida;
    }

    private int quantidadePalavras() {
        PreparedStatement pst = null;
        ResultSet rset = null;
        Connection cnct = null;
        int quantidade = 0;
        try{
            cnct = ConnectionFactory.getConexao();
            pst = cnct.prepareStatement("select count(*) as numero from Palavra");
            rset = pst.executeQuery();
            if (rset.next()) {
                quantidade = rset.getInt("numero");
            } else {
                System.out.println("error: could not get the record counts");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return quantidade;
        
    }
    
    public void cadastrarPalavra(Palavra palavra) {
        
    }
}
