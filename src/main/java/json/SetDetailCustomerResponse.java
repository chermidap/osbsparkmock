package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetDetailCustomerResponse {
    private String s_cod_error;

    @JsonProperty(value = "S_COD_ERROR")
    public String getS_cod_error() {
        return s_cod_error;
    }

    public void setS_cod_error(String s_cod_error) {
        this.s_cod_error = s_cod_error;
    }
}
