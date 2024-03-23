package srl.neotech.meteo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import srl.neotech.meteo.model.UpdateClienteRequest;


@Component
public class ClienteDao {
        
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void updateCliente(UpdateClienteRequest client){
        String aggiorna_cliente = "Update T_CLIENTE SET emailCliente=:email ,passwordCliente=passworld where idCliente=:id";
        MapSqlParameterSource params =new MapSqlParameterSource();
        params.addValue("id",client.getId());
        params.addValue("email", client.getEmail());
        params.addValue("password",client.getPassword());
        namedParameterJdbcTemplate.update(aggiorna_cliente, params);
        

    }

}
