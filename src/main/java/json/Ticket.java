package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Ticket {

    private String productCode; // Código SICAS
    private String parkingCode;
    private Double discount; //  "s_descuento":"string",
    private Double priceWithoutDiscount; //  "s_precio_sin_dto":"number",
    private Double priceWithowDiscount_sin_iva;// "s_precio_sin_dto":"number"
    private Double priceWithDiscount; // "s_precio_con_dto":"number",
    private Double priceWithDiscount_sin_iva;// "s_precio_con_dto_sin_iva":"number"

    private Double amount_iva_price_withow_dto; // s_importe_iva_precio_sin_dto
    private Double amount_iva_price_with_dto;//“s_importe_iva_precio_con_dto”:”10”,

    private Double manageAmount; // "s_gasto_gestion":"number",
    private Double iva_percent; // "s_porcentaje_iva":"number",

    private Date end_date; //s_fecha_fin
    private Double total_amount; //s_total
    private Double registration_fee;//s_cuota_alta

    @JsonProperty(value = "p_cod_producto")
    public String getProductCode() {
        return productCode;
    }
    @JsonProperty(value = "s_cod_producto")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @JsonProperty(value = "p_cod_aparca")
    public String getParkingCode() {
        return parkingCode;
    }
    @JsonProperty(value = "s_cod_aparca")
    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }
    @JsonProperty(value = "s_descuento")
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    @JsonProperty(value = "s_precio_sin_dto")
    public Double getPriceWithoutDiscount() {
        return priceWithoutDiscount;
    }

    public void setPriceWithoutDiscount(Double priceWithoutDiscount) {
        this.priceWithoutDiscount = priceWithoutDiscount;
    }
    @JsonProperty(value = "s_precio_sin_dto_sin_iva")
    public Double getPriceWithowDiscount_sin_iva() {
        return priceWithowDiscount_sin_iva;
    }

    public void setPriceWithowDiscount_sin_iva(Double priceWithowDiscount_sin_iva) {
        this.priceWithowDiscount_sin_iva = priceWithowDiscount_sin_iva;
    }
    @JsonProperty(value = "s_precio_con_dto")
    public Double getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(Double priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }
    @JsonProperty(value = "s_precio_con_dto_sin_iva")
    public Double getPriceWithDiscount_sin_iva() {
        return priceWithDiscount_sin_iva;
    }

    public void setPriceWithDiscount_sin_iva(Double priceWithDiscount_sin_iva) {
        this.priceWithDiscount_sin_iva = priceWithDiscount_sin_iva;
    }
    @JsonProperty(value = "s_importe_iva_precio_sin_dto")
    public Double getAmount_iva_price_withow_dto() {
        return amount_iva_price_withow_dto;
    }

    public void setAmount_iva_price_withow_dto(Double amount_iva_price_withow_dto) {
        this.amount_iva_price_withow_dto = amount_iva_price_withow_dto;
    }
    @JsonProperty(value = "s_importe_iva_precio_con_dto")
    public Double getAmount_iva_price_with_dto() {
        return amount_iva_price_with_dto;
    }

    public void setAmount_iva_price_with_dto(Double amount_iva_price_with_dto) {
        this.amount_iva_price_with_dto = amount_iva_price_with_dto;
    }
    @JsonProperty(value = "s_gasto_gestion")
    public Double getManageAmount() {
        return manageAmount;
    }

    public void setManageAmount(Double manageAmount) {
        this.manageAmount = manageAmount;
    }


    @JsonProperty(value = "s_porcentaje_iva")
    public Double getIva_percent() {
        return iva_percent;
    }

    public void setIva_percent(Double iva_percent) {
        this.iva_percent = iva_percent;
    }

    @JsonProperty(value = "s_fecha_fin")
    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @JsonProperty(value = "s_total")
    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }
    @JsonProperty(value = "s_cuota_alta")
    public Double getRegistration_fee() {
        return registration_fee;
    }

    public void setRegistration_fee(Double registration_fee) {
        this.registration_fee = registration_fee;
    }

    public Ticket(String productCode, String parkingCode, Double total_amount) {
        this.productCode = productCode;
        this.parkingCode = parkingCode;
        this.total_amount = total_amount;
    }

    public Ticket() {
    }
}
