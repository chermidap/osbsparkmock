package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketReq {
    @JsonProperty(value = "p_cod_producto")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @JsonProperty(value = "p_cod_aparca")
    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    private String productCode; // Código SICAS
    private String parkingCode;

}
