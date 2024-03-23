package srl.neotech.meteo.dto;

public class T_REGIONE {
    private Integer id_regione;
    private String regione;
    private String superfice;
    private Integer num_residenti;
    private Integer num_comuni;
    private Integer num_province;
    
    
    public Integer getId_regione() {
        return id_regione;
    }
    public void setId_regione(Integer id_regioene) {
        this.id_regione = id_regioene;
    }
    public String getRegione() {
        return regione;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }
    public String getSuperfice() {
        return superfice;
    }
    public void setSuperfice(String superfice) {
        this.superfice = superfice;
    }
    public Integer getNum_residenti() {
        return num_residenti;
    }
    public void setNum_residenti(Integer num_residenti) {
        this.num_residenti = num_residenti;
    }
    public Integer getNum_comuni() {
        return num_comuni;
    }
    public void setNum_comuni(Integer num_comuni) {
        this.num_comuni = num_comuni;
    }
    public Integer getNum_province() {
        return num_province;
    }
    public void setNum_province(Integer num_province) {
        this.num_province = num_province;
    }

    

}
