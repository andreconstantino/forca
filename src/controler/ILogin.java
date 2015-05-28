package controler;

import model.Jogador;

public interface ILogin {
        public abstract Jogador logar(String login, String senha);
        public abstract boolean cadastrar(String login, String senha);
}
