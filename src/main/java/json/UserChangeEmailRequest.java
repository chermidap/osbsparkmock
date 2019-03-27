package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserChangeEmailRequest {


	private String p_org_id;
	private String p_cod_idioma;
	private String p_cod_usu;
	private String p_email;

	@JsonProperty(value = "p_org_id")
	public String getP_org_id() {
		return p_org_id;
	}

	public void setP_org_id(String p_org_id) {
		this.p_org_id = p_org_id;
	}

	@JsonProperty(value = "p_cod_idioma")
	public String getP_cod_idioma() {
		return p_cod_idioma;
	}

	public void setP_cod_idioma(String p_cod_idioma) {
		this.p_cod_idioma = p_cod_idioma;
	}

	@JsonProperty(value = "p_cod_usu")
	public String getP_cod_usu() {
		return p_cod_usu;
	}

	public void setP_cod_usu(String p_cod_usu) {
		this.p_cod_usu = p_cod_usu;
	}

	@JsonProperty(value = "p_email")
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
