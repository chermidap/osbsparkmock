package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Date;
import java.util.Objects;

public class PurchasePrePayTicketRequest {


    private String p_loc_prod; //Localizador del producto (PK). Obligatorio.
    private String p_cod_producto; //Código SICAS del producto. Obligatorio.
    private String p_cod_aparca; //Código  del parking. Obligatorio.
    private Date p_dat_fecha_inicio; //Fecha inicio del producto.
    private double p_importeproductoconiva; // Importe del producto con IVA. Obligatorio.
    private double p_importeproductosiniva; // Importe del producto sin IVA. Obligatorio.
    private double p_importeiva; //Importe del IVA. Obligatorio.
    private double p_porcentajeiva; //Porcentage de IVA aplicado. Obligatorio.
    private String p_prop_estadolocalizador = "Pdte. Canje"; //Propiedad ‘Estado Localizador’. Obligatorio.
    private String p_prop_mailcanje  = "Emitido"; //Propiedad ‘Dev. Pasarela Pago’. Obligatorio.
    private String p_prop_requierecanje = "Requiere"; //Propiedad ‘Requiere Canje’. Obligatorio.
    private String p_prop_solicituddev = "No Solicitada"; //Propiedad ‘Solicitud Devolución’. Obligatorio.
    private String p_dat_fechasolicituddev = ""; //Propiedad ‘Fecha solicitud devolución’. Obligatorio.
    private String p_prop_procededev = ""; //Propiedad ‘Procede Devolución’. Obligatorio.
    private String p_prop_motivorechazodev = ""; //Propiedad ‘Procede Rechazo Dev.’. Obligatorio.
    private String p_prop_requieredevfisica = ""; //Propiedad ‘Requiere Dev. Física’. Obligatorio.

    @JsonProperty(value = "p_loc_prod")
    public String getP_loc_prod() {
        return p_loc_prod;
    }

    public void setP_loc_prod(String p_loc_prod) {
        this.p_loc_prod = p_loc_prod;
    }

    @JsonProperty(value = "p_cod_producto")
    public String getP_cod_producto() {
        return p_cod_producto;
    }

    public void setP_cod_producto(String p_cod_producto) {
        this.p_cod_producto = p_cod_producto;
    }

    @JsonProperty(value = "p_cod_aparca")
    public String getP_cod_aparca() {
        return p_cod_aparca;
    }

    public void setP_cod_aparca(String p_cod_aparca) {
        this.p_cod_aparca = p_cod_aparca;
    }

    @JsonProperty(value = "p_dat_fecha_inicio")
    public Date getP_dat_fecha_inicio() {
     return p_dat_fecha_inicio!=null?(Date)p_dat_fecha_inicio.clone():null;
    }

    public void setP_dat_fecha_inicio(Date p_dat_fecha_ini) {
        p_dat_fecha_inicio = p_dat_fecha_ini!=null?(Date)p_dat_fecha_ini.clone():null;
    }

    @JsonProperty(value = "p_importeproductoconiva")

    public double getP_importeproductoconiva() {
        return p_importeproductoconiva;
    }

    public void setP_importeproductoconiva(double p_importeproductoconiva) {
        this.p_importeproductoconiva = p_importeproductoconiva;
    }

    @JsonProperty(value = "p_importeproductosiniva")
    public double getP_importeproductosiniva() {
        return p_importeproductosiniva;
    }

    public void setP_importeproductosiniva(double p_importeproductosiniva) {
        this.p_importeproductosiniva = p_importeproductosiniva;
    }

    @JsonProperty(value = "p_importeiva")
    public double getP_importeiva() {
        return p_importeiva;
    }

    public void setP_importeiva(double p_importeiva) {
        this.p_importeiva = p_importeiva;
    }

    @JsonProperty(value = "p_porcentajeiva")
    public double getP_porcentajeiva() {
        return p_porcentajeiva;
    }

    public void setP_porcentajeiva(double p_porcentajeiva) {
        this.p_porcentajeiva = p_porcentajeiva;
    }

    @JsonProperty(value = "p_prop_estadolocalizador")
    public String getP_prop_estadolocalizador() {
        return p_prop_estadolocalizador;
    }

    public void setP_prop_estadolocalizador(String p_prop_estadolocalizador) {
        this.p_prop_estadolocalizador = p_prop_estadolocalizador;
    }

    @JsonProperty(value = "p_prop_mailcanje")
    public String getP_prop_mailcanje() {
        return p_prop_mailcanje;
    }

    public void setP_prop_mailcanje(String p_prop_mailcanje) {
        this.p_prop_mailcanje = p_prop_mailcanje;
    }

    @JsonProperty(value = "p_prop_requierecanje")
    public String getP_prop_requierecanje() {
        return p_prop_requierecanje;
    }

    public void setP_prop_requierecanje(String p_prop_requierecanje) {
        this.p_prop_requierecanje = p_prop_requierecanje;
    }

    @JsonProperty(value = "p_prop_solicituddev")
    public String getP_prop_solicituddev() {
        return p_prop_solicituddev;
    }

    public void setP_prop_solicituddev(String p_prop_solicituddev) {
        this.p_prop_solicituddev = p_prop_solicituddev;
    }

    @JsonProperty(value = "p_dat_fechasolicituddev")
    public String getP_dat_fechasolicituddev() {
        return p_dat_fechasolicituddev;
    }

    public void setP_dat_fechasolicituddev(String p_dat_fechasolicituddev) {
        this.p_dat_fechasolicituddev = p_dat_fechasolicituddev;
    }

    @JsonProperty(value = "p_prop_procededev")
    public String getP_prop_procededev() {
        return p_prop_procededev;
    }

    public void setP_prop_procededev(String p_prop_procededev) {
        this.p_prop_procededev = p_prop_procededev;
    }

    @JsonProperty(value = "p_prop_motivorechazodev")
    public String getP_prop_motivorechazodev() {
        return p_prop_motivorechazodev;
    }

    public void setP_prop_motivorechazodev(String p_prop_motivorechazodev) {
        this.p_prop_motivorechazodev = p_prop_motivorechazodev;
    }

    @JsonProperty(value = "p_prop_requieredevfisica")
    public String getP_prop_requieredevfisica() {
        return p_prop_requieredevfisica;
    }

    public void setP_prop_requieredevfisica(String p_prop_requieredevfisica) {
        this.p_prop_requieredevfisica = p_prop_requieredevfisica;
    }

    public String toJSON() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasePrePayTicketRequest that = (PurchasePrePayTicketRequest) o;
        return Objects.equals(p_cod_producto, that.p_cod_producto);
    }

    @Override
    public int hashCode() {

        return Objects.hash(p_cod_producto);
    }

    @Override
    public String toString() {
        return "PurchasePrePayTicketRequest{" +
                "P_LOC_PROD='" + p_loc_prod + '\'' +
                ", P_COD_PROD='" + p_cod_producto + '\'' +
                ", P_COD_APARCA='" + p_cod_aparca + '\'' +
                ", P_DAT_FECHAINI='" + p_dat_fecha_inicio + '\'' +
                ", P_IMPORTEPRODUCTOCONIVA='" + p_importeproductoconiva + '\'' +
                ", P_IMPORTEPRODUCTOSINIVA='" + p_importeproductosiniva + '\'' +
                ", P_IMPORTEIVA='" + p_importeiva + '\'' +
                ", P_PORCENTAJEIVA='" + p_porcentajeiva + '\'' +
                ", P_PROP_ESTADOLOCALIZADOR='" + p_prop_estadolocalizador + '\'' +
                ", P_PROP_MAILCANJE='" + p_prop_mailcanje + '\'' +
                ", P_PROP_REQUIERECANJE='" + p_prop_requierecanje + '\'' +
                ", P_PROP_SOLICITUDDEV='" + p_prop_solicituddev + '\'' +
                ", P_DAT_FECHASOLICITUDDEV='" + p_dat_fechasolicituddev + '\'' +
                ", P_PROP_PROCEDEDEV='" + p_prop_procededev + '\'' +
                ", P_PROP_MOTIVORECHAZODEV='" + p_prop_motivorechazodev + '\'' +
                ", P_PROP_REQUIEREDEVFISICA='" + p_prop_requieredevfisica + '\'' +
                "} " + super.toString();
    }
}
