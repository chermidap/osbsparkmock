package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserChangeEmailRequest {


	private String p_org_id;
	private String p_cod_idioma;
	private String p_cod_usu;
	private String p_cod_cli;
	private String p_email;

	@JsonProperty(value = "P_ORG_ID")
	public String getP_org_id() {
		return p_org_id;
	}

	public void setP_org_id(String p_org_id) {
		this.p_org_id = p_org_id;
	}

	@JsonProperty(value = "P_COD_IDIOMA")
	public String getP_cod_idioma() {
		return p_cod_idioma;
	}

	public void setP_cod_idioma(String p_cod_idioma) {
		this.p_cod_idioma = p_cod_idioma;
	}

	@JsonProperty(value = "P_COD_USU")
	public String getP_cod_usu() {
		return p_cod_usu;
	}

	public void setP_cod_usu(String p_cod_usu) {
		this.p_cod_usu = p_cod_usu;
	}

	@JsonProperty(value = "P_COD_CLI")
	public String getP_cod_cli() {
		return p_cod_cli;
	}

	public void setP_cod_cli(String p_cod_cli) {
		this.p_cod_cli = p_cod_cli;
	}

	@JsonProperty(value = "P_EMAIL")
	public String getP_email() {
		return p_email;
	}

	public void setP_email(String p_email) {
		this.p_email = p_email;
	}

    public String toJSON() {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

}
