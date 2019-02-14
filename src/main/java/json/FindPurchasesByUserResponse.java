package json;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FindPurchasesByUserResponse implements Serializable {

	private String s_cod_error;
    private List<Purchase> s_sabalist_prodsVenta;
    private List<ProdAbono> s_sabalist_prodsAbono;
    private String S_TXT_LOCALIZADORVENTA;
    private String S_DAT_FECHAHORAVENTA;
    private String S_NUM_IMPORTEVENTACONIVA;

    @JsonProperty(value = "S_COD_ERROR")
    public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
	}
	
	@JsonProperty(value = "P_SABALIST_PRODSVENTAUSR")
	public List<Purchase> getS_sabalist_prodsVenta() {
		return s_sabalist_prodsVenta;
	}

	public void setS_sabalist_prodsVenta(List<Purchase> s_sabalist_prodsVenta) {
		this.s_sabalist_prodsVenta = s_sabalist_prodsVenta;
	}

	@JsonProperty(value = "s_sabalist_prodsAbono")
	public List<ProdAbono> getS_sabalist_prodsAbono() {
		return s_sabalist_prodsAbono;
	}

	public void setS_sabalist_prodsAbono(List<ProdAbono> s_sabalist_prodsAbono) {
		this.s_sabalist_prodsAbono = s_sabalist_prodsAbono;
	}
	
	@JsonProperty(value = "S_TXT_LOCALIZADORVENTA")
    public String getS_TXT_LOCALIZADORVENTA() {
        return S_TXT_LOCALIZADORVENTA;
    }

    public void setS_TXT_LOCALIZADORVENTA(String s_TXT_LOCALIZADORVENTA) {
        S_TXT_LOCALIZADORVENTA = s_TXT_LOCALIZADORVENTA;
    }

    @JsonProperty(value = "S_DAT_FECHAHORAVENTA")
    public String getS_DAT_FECHAHORAVENTA() {
        return S_DAT_FECHAHORAVENTA;
    }

    public void setS_DAT_FECHAHORAVENTA(String s_DAT_FECHAHORAVENTA) {
        S_DAT_FECHAHORAVENTA = s_DAT_FECHAHORAVENTA;
    }

    @JsonProperty(value = "S_NUM_IMPORTEVENTACONIVA")
    public String getS_NUM_IMPORTEVENTACONIVA() {
        return S_NUM_IMPORTEVENTACONIVA;
    }

    public void setS_NUM_IMPORTEVENTACONIVA(String s_NUM_IMPORTEVENTACONIVA) {
        S_NUM_IMPORTEVENTACONIVA = s_NUM_IMPORTEVENTACONIVA;
    }

	@Override
    public String toString() {
        return "NonPaymentRequest{" +
                "s_cod_error='" + s_cod_error + 
                ", s_sabalist_prodsVenta='" + s_sabalist_prodsVenta + 
                ", s_sabalist_prodsAbono='" + s_sabalist_prodsAbono + 
                "} ";
    }
    
}
