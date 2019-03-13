package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Purchase implements Serializable {

    private String P_COD_IDIOMA; //P_COD_IDIOMA
    private String P_ORG_ID; //P_ORG_ID

    private String id; //P_LOC_VENTA

    private String userCode;  //P_COD_USU
    private String customerId; //customerId
    private String purchaseDate; //P_DAT_FECHAHORAVENTA

    //Datos de compra
    private String transactionId; // P_TXT_IDTRANSACCIONVENTA - Identificador devuelto por las pasarelas de pago

    private String currencyType; //P_TXT_MONEDA

    private String cardToken; //P_TXT_TOKENTARJETA - Token de la tarjeta de crédito previamente creado con sipay

    private String expirationDate; //Se usa en la oficina virtual

    private String purchaseTotalPrice;

    private String creditCardNumber;
    private String creditCardCVV;
    private String creditCardMonthExpiration;
    private String creditCardYearExpiration;

    private String viaTNumber; //P_NUM_VIAT

    //DATOS DEL PRODUCTO QUE SE COMPRA

    private String productLocalizator; //P_LOC_PROD
    private String parkingCode; //P_COD_APARCA
    private String productSICASCode; //P_COD_PROD
    private String parkingDescription;//S_TXT_PARKING
    private String productDescription; //S_TXT_PRODUCTO

    private String startString; //P_DAT_FECHAINI
    private String endString; //P_DAT_FECHAFIN

    private String productTotalPrice; //P_NUM_IMPORTEPRODUCTOCONIVA
    private String productTotalPriceWithoutTaxes; //P_NUM_IMPORTEPRODUCTOSINIVA
    private String productTaxesAmount; //P_NUM_IMPORTEIVA
    private String productTaxesRate; //P_NUM_PORCENTAJEIVA
    private String productDiscountPrice; //Se usa en la oficina virtual

    //FIN DATOS DEL PRODUCTO QUE SE COMPRA

    private String P_TXT_IDCOMERCIO; //P_TXT_IDCOMERCIO
    private String P_TXT_NOMBREFAC; //P_TXT_NOMBREFAC
    private String P_TXT_APELLIDOSFAC; //P_TXT_APELLIDOSFAC
    private String P_COD_DIRFAC; //P_COD_DIRFAC

    private String invoiceRequired;  //P_PROP_SOLICITUDFACTURA

    private String qrCode;

    private String productViaT;

    private String agent;


    //Datos nuevos abonos
    private String renuncia; //  "p_renuncia":"N", [N,S]
    private String cod_dir_cli; //  "p_cod_dir_cli,
    private String nombre_razon_social; //  "p_nombre_razon_social,
    private String email; //   "p_email": "",
    private String tipo_cliente; //   "p_tipo_cliente": " [C,E,V]",
    private String movil; //

    //Datos prealta  /* osbPurchasePrePayTicketRequest.setP_prop_solicituddev();

    private String estadolocalizador = "Pdte. Canje"; //Propiedad ‘Estado Localizador’. Obligatorio.
    private String mailcanje  = "Emitido"; //Propiedad ‘Dev. Pasarela Pago’. Obligatorio.
    private String requierecanje = "Requiere"; //Propiedad ‘Requiere Canje’. Obligatorio.
    private String solicituddev = "No Solicitada"; //Propiedad ‘Solicitud Devolución’. Obligatorio.
    private String fechasolicituddev = ""; //Propiedad ‘Fecha solicitud devolución’. Obligatorio.
    private String procededev = ""; //Propiedad ‘Procede Devolución’. Obligatorio.
    private String motivorechazodev = ""; //Propiedad ‘Procede Rechazo Dev.’. Obligatorio.
    private String requieredevfisica = ""; //Propiedad ‘Requiere Dev. Física’. Obligatorio.

    private String estadoLocalizador;

    public String getP_COD_IDIOMA() {
        return P_COD_IDIOMA;
    }

    public void setP_COD_IDIOMA(String p_COD_IDIOMA) {
        P_COD_IDIOMA = p_COD_IDIOMA;
    }

    public String getP_ORG_ID() {
        return P_ORG_ID;
    }

    public void setP_ORG_ID(String p_ORG_ID) {
        P_ORG_ID = p_ORG_ID;
    }

    @JsonProperty(value = "s_txt_localizadorVenta")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty(value = "S_COD_USU")
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @JsonProperty(value = "S_COD_CLI")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty(value = "s_dat_fechaHoraVenta")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    @JsonProperty(value = "s_dat_fechaCaducidad")
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty(value = "s_num_importeVentaConIVA")
    public String getPurchaseTotalPrice() {
        return purchaseTotalPrice;
    }

    public void setPurchaseTotalPrice(String purchaseTotalPrice) {
        this.purchaseTotalPrice = purchaseTotalPrice;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardCVV() {
        return creditCardCVV;
    }

    public void setCreditCardCVV(String creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }

    public String getCreditCardMonthExpiration() {
        return creditCardMonthExpiration;
    }

    public void setCreditCardMonthExpiration(String creditCardMonthExpiration) {
        this.creditCardMonthExpiration = creditCardMonthExpiration;
    }

    public String getCreditCardYearExpiration() {
        return creditCardYearExpiration;
    }

    public void setCreditCardYearExpiration(String creditCardYearExpiration) {
        this.creditCardYearExpiration = creditCardYearExpiration;
    }

    public String getViaTNumber() {
        return viaTNumber;
    }

    public void setViaTNumber(String viaTNumber) {
        this.viaTNumber = viaTNumber;
    }

    @JsonProperty(value = "s_loc_prod")
    public String getProductLocalizator() {
        return productLocalizator;
    }

    public void setProductLocalizator(String productLocalizator) {
        this.productLocalizator = productLocalizator;
    }

    @JsonProperty(value = "s_cod_aparca")
    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    @JsonProperty(value = "s_cod_prod")
    public String getProductSICASCode() {
        return productSICASCode;
    }

    public void setProductSICASCode(String productSICASCode) {
        this.productSICASCode = productSICASCode;
    }
    @JsonProperty(value = "s_dat_fechaini")
    public String getStartString() {
        return startString;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }
    @JsonProperty(value = "s_dat_fechafin")
    public String getEndString() {
        return endString;
    }

    public void setEndString(String endString) {
        this.endString = endString;
    }

    @JsonProperty(value = "s_num_importeProductoConIVA")
    public String getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(String productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    @JsonProperty(value = "s_num_importeProductoSinIVA")
    public String getProductTotalPriceWithoutTaxes() {
        return productTotalPriceWithoutTaxes;
    }

    public void setProductTotalPriceWithoutTaxes(String productTotalPriceWithoutTaxes) {
        this.productTotalPriceWithoutTaxes = productTotalPriceWithoutTaxes;
    }

    @JsonProperty(value = "s_num_importeIVA")
    public String getProductTaxesAmount() {
        return productTaxesAmount;
    }

    public void setProductTaxesAmount(String productTaxesAmount) {
        this.productTaxesAmount = productTaxesAmount;
    }

    @JsonProperty(value = "s_num_porcentajeIVA")
    public String getProductTaxesRate() {
        return productTaxesRate;
    }

    public void setProductTaxesRate(String productTaxesRate) {
        this.productTaxesRate = productTaxesRate;
    }

    @JsonProperty(value = "s_num_ahorro")
    public String getProductDiscountPrice() {
        return productDiscountPrice;
    }

    public void setProductDiscountPrice(String productDiscountPrice) {
        this.productDiscountPrice = productDiscountPrice;
    }

    @JsonProperty(value = "s_txt_parking")
    public String getParkingDescription() {
        return parkingDescription;
    }

    public void setParkingDescription(String parkingDescription) {
        this.parkingDescription = parkingDescription;
    }
    @JsonProperty(value = "s_txt_producto")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getP_TXT_IDCOMERCIO() {
        return P_TXT_IDCOMERCIO;
    }

    public void setP_TXT_IDCOMERCIO(String p_TXT_IDCOMERCIO) {
        P_TXT_IDCOMERCIO = p_TXT_IDCOMERCIO;
    }

    public String getP_TXT_NOMBREFAC() {
        return P_TXT_NOMBREFAC;
    }

    public void setP_TXT_NOMBREFAC(String p_TXT_NOMBREFAC) {
        P_TXT_NOMBREFAC = p_TXT_NOMBREFAC;
    }

    public String getP_TXT_APELLIDOSFAC() {
        return P_TXT_APELLIDOSFAC;
    }

    public void setP_TXT_APELLIDOSFAC(String p_TXT_APELLIDOSFAC) {
        P_TXT_APELLIDOSFAC = p_TXT_APELLIDOSFAC;
    }

    public String getP_COD_DIRFAC() {
        return P_COD_DIRFAC;
    }

    public void setP_COD_DIRFAC(String p_COD_DIRFAC) {
        P_COD_DIRFAC = p_COD_DIRFAC;
    }

    public String isInvoiceRequired() {
        return invoiceRequired;
    }

    public void setInvoiceRequired(String invoiceRequired) {
        this.invoiceRequired = invoiceRequired;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String isProductViaT() {
        return productViaT;
    }

    public void setProductViaT(String productViaT) {
        this.productViaT = productViaT;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getRenuncia() {
        return renuncia;
    }

    public void setRenuncia(String renuncia) {
        this.renuncia = renuncia;
    }

    public String getCod_dir_cli() {
        return cod_dir_cli;
    }

    public void setCod_dir_cli(String cod_dir_cli) {
        this.cod_dir_cli = cod_dir_cli;
    }

    public String getNombre_razon_social() {
        return nombre_razon_social;
    }

    public void setNombre_razon_social(String nombre_razon_social) {
        this.nombre_razon_social = nombre_razon_social;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEstadolocalizador() {
        return estadolocalizador;
    }

    public void setEstadolocalizador(String estadolocalizador) {
        this.estadolocalizador = estadolocalizador;
    }

    public String getMailcanje() {
        return mailcanje;
    }

    public void setMailcanje(String mailcanje) {
        this.mailcanje = mailcanje;
    }

    public String getRequierecanje() {
        return requierecanje;
    }

    public void setRequierecanje(String requierecanje) {
        this.requierecanje = requierecanje;
    }

    public String getSolicituddev() {
        return solicituddev;
    }

    public void setSolicituddev(String solicituddev) {
        this.solicituddev = solicituddev;
    }

    public String getFechasolicituddev() {
        return fechasolicituddev;
    }

    public void setFechasolicituddev(String fechasolicituddev) {
        this.fechasolicituddev = fechasolicituddev;
    }

    public String getProcededev() {
        return procededev;
    }

    public void setProcededev(String procededev) {
        this.procededev = procededev;
    }

    public String getMotivorechazodev() {
        return motivorechazodev;
    }

    public void setMotivorechazodev(String motivorechazodev) {
        this.motivorechazodev = motivorechazodev;
    }

    public String getRequieredevfisica() {
        return requieredevfisica;
    }

    public void setRequieredevfisica(String requieredevfisica) {
        this.requieredevfisica = requieredevfisica;
    }
    
    @JsonProperty(value = "s_prop_estadoLocalizador")
    public String getEstadoLocalizador() {
		return estadoLocalizador;
	}

	public void setEstadoLocalizador(String estadoLocalizador) {
		this.estadoLocalizador = estadoLocalizador;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "OSBPurchase{" +
                "P_COD_IDIOMA='" + P_COD_IDIOMA + '\'' +
                ", P_ORG_ID='" + P_ORG_ID + '\'' +
                ", id='" + id + '\'' +
                ", userCode='" + userCode + '\'' +
                ", customerId='" + customerId + '\'' +
                ", purchaseString=" + purchaseDate +
                ", transactionId='" + transactionId + '\'' +
                ", currencyType=" + currencyType +
                ", cardToken='" + cardToken + '\'' +
                ", expirationString=" + expirationDate +
                ", purchaseTotalPrice=" + purchaseTotalPrice +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", creditCardCVV='" + creditCardCVV + '\'' +
                ", creditCardMonthExpiration='" + creditCardMonthExpiration + '\'' +
                ", creditCardYearExpiration='" + creditCardYearExpiration + '\'' +
                ", viaTNumber='" + viaTNumber + '\'' +
                ", productLocalizator='" + productLocalizator + '\'' +
                ", parkingCode='" + parkingCode + '\'' +
                ", productSICASCode='" + productSICASCode + '\'' +
                ", startString=" + startString +
                ", endString=" + endString +
                ", productTotalPrice=" + productTotalPrice +
                ", productTotalPriceWithoutTaxes=" + productTotalPriceWithoutTaxes +
                ", productTaxesAmount=" + productTaxesAmount +
                ", productTaxesRate=" + productTaxesRate +
                ", productDiscountPrice=" + productDiscountPrice +
                ", P_TXT_IDCOMERCIO='" + P_TXT_IDCOMERCIO + '\'' +
                ", P_TXT_NOMBREFAC='" + P_TXT_NOMBREFAC + '\'' +
                ", P_TXT_APELLIDOSFAC='" + P_TXT_APELLIDOSFAC + '\'' +
                ", P_COD_DIRFAC='" + P_COD_DIRFAC + '\'' +
                ", invoiceRequired=" + invoiceRequired +
                ", qrCode='" + qrCode + '\'' +
                '}';
    }
}


