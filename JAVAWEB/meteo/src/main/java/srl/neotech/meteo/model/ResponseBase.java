package srl.neotech.meteo.model;

public class ResponseBase {

    private String returnCode;
    private String errorMassege;
    private Object  returVale;
   
    public String getReturnCode() {
        return returnCode;
    }
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }
    public String getErrorMassege() {
        return errorMassege;
    }
    public void setErrorMassege(String errorMassege) {
        this.errorMassege = errorMassege;
    }
    public Object getReturVale() {
        return returVale;
    }
    public void setReturVale(Object returVale) {
        this.returVale = returVale;
    }
}
