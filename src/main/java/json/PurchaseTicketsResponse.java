package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchaseTicketsResponse {
    private String s_cod_error;
    private String s_cod_localizador;
    private String s_cod_qr;

    @JsonProperty(value = "s_cod_error")
    public String getS_cod_error() {
        return s_cod_error;
    }

    public void setS_cod_error(String s_cod_error) {
        this.s_cod_error = s_cod_error;
    }

    @JsonProperty(value = "s_cod_localizador")
    public String getS_cod_localizador() {
        return s_cod_localizador;
    }

    public void setS_cod_localizador(String s_cod_localizador) {
        this.s_cod_localizador = s_cod_localizador;
    }

    @JsonProperty(value = "s_cod_qr")
    public String getS_cod_qr() {
        return s_cod_qr;
    }

    public void setS_cod_qr(String s_cod_qr) {
        this.s_cod_qr = s_cod_qr;
    }

    @Override
    public String toString() {
        return "PurchaseTicketsResponse{" +
                "s_cod_error='" + s_cod_error + '\'' +
                ", s_cod_localizador='" + s_cod_localizador + '\'' +
                ", s_cod_qr='" + s_cod_qr + '\'' +
                '}';
    }
}
