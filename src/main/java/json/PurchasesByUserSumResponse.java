package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchasesByUserSumResponse {
    private Double S_NUM_IMPORTE;

    @JsonProperty(value = "S_NUM_IMPORTE")
    public Double getS_NUM_IMPORTE() {
        return S_NUM_IMPORTE;
    }

    public void setS_NUM_IMPORTE(Double s_NUM_IMPORTE) {
        S_NUM_IMPORTE = s_NUM_IMPORTE;
    }
}
