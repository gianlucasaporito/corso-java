package srl.neotech.robot;

public class Robot {
    private Integer altezzaDellelame;
    private String  direzzioneAttuale;
    
   
    public Integer getAltezzaDellelame() {
        return altezzaDellelame;
    }
    public void setAltezzaDellelame(Integer altezzaDellelame) {
        this.altezzaDellelame = altezzaDellelame;
    }
    public String getDirezzioneAttuale() {
        return direzzioneAttuale;
    }
    public void setDirezzioneAttuale(String direzzioneAttuale) {
        this.direzzioneAttuale = direzzioneAttuale;
    }
   
    private Integer numeroStep;


    public Integer getNumeroStep() {
        return numeroStep;
    }
    public void setNumeroStep(Integer numeroStep) {
        this.numeroStep = numeroStep;
    }
}
