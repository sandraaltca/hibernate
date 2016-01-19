import javax.persistence.EmbeddedId;

/**
 * Created by 47419119l on 19/01/16.
 */
public class Prestec {
    //llibre, soci, data inici, data final
    @EmbeddedId
    PKPrestec pkPrestec;

    String data_inici;
    String data_final;
    Prestec(){

    }
    Prestec(PKPrestec pkPrestec, String data_final, String data_inici){
        this.pkPrestec= pkPrestec;
        this.data_final=data_final;
        this.data_inici= data_inici;

    }

    public PKPrestec getPkPrestec() {
        return pkPrestec;
    }

    public String getData_final() {
        return data_final;
    }

    public String getData_inici() {
        return data_inici;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    public void setData_inici(String data_inici) {
        this.data_inici = data_inici;
    }

    public void setPkPrestec(PKPrestec pkPrestec) {
        this.pkPrestec = pkPrestec;
    }
}