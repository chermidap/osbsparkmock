package json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TicketPricesResp {
    private String s_cod_error;
    private List<Ticket> PRICECOLLECTION;


    public List<Ticket> getPRICECOLLECTION() {
        return PRICECOLLECTION;
    }

    public void setPRICECOLLECTION(List<Ticket> PRICECOLLECTION) {
        this.PRICECOLLECTION = PRICECOLLECTION;
    }

    public String getS_cod_error() {
        return s_cod_error;
    }

    public void setS_cod_error(String s_cod_error) {
        this.s_cod_error = s_cod_error;
    }
}
