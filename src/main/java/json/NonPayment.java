package json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NonPayment implements Serializable {

    private String s_num_factura;
    private String s_fecha_emision;
    private String s_importe;

    @JsonProperty(value = "s_num_factura")
    public String getS_num_factura() {
		return s_num_factura;
	}

	public void setS_num_factura(String s_num_factura) {
		this.s_num_factura = s_num_factura;
	}

	@JsonProperty(value = "s_fecha_emision")
	public String getS_fecha_emision() {
		return s_fecha_emision;
	}

	public void setS_fecha_emision(String s_fecha_emision) {
		this.s_fecha_emision = s_fecha_emision;
	}

	@JsonProperty(value = "s_importe")
	public String getS_importe() {
		return s_importe;
	}

	public void setS_importe(String s_importe) {
		this.s_importe = s_importe;
	}

    @Override
    public String toString() {
        return "NonPayment{" +
                "s_num_factura='" + s_num_factura + 
                ", s_fecha_emision='" + s_fecha_emision + 
                ", s_importe='" + s_importe + 
                '}';
    }
}
