package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCustomerResponse {
    private String s_cod_error;
    private CustomerS s_datos_cliente;

    @JsonProperty(value = "s_cod_error")
    public String getS_cod_error() {
        return s_cod_error;
    }

    public void setS_cod_error(String s_cod_error) {
        this.s_cod_error = s_cod_error;
    }

    @JsonProperty(value = "s_datos_cliente")
    public CustomerS getS_datos_cliente() {
        return s_datos_cliente;
    }

    public void setS_datos_cliente(CustomerS s_datos_cliente) {
        this.s_datos_cliente = s_datos_cliente;
    }
}
