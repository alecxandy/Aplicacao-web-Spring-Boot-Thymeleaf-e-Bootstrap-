package br.com.alexandre.dao;

import br.com.alexandre.domain.PlayList;

import java.util.List;

public interface PlayListDAO {

    void salvar(PlayList playlist);

    List<PlayList> recuperar();

    PlayList recuperarPorID(long id);

    void atualizar(PlayList playlist);

    void excluir(long id);
}
