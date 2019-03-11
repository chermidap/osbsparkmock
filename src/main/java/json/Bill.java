package json;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bill implements Serializable {

	private String s_num_factura;
	private String s_fec_factura;
	private String s_producto;
	private String s_tipo_factura;
	private String s_parking;
	private String s_importe;
	private String s_estado;
	private String s_num_prefactura;

	@JsonProperty(value = "s_num_factura")
	public String getS_num_factura() {
		return s_num_factura;
	}

	public void setS_num_factura(String s_num_factura) {
		this.s_num_factura = s_num_factura;
	}

	@JsonProperty(value = "s_fec_factura")
	public String getS_fec_factura() {
		return s_fec_factura;
	}

	public void setS_fec_factura(String s_fec_factura) {
		this.s_fec_factura = s_fec_factura;
	}

	@JsonProperty(value = "s_producto")
	public String getS_producto() {
		return s_producto;
	}

	public void setS_producto(String s_producto) {
		this.s_producto = s_producto;
	}

	@JsonProperty(value = "s_tipo_factura")
	public String getS_tipo_factura() {
		return s_tipo_factura;
	}

	public void setS_tipo_factura(String s_tipo_factura) {
		this.s_tipo_factura = s_tipo_factura;
	}

	@JsonProperty(value = "s_parking")
	public String getS_parking() {
		return s_parking;
	}

	public void setS_parking(String s_parking) {
		this.s_parking = s_parking;
	}

	@JsonProperty(value = "s_importe")
	public String getS_importe() {
		return s_importe;
	}

	public void setS_importe(String s_importe) {
		this.s_importe = s_importe;
	}

	@JsonProperty(value = "s_estado")
	public String getS_estado() {
		return s_estado;
	}

	public void setS_estado(String s_estado) {
		this.s_estado = s_estado;
	}

	@JsonProperty(value = "s_num_prefactura")
	public String getS_num_prefactura() {
		return s_num_prefactura;
	}

	public void setS_num_prefactura(String s_num_prefactura) {
		this.s_num_prefactura = s_num_prefactura;
	}
	
	@Override
    public String toString() {
        return "OSBBill{" +
                "s_num_factura='" + s_num_factura + '\'' +
                ", s_fec_factura=" + s_fec_factura +
                ", s_producto=" + s_producto +
                ", s_tipo_factura=" + s_tipo_factura +
                ", s_parking=" + s_parking +
                ", s_importe=" + s_importe +
                ", s_estado=" + s_estado +
                ", s_num_prefactura=" + s_num_prefactura +
                '}';
    }
    
}
