package br.com.csgo.site.service.impl;

import br.com.csgo.site.data.EquipeData;
import br.com.csgo.site.framework.CrudServiceImpl;
import br.com.csgo.site.model.Equipe;
import br.com.csgo.site.service.EquipeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class EquipeServiceImpl extends CrudServiceImpl<Equipe, Long> implements EquipeService {

    private final EquipeData equipeData;

    public EquipeServiceImpl(EquipeData equipeData) {
        this.equipeData = equipeData;
    }

    @Override
    public JpaRepository<Equipe, Long> getRepository() {
        return equipeData;
    }
}
