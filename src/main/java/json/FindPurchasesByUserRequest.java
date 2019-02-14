package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FindPurchasesByUserRequest {

	private String p_cod_idioma;
    private String p_org_id;
    private String p_cod_usu;
    private String p_cod_cli;
    private String p_num_pag_ini;
    private String p_num_pag_fin;
    private String p_txt_order_column;
    private String p_txt_order_type;
    private String p_abono;
    private String p_solo_tramite;

    @JsonProperty(value = "P_COD_IDIOMA")
	public String getP_cod_idioma() {
		return p_cod_idioma;
	}

	public void setP_cod_idioma(String p_cod_idioma) {
		this.p_cod_idioma = p_cod_idioma;
	}

    @JsonProperty(value = "P_ORG_ID")
	public String getP_org_id() {
		return p_org_id;
	}

	public void setP_org_id(String p_org_id) {
		this.p_org_id = p_org_id;
	}

    @JsonProperty(value = "P_COD_USU")
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

	@JsonProperty(value = "P_NUM_PAG_INI")
	public String getP_num_pag_ini() {
		return p_num_pag_ini;
	}

	public void setP_num_pag_ini(String p_num_pag_ini) {
		this.p_num_pag_ini = p_num_pag_ini;
	}

	@JsonProperty(value = "P_NUM_PAG_FIN")
	public String getP_num_pag_fin() {
		return p_num_pag_fin;
	}

	public void setP_num_pag_fin(String p_num_pag_fin) {
		this.p_num_pag_fin = p_num_pag_fin;
	}

	@JsonProperty(value = "P_TXT_ORDER_COLUMN")
	public String getP_txt_order_column() {
		return p_txt_order_column;
	}

	public void setP_txt_order_column(String p_txt_order_column) {
		this.p_txt_order_column = p_txt_order_column;
	}

	@JsonProperty(value = "P_TXT_ORDER_TYPE")
	public String getP_txt_order_type() {
		return p_txt_order_type;
	}

	public void setP_txt_order_type(String p_txt_order_type) {
		this.p_txt_order_type = p_txt_order_type;
	}

	@JsonProperty(value = "p_abono")
	public String getP_abono() {
		return p_abono;
	}

	public void setP_abono(String p_abono) {
		this.p_abono = p_abono;
	}

	@JsonProperty(value = "p_solo_tramite")
	public String getP_solo_tramite() {
		return p_solo_tramite;
	}

	public void setP_solo_tramite(String p_solo_tramite) {
		this.p_solo_tramite = p_solo_tramite;
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

    @Override
    public String toString() {
        return "NonPaymentRequest{" +
                "p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_org_id='" + p_org_id + '\'' +
                ", p_cod_usu='" + p_cod_usu + 
                ", p_cod_cli='" + p_cod_cli + 
                ", p_num_pag_ini='" + p_num_pag_ini + 
                ", p_num_pag_fin='" + p_num_pag_fin + 
                ", p_txt_order_column='" + p_txt_order_column + 
                ", p_txt_order_type='" + p_txt_order_type + 
                ", p_abono='" + p_abono + 
                ", p_solo_tramite='" + p_solo_tramite + 
                "} ";
    }
    
}
