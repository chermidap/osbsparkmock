package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NonPaymentResponse implements Serializable {

    private String s_impago;
    private String s_importe_total;
    private List<NonPayment> s_lista_impagos;
    private String s_cod_error;

    
    @JsonProperty(value = "s_impago")
    public String getS_impago() {
		return s_impago;
	}

	public void setS_impago(String s_impago) {
		this.s_impago = s_impago;
	}

	@JsonProperty(value = "s_importe_total")
	public String getS_importe_total() {
		return s_importe_total;
	}

	public void setS_importe_total(String s_importe_total) {
		this.s_importe_total = s_importe_total;
	}

	@JsonProperty(value = "s_lista_impagos")
	public List<NonPayment> getS_lista_impagos() {
		return s_lista_impagos;
	}

	public void setS_lista_impagos(List<NonPayment> s_lista_impagos) {
		this.s_lista_impagos = s_lista_impagos;
	}

	@JsonProperty(value = "s_cod_error")
	public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
	}

    @Override
    public String toString() {
        return "NonPaymentResponse{" +
                "s_impago='" + s_impago + 
                ", s_importe_total='" + s_importe_total + 
                ", s_lista_impagos='" + s_lista_impagos + 
                ", s_cod_error='" + s_cod_error +
                '}';
    }
}
