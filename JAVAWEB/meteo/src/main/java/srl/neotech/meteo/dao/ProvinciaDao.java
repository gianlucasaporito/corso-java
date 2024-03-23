package srl.neotech.meteo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import srl.neotech.meteo.dto.T_PROVINCIA;


@Component
public class ProvinciaDao {

    @Autowired
     NamedParameterJdbcTemplate namedParameterJdbcTemplate;

     public List<T_PROVINCIA> getListaProvince(Integer id_regione){
        String selectProvincia= "SELECT * FROM T_PROVINCIA2 WHERE id_regione=:regione_id";
        
         MapSqlParameterSource params =new MapSqlParameterSource();
         params.addValue("regione_id", id_regione);

        List<T_PROVINCIA> select= namedParameterJdbcTemplate.query( selectProvincia,params, (ResultSet rs, int rowNumber)  -> 
        {
            T_PROVINCIA provinciaDto = new T_PROVINCIA();
            provinciaDto.setProvincia_id(rs.getString("id_provincia"));
            provinciaDto.setId_regione(rs.getInt("id_regione"));
            provinciaDto.setProvincia(rs.getString("provincia"));
            return provinciaDto;
        }
        );
        return select;
        
     }

}
