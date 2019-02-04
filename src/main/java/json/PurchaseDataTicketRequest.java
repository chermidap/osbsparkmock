package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class PurchaseDataTicketRequest {


    private String p_loc_venta; //Localizador del producto (PK). Obligatorio.
    private String p_cod_producto; //Código SICAS del producto. Obligatorio.
    private String p_cod_aparca; //Código  del parking. Obligatorio.
    private String p_cod_idioma;
    private String p_org_id;
    private String p_cod_usu;
    private String p_cod_cli;
    private String p_cod_dir_cli;
    private String p_iban;
    private String p_matricula;
    private String p_marca;
    private String p_modelo;
    private String p_color;


    @JsonProperty(value = "p_loc_venta")
    public String getP_loc_venta() {
        return p_loc_venta;
    }

    public void setP_loc_venta(String p_loc_venta) {
        this.p_loc_venta = p_loc_venta;
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

    @JsonProperty(value = "p_cod_usu")
    public String getP_cod_usu() {
        return p_cod_usu;
    }

    public void setP_cod_usu(String p_cod_usu) {
        this.p_cod_usu = p_cod_usu;
    }

    @JsonProperty(value = "p_cod_cli")
    public String getP_cod_cli() {
        return p_cod_cli;
    }

    public void setP_cod_cli(String p_cod_cli) {
        this.p_cod_cli = p_cod_cli;
    }

    @JsonProperty(value = "p_cod_dir_cli")
    public String getP_cod_dir_cli() {
		return p_cod_dir_cli;
	}

	public void setP_cod_dir_cli(String p_cod_dir_cli) {
		this.p_cod_dir_cli = p_cod_dir_cli;
	}
	
    @JsonProperty(value = "p_iban")
    public String getP_iban() {
        return p_iban;
    }

    public void setP_iban(String p_iban) {
        this.p_iban = p_iban;
    }

    @JsonProperty(value = "p_matricula")
    public String getP_matricula() {
        return p_matricula;
    }

    public void setP_matricula(String p_matricula) {
        this.p_matricula = p_matricula;
    }

    @JsonProperty(value = "p_marca")
    public String getP_marca() {
        return p_marca;
    }

    public void setP_marca(String p_marca) {
        this.p_marca = p_marca;
    }

    @JsonProperty(value = "p_modelo")
    public String getP_modelo() {
        return p_modelo;
    }

    public void setP_modelo(String p_modelo) {
        this.p_modelo = p_modelo;
    }

    @JsonProperty(value = "p_color")
    public String getP_color() {
        return p_color;
    }

    public void setP_color(String p_color) {
        this.p_color = p_color;
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
    public int hashCode() {

        return Objects.hash(p_cod_producto);
    }

    @Override
    public String toString() {
        return "OSBPurchaseDataTicketRequest{" +

                ", P_COD_PROD='" + p_cod_producto + '\'' +
                ", P_COD_APARCA='" + p_cod_aparca + '\'' +
                ", P_LOC_VENTA='" + p_loc_venta + '\'' +
                ", P_COD_IDIOMA='" + p_cod_idioma + '\'' +
                ", P_ORG_ID='" + p_org_id + '\'' +
                ", P_COD_USU='" + p_cod_usu + '\'' +
                ", P_COD_CLI='" + p_cod_cli + '\'' +
                ", P_COD_DIR_CLI='" + p_cod_dir_cli + '\'' +
                ", P_IBAN='" + p_iban + '\'' +
                ", P_MATRICULA='" + p_matricula + '\'' +
                ", P_MARCA='" + p_marca + '\'' +
                ", P_MODELO='" + p_modelo + '\'' +
                ", P_COLOR='" + p_color + '\'' +
                "} " + super.toString();
    }
}
