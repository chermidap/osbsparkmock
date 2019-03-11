package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetPdfFacturaClienteRequest {

	private String p_cod_idioma;
	private String p_org_id;
	private String p_cod_usu;
	private String p_cod_cli;
	private int p_num_prefactura;

	@JsonProperty(value = "p_cod_idioma")
	public String getP_cod_idioma() {
		return p_cod_idioma;
	}

	public void setP_cod_idioma(String p_cod_idioma) {
		this.p_cod_idioma = p_cod_idioma;
	}

	@JsonProperty(value = "p_org_id")
	public String getP_org_id() {
		return p_org_id;
	}

	public void setP_org_id(String p_org_id) {
		this.p_org_id = p_org_id;
	}

	@JsonProperty(value = "p_cod_usu")
	public String getP_cod_usu() {
		return p_cod_usu;
	}

	public void setP_cod_usu(String p_cod_usu) {
		this.p_cod_usu = p_cod_usu;
	}

	@JsonProperty(value = "p_cod_cli")
	public String getP_cod_cli() {
		return p_cod_cli;
	}

	public void setP_cod_cli(String p_cod_cli) {
		this.p_cod_cli = p_cod_cli;
	}

	@JsonProperty(value = "p_num_prefactura")
	public int getP_num_prefactura() {
		return p_num_prefactura;
	}

	public void setP_num_prefactura(int p_num_prefactura) {
		this.p_num_prefactura = p_num_prefactura;
	}

	@Override
	public String toString() {
		return "OSBGetObtenerFacturasClienteRequest{" + 
				"p_cod_idioma=" + p_cod_idioma + 
				", p_org_id='" + p_org_id + 
				", p_cod_usu=" + p_cod_usu + 
				", p_cod_cli=" + p_cod_cli + 
				", p_num_prefactura=" + p_num_prefactura
				+ '}';
	}

	public String toJSON() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}
}
