package com.bbraun.producto.models.service;

import com.bbraun.producto.models.dao.CategoriaDAO;
import com.bbraun.producto.models.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria findById(String id) {
        return categoriaDAO.findById(id).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDAO.save(categoria);
    }

    @Override
    public void deleteById(String id) {
        categoriaDAO.deleteById(id);
    }
}
