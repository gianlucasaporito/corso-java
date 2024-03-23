package srl.neotech.meteo.dao;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import srl.neotech.meteo.dto.T_REGIONE;

@Component
public class RegioneDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    public List<T_REGIONE> getListaRegioni(){
        String select_regione= "SELECT * FROM T_REGIONE ";
        MapSqlParameterSource params =new MapSqlParameterSource();
        
        List<T_REGIONE> select= namedParameterJdbcTemplate.query(select_regione, params, (ResultSet rs, int rowNumber)  -> 
        {
            T_REGIONE regioneDto = new T_REGIONE();
            regioneDto.setRegione(rs.getString("regione"));
            regioneDto.setId_regione(rs.getInt("regione_id"));
            return regioneDto;
        }
        );
        return select;
    }

}
