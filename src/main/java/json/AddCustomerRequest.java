package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddCustomerRequest {
    private String p_cod_idioma;
    private String p_org_id;
    private String p_cod_usu;
    private String p_tipo_alta;//Valores posibles: (O)tros o (A)bonado. Por defecto (O)tros
    private String p_txt_vinculaUsuario;//Vincular cliente. (S)í o (N)o. Por defecto (S)í
    private CustomerP p_datos_cliente;

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

    @JsonProperty(value = "p_tipo_alta")
    public String getP_tipo_alta() {
        return p_tipo_alta;
    }

    public void setP_tipo_alta(String p_tipo_alta) {
        this.p_tipo_alta = p_tipo_alta;
    }

    @JsonProperty(value = "p_txt_vinculaUsuario")
    public String getP_txt_vinculaUsuario() {
        return p_txt_vinculaUsuario;
    }

    public void setP_txt_vinculaUsuario(String p_txt_vinculaUsuario) {
        this.p_txt_vinculaUsuario = p_txt_vinculaUsuario;
    }

    @JsonProperty(value = "p_datos_cliente")
    public CustomerP getP_datos_cliente() {
        return p_datos_cliente;
    }

    public void setP_datos_cliente(CustomerP p_datos_cliente) {
        this.p_datos_cliente = p_datos_cliente;
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
        return "AddCustomerRequest{" +
                "p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_org_id='" + p_org_id + '\'' +
                ", p_cod_usu='" + p_cod_usu + '\'' +
                ", p_tipo_alta='" + p_tipo_alta + '\'' +
                ", p_txt_vinculaUsuario='" + p_txt_vinculaUsuario + '\'' +
                ", p_datos_cliente=" + p_datos_cliente +
                '}';
    }
}
