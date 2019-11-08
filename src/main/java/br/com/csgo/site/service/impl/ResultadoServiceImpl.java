package br.com.csgo.site.service.impl;


import br.com.csgo.site.data.ResultadoData;
import br.com.csgo.site.framework.CrudServiceImpl;
import br.com.csgo.site.model.Resultado;
import br.com.csgo.site.service.ResultadoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ResultadoServiceImpl extends CrudServiceImpl<Resultado, Long> implements ResultadoService {

 private final ResultadoData resultadoData;

    public ResultadoServiceImpl(ResultadoData resultadoData) {
        this.resultadoData = resultadoData;
    }

    @Override
    public JpaRepository<Resultado, Long> getRepository() {
        return resultadoData;
    }
}
