package br.com.alexandre.service;

import br.com.alexandre.domain.PlayList;

import java.util.List;

public interface PlaylistService {

    void salvar(PlayList playlist);

    List<PlayList> recuperar();

    PlayList recuperarPorId(long id);

    void atualizar(PlayList playlist);

    void excluir(long id);
}
