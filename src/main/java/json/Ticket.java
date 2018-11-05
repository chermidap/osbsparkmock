package json;

import java.util.Date;

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

    private Double emissionCost; // "s_gasto_emision":"number",
    private Double iva_percent; // "s_porcentaje_iva":"number",

    private Date end_date; //s_fecha_fin
    private Double total_amount; //s_total
    private Double registration_fee;//s_cuota_alta


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPriceWithoutDiscount() {
        return priceWithoutDiscount;
    }

    public void setPriceWithoutDiscount(Double priceWithoutDiscount) {
        this.priceWithoutDiscount = priceWithoutDiscount;
    }

    public Double getPriceWithowDiscount_sin_iva() {
        return priceWithowDiscount_sin_iva;
    }

    public void setPriceWithowDiscount_sin_iva(Double priceWithowDiscount_sin_iva) {
        this.priceWithowDiscount_sin_iva = priceWithowDiscount_sin_iva;
    }

    public Double getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(Double priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }

    public Double getPriceWithDiscount_sin_iva() {
        return priceWithDiscount_sin_iva;
    }

    public void setPriceWithDiscount_sin_iva(Double priceWithDiscount_sin_iva) {
        this.priceWithDiscount_sin_iva = priceWithDiscount_sin_iva;
    }

    public Double getAmount_iva_price_withow_dto() {
        return amount_iva_price_withow_dto;
    }

    public void setAmount_iva_price_withow_dto(Double amount_iva_price_withow_dto) {
        this.amount_iva_price_withow_dto = amount_iva_price_withow_dto;
    }

    public Double getAmount_iva_price_with_dto() {
        return amount_iva_price_with_dto;
    }

    public void setAmount_iva_price_with_dto(Double amount_iva_price_with_dto) {
        this.amount_iva_price_with_dto = amount_iva_price_with_dto;
    }

    public Double getEmissionCost() {
        return emissionCost;
    }

    public void setEmissionCost(Double emissionCost) {
        this.emissionCost = emissionCost;
    }

    public Double getIva_percent() {
        return iva_percent;
    }

    public void setIva_percent(Double iva_percent) {
        this.iva_percent = iva_percent;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Double getRegistration_fee() {
        return registration_fee;
    }

    public void setRegistration_fee(Double registration_fee) {
        this.registration_fee = registration_fee;
    }
}
