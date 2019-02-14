package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetCustomerRequest {
    private String p_cod_idioma;
    private String p_org_id;
    private String p_cod_cli;
    private String p_txt_nif;
    private String p_verificado;

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

    @JsonProperty(value = "p_cod_cli")
    public String getP_cod_cli() {
        return p_cod_cli;
    }

    public void setP_cod_cli(String p_cod_cli) {
        this.p_cod_cli = p_cod_cli;
    }

    @JsonProperty(value = "p_txt_nif")
    public String getP_txt_nif() {
        return p_txt_nif;
    }

    public void setP_txt_nif(String p_txt_nif) {
        this.p_txt_nif = p_txt_nif;
    }

    @JsonProperty(value = "p_verificado")
    public String getP_verificado() {
        return p_verificado;
    }

    public void setP_verificado(String p_verificado) {
        this.p_verificado = p_verificado;
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
        return "GetCustomerRequest{" +
                "p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_org_id='" + p_org_id + '\'' +
                ", p_cod_cli='" + p_cod_cli + '\'' +
                ", p_txt_nif='" + p_txt_nif + '\'' +
                ", p_verificado='" + p_verificado + '\'' +
                '}';
    }
}
