package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SetDetailCustomerRequest {
    private String p_cod_idioma;
    private String p_org_id;
    private String p_cod_usu;
    private String p_cod_cli;
    private String p_tipo_via;
    private String p_domicilio;
    private String p_codigo_postal;
    private String p_num_domicilio;
    private String p_municipio;
    private String p_provincia;
    private String p_telefono;
    private String p_solo_telefono;//(S,N) Servicio que permite modificar los datos de un usuario (sov-26)

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
    @JsonProperty(value = "p_tipo_via")
    public String getP_tipo_via() {
        return p_tipo_via;
    }

    public void setP_tipo_via(String p_tipo_via) {
        this.p_tipo_via = p_tipo_via;
    }
    @JsonProperty(value = "p_domicilio")
    public String getP_domicilio() {
        return p_domicilio;
    }

    public void setP_domicilio(String p_domicilio) {
        this.p_domicilio = p_domicilio;
    }
    @JsonProperty(value = "p_codigo_postal")
    public String getP_codigo_postal() {
        return p_codigo_postal;
    }

    public void setP_codigo_postal(String p_codigo_postal) {
        this.p_codigo_postal = p_codigo_postal;
    }
    @JsonProperty(value = "p_num_domicilio")
    public String getP_num_domicilio() {
        return p_num_domicilio;
    }

    public void setP_num_domicilio(String p_num_domicilio) {
        this.p_num_domicilio = p_num_domicilio;
    }
    @JsonProperty(value = "p_municipio")
    public String getP_municipio() {
        return p_municipio;
    }

    public void setP_municipio(String p_municipio) {
        this.p_municipio = p_municipio;
    }
    @JsonProperty(value = "p_provincia")
    public String getP_provincia() {
        return p_provincia;
    }

    public void setP_provincia(String p_provincia) {
        this.p_provincia = p_provincia;
    }
    @JsonProperty(value = "p_telefono")
    public String getP_telefono() {
        return p_telefono;
    }

    public void setP_telefono(String p_telefono) {
        this.p_telefono = p_telefono;
    }
    @JsonProperty(value = "p_solo_telefono")
    public String getP_solo_telefono() {
        return p_solo_telefono;
    }

    public void setP_solo_telefono(String p_solo_telefono) {
        this.p_solo_telefono = p_solo_telefono;
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
        return "OSBSetDetailCustomerRequest{" +
                "p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_org_id='" + p_org_id + '\'' +
                ", p_cod_usu='" + p_cod_usu + '\'' +
                ", p_cod_cli='" + p_cod_cli + '\'' +
                ", p_tipo_via='" + p_tipo_via + '\'' +
                ", p_domicilio='" + p_domicilio + '\'' +
                ", p_codigo_postal='" + p_codigo_postal + '\'' +
                ", p_num_domicilio='" + p_num_domicilio + '\'' +
                ", p_municipio='" + p_municipio + '\'' +
                ", p_provincia='" + p_provincia + '\'' +
                ", p_telefono='" + p_telefono + '\'' +
                ", p_solo_telefono='" + p_solo_telefono + '\'' +
                '}';
    }
}
