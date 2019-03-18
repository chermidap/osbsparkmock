package json;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FindPurchasesByUserResponse implements Serializable {

	private String s_cod_error;
    private List<ProdAbono> s_sabalist_prodsAbono;

    @JsonProperty(value = "S_COD_ERROR")
    public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
	}

	@JsonProperty(value = "s_sabalist_prodsAbono")
	public List<ProdAbono> getS_sabalist_prodsAbono() {
		return s_sabalist_prodsAbono;
	}

	public void setS_sabalist_prodsAbono(List<ProdAbono> s_sabalist_prodsAbono) {
		this.s_sabalist_prodsAbono = s_sabalist_prodsAbono;
	}

	@Override
    public String toString() {
        return "NonPaymentRequest{" +
                "s_cod_error='" + s_cod_error + 
                ", s_sabalist_prodsAbono='" + s_sabalist_prodsAbono + 
                "} ";
    }
    
}
