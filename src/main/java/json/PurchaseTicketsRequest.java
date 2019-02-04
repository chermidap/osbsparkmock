package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.util.List;

public class PurchaseTicketsRequest {

    private String p_cod_idioma;
    private String p_org_id;

    private String p_txt_moneda = "EUR"; //“p_txt_moneda”:”EUR”,
    private String p_cod_cli;// "p_cod_cli":"1",
    private String p_txt_tokentarjeta;// "p_txt_tokentarjeta":"a462d2f5a0aa4ba4859a8601bb37f0aa",
    private String p_cod_usu; // "p_cod_usu":"1",
    private String p_loc_venta; // "p_loc_venta":"180000OZ0323",
    private String p_txt_transaccionventa; //“p_txt_transaccionventa”:”000097679111965324917”,
    private String p_txt_idcomercio; // "p_txt_idcomercio":"Saba Aparcamientos, S.A.",
    private Date p_dat_fechahoraventa;// p_dat_fechahoraventa:type: "string" yyyy/MM/dd HH:mm:ss
    private Double p_num_importeventaconiva;//  "p_num_importeventaconiva":"500.00",
    private String p_renuncia; //  "p_renuncia":"N", [N,S]
    private String p_cod_dir_cli; //  "p_cod_dir_cli,
    private String p_nombre_razon_social; //  "p_nombre_razon_social,
    private String p_tipo_cliente; //   "p_tipo_cliente": " [C,E,V]",
    private List<PurchasePrePayTicketRequest> p_sabalist_loc_producto;// "p_sabalist_loc_producto"


    @JsonProperty(value = "p_sabalist_loc_producto")
    public List<PurchasePrePayTicketRequest> getP_sabalist_loc_producto() {
        return p_sabalist_loc_producto;
    }

    public void setP_sabalist_loc_producto(List<PurchasePrePayTicketRequest> p_sabalist_loc_producto) {
        this.p_sabalist_loc_producto = p_sabalist_loc_producto;
    }

    @JsonProperty(value = "p_cod_idioma")
    public String getP_cod_idioma() {
        return p_cod_idioma;
    }

    public void setP_cod_idioma(String p_cod_idioma) {
        this.p_cod_idioma = p_cod_idioma;
    }

    @JsonProperty(value = "p_org_id")
    public String getP_org_id() {
        return p_org_id;
    }

    public void setP_org_id(String p_org_id) {
        this.p_org_id = p_org_id;
    }


    @JsonProperty(value = "p_txt_moneda")
    public String getP_txt_moneda() {
        return p_txt_moneda;
    }

    public void setP_txt_moneda(String p_txt_moneda) {
        this.p_txt_moneda = p_txt_moneda;
    }

    @JsonProperty(value = "p_cod_cli")
    public String getP_cod_cli() {
        return p_cod_cli;
    }

    public void setP_cod_cli(String p_cod_cli) {
        this.p_cod_cli = p_cod_cli;
    }

    @JsonProperty(value = "p_txt_tokentarjeta")
    public String getP_txt_tokentarjeta() {
        return p_txt_tokentarjeta;
    }

    public void setP_txt_tokentarjeta(String p_txt_tokentarjeta) {
        this.p_txt_tokentarjeta = p_txt_tokentarjeta;
    }

    @JsonProperty(value = "p_cod_usu")
    public String getP_cod_usu() {
        return p_cod_usu;
    }

    public void setP_cod_usu(String p_cod_usu) {
        this.p_cod_usu = p_cod_usu;
    }

    @JsonProperty(value = "p_loc_venta")
    public String getP_loc_venta() {
        return p_loc_venta;
    }

    public void setP_loc_venta(String p_loc_venta) {
        this.p_loc_venta = p_loc_venta;
    }

    @JsonProperty(value = "p_txt_transaccionventa")
    public String getP_txt_transaccionventa() {
        return p_txt_transaccionventa;
    }

    public void setP_txt_transaccionventa(String p_txt_transaccionventa) {
        this.p_txt_transaccionventa = p_txt_transaccionventa;
    }

    @JsonProperty(value = "p_txt_idcomercio")
    public String getP_txt_idcomercio() {
        return p_txt_idcomercio;
    }

    public void setP_txt_idcomercio(String p_txt_idcomercio) {
        this.p_txt_idcomercio = p_txt_idcomercio;
    }

    @JsonProperty(value = "p_dat_fechahoraventa")
    public Date getP_dat_fechahoraventa() {
        return p_dat_fechahoraventa!=null?(Date)p_dat_fechahoraventa.clone():null;
    }

    public void setP_dat_fechahoraventa(Date p_dat_fechahoraventa) {
        this.p_dat_fechahoraventa = p_dat_fechahoraventa!=null?(Date)p_dat_fechahoraventa.clone():null;
    }

    @JsonProperty(value = "p_num_importeventaconiva")
    public Double getP_num_importeventaconiva() {
        return p_num_importeventaconiva;
    }

    public void setP_num_importeventaconiva(Double p_num_importeventaconiva) {
        this.p_num_importeventaconiva = p_num_importeventaconiva;
    }

    @JsonProperty(value = "p_renuncia")
    public String getP_renuncia() {
        return p_renuncia;
    }

    public void setP_renuncia(String p_renuncia) {
        this.p_renuncia = p_renuncia;
    }

    @JsonProperty(value = "p_cod_dir_cli")
    public String getP_cod_dir_cli() {
        return p_cod_dir_cli;
    }

    public void setP_cod_dir_cli(String p_cod_dir_cli) {
        this.p_cod_dir_cli = p_cod_dir_cli;
    }

    @JsonProperty(value = "p_nombre_razon_social")
    public String getP_nombre_razon_social() {
        return p_nombre_razon_social;
    }

    public void setP_nombre_razon_social(String p_nombre_razon_social) {
        this.p_nombre_razon_social = p_nombre_razon_social;
    }

    @JsonProperty(value = "p_tipo_cliente")
    public String getP_tipo_cliente() {
        return p_tipo_cliente;
    }

    public void setP_tipo_cliente(String p_tipo_cliente) {
        this.p_tipo_cliente = p_tipo_cliente;
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
    public String toString() {
        return "PurchaseTicketsRequest{" +
                "p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_org_id='" + p_org_id + '\'' +
                ", p_txt_moneda='" + p_txt_moneda + '\'' +
                ", p_cod_cli='" + p_cod_cli + '\'' +
                ", p_txt_tokentarjeta='" + p_txt_tokentarjeta + '\'' +
                ", p_cod_usu='" + p_cod_usu + '\'' +
                ", p_loc_venta='" + p_loc_venta + '\'' +
                ", p_txt_transaccionventa='" + p_txt_transaccionventa + '\'' +
                ", p_txt_idcomercio='" + p_txt_idcomercio + '\'' +
                ", p_dat_fechahoraventa=" + p_dat_fechahoraventa +
                ", p_num_importeventaconiva=" + p_num_importeventaconiva +
                ", p_renuncia='" + p_renuncia + '\'' +
                ", p_cod_dir_cli='" + p_cod_dir_cli + '\'' +
                ", p_nombre_razon_social='" + p_nombre_razon_social + '\'' +
                ", p_tipo_cliente='" + p_tipo_cliente + '\'' +
                ", p_sabalist_loc_producto=" + p_sabalist_loc_producto +
                '}';
    }
}
