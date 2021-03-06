package br.com.alexandre.service;

import br.com.alexandre.dao.PlayListDAO;
import br.com.alexandre.dao.PlayListDaoImp;
import br.com.alexandre.domain.PlayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaylistServiceImp implements PlaylistService {

    @Autowired
    private PlayListDaoImp playlistDao;

    @Override
    public void salvar(PlayList playlist) {
        playlistDao.salvar(playlist);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PlayList> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    @Transactional(readOnly = true)
    public PlayList recuperarPorId(long id) {
        return playlistDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(PlayList playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }
}
