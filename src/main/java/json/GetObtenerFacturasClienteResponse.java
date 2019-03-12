package json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetObtenerFacturasClienteResponse {

    private String s_cod_error;
    private List<Bill> s_sabalist_facturas;

	@JsonProperty(value = "s_cod_error")
	public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
	}

	@JsonProperty(value = "s_sabalist_facturas")
	public List<Bill> getS_sabalist_facturas() {
		return s_sabalist_facturas;
	}

	public void setS_sabalist_facturas(List<Bill> s_sabalist_facturas) {
		this.s_sabalist_facturas = s_sabalist_facturas;
	}
}
