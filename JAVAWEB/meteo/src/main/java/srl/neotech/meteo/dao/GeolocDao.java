package srl.neotech.meteo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;


import srl.neotech.meteo.dto.T_GEOLOC;

@Component
public class GeolocDao {
     @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public T_GEOLOC getGeoloc(String istat){
        System.out.println(istat);
        String selectGeoloc= "select * from T_GEOLOC where istat= :istat";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("istat" , istat);
        
        T_GEOLOC select= namedParameterJdbcTemplate.queryForObject( selectGeoloc,params, (ResultSet rs, int rowNumber)  -> 
        {
           T_GEOLOC geolocDto = new T_GEOLOC();
           geolocDto.setIstat(rs.getString("istat"));
           geolocDto.setLat(rs.getString("lat"));
            geolocDto.setLng(rs.getString("lng"));
            return geolocDto;
        }
        );
        return select;

    }


}
