package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketPricesResp {
    private String s_cod_error;
    private List<Ticket> PRICECOLLECTION;

    @JsonProperty(value = "s_lista_precios")
    public List<Ticket> getPRICECOLLECTION() {
        return PRICECOLLECTION;
    }

    public void setPRICECOLLECTION(List<Ticket> PRICECOLLECTION) {
        this.PRICECOLLECTION = PRICECOLLECTION;
    }
    @JsonProperty(value = "s_cod_error")
    public String getS_cod_error() {
        return s_cod_error;
    }

    public void setS_cod_error(String s_cod_error) {
        this.s_cod_error = s_cod_error;
    }
}
