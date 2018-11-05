package json;

import java.math.BigDecimal;

public class ProductSICASPrice {

    private String parkingCode;

    private String productSICASCode;

    private BigDecimal price;

    private BigDecimal previousPrice;

    private BigDecimal priceWithoutTaxes;

    private BigDecimal taxesAmount;

    private BigDecimal taxesRate;

    private int units;

    private BigDecimal abonoDiscount;

    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    public String getProductSICASCode() {
        return productSICASCode;
    }

    public void setProductSICASCode(String productSICASCode) {
        this.productSICASCode = productSICASCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(BigDecimal previousPrice) {
        this.previousPrice = previousPrice;
    }

    public BigDecimal getPriceWithoutTaxes() {
        return priceWithoutTaxes;
    }

    public void setPriceWithoutTaxes(BigDecimal priceWithoutTaxes) {
        this.priceWithoutTaxes = priceWithoutTaxes;
    }

    public BigDecimal getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(BigDecimal taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public BigDecimal getTaxesRate() {
        return taxesRate;
    }

    public void setTaxesRate(BigDecimal taxesRate) {
        this.taxesRate = taxesRate;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public BigDecimal getAbonoDiscount() {
        return abonoDiscount;
    }

    public void setAbonoDiscount(BigDecimal abonoDiscount) {
        this.abonoDiscount = abonoDiscount;
    }
}
