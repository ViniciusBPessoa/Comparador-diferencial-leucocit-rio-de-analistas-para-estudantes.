package dados.interfaces;

import negocio.Chat;

public interface InterfaceControladorChats {
    void Inserir(Chat chat);

    void Deletar();

    void salvar() /* Responsavel por armazenar em um arquivo */;
}
