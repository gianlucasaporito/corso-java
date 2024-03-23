package srl.neotech.meteo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import srl.neotech.meteo.dto.T_CITTA;


@Component
public class CittaDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<T_CITTA> getListaCitta(String provincia){
        String selectCitta= "SELECT * FROM T_CITTA where provincia=:provincia";
         MapSqlParameterSource params =new MapSqlParameterSource();
         params.addValue("provincia", provincia);

          List<T_CITTA> select= namedParameterJdbcTemplate.query( selectCitta,params, (ResultSet rs, int rowNumber)  -> 
        {
           T_CITTA cittaDto = new T_CITTA();
           cittaDto.setProvincia(rs.getString("provincia"));
           cittaDto.setIstat(rs.getString("istat"));
            cittaDto.setComune(rs.getString("comune"));
            return cittaDto;
        }
        );
        return select;

        
    }
}
