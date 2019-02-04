package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class UserRequest  {

    private String P_COD_IDIOMA;
    private String P_ORG_ID;

    public void setP_ORG_ID(String P_ORG_ID) {
        this.P_ORG_ID = P_ORG_ID;
    }
    //campos usuario
    private String P_COD_USU;
    private String P_COD_CLI = "";
    private String P_TXT_EMAIL;
    private String P_TXT_NOMBRE;
    private String P_TXT_APELLIDOS;
    private Date P_DAT_FECHANACIMIENTO;
    private String P_TXT_ALIAS;
    private String P_COD_IDIOMAPREF;
    private boolean P_BOL_FIDELIZACION;
    private boolean P_BOL_REBUTVIAT;
    private boolean P_BOL_NEWSLETTER;
    private boolean P_BOL_COMUNICACIONES;

    //campos crea cliente
    private String P_COD_NACION;
    private String P_TXT_CLASEDOCUMENTO;
    private String P_TXT_DOCIDENTIDAD;

    //campos get cliente
    private String P_COD_CLIENTE; //TODO - Hacer los getter y los setter pero usar la propiedad P_COD_CLI
    private String P_TXT_NIF; //TODO - Hacer los getter y los setter pero usar la propiedad P_TXT_DOCIDENTIDAD
    private String P_TXT_MAIL; //TODO - Hacer los getter y los setter pero usar la propiedad P_TXT_EMAIL


    @JsonProperty(value = "P_COD_CLI")
    public String getP_COD_CLI() {
        return P_COD_CLI;
    }

    public void setP_COD_CLI(String P_COD_CLI) {
        this.P_COD_CLI = P_COD_CLI;
    }

    @JsonProperty(value = "P_TXT_NIF")
    public String getP_TXT_NIF() {
        return P_TXT_NIF;
    }

    @JsonProperty(value = "P_TXT_MAIL")
	public String getP_TXT_MAIL() {
		return P_TXT_MAIL;
	}

	public void setP_TXT_MAIL(String p_TXT_MAIL) {
		P_TXT_MAIL = p_TXT_MAIL;
	}
    @JsonProperty(value = "P_COD_USU")
    public String getP_COD_USU() {
        return P_COD_USU;
    }

    public void setP_COD_USU(String p_COD_USU) {
        P_COD_USU = p_COD_USU;
    }

    @JsonProperty(value = "P_TXT_EMAIL")
    public String getP_TXT_EMAIL() {
        return P_TXT_EMAIL;
    }

    public void setP_TXT_EMAIL(String p_TXT_EMAIL) {
        P_TXT_EMAIL = p_TXT_EMAIL;
    }

    @JsonProperty(value = "P_TXT_NOMBRE")
    public String getP_TXT_NOMBRE() {
        return P_TXT_NOMBRE;
    }

    public void setP_TXT_NOMBRE(String p_TXT_NOMBRE) {
        P_TXT_NOMBRE = p_TXT_NOMBRE;
    }

    @JsonProperty(value = "P_TXT_APELLIDOS")
    public String getP_TXT_APELLIDOS() {
        return P_TXT_APELLIDOS;
    }

    public void setP_TXT_APELLIDOS(String p_TXT_APELLIDOS) {
        P_TXT_APELLIDOS = p_TXT_APELLIDOS;
    }

    @JsonProperty(value = "P_DAT_FECHANACIMIENTO")
    public Date getP_DAT_FECHANACIMIENTO() {
        return P_DAT_FECHANACIMIENTO!=null?(Date)P_DAT_FECHANACIMIENTO.clone():null;
    }

    public void setP_DAT_FECHANACIMIENTO(Date p_DAT_FECHANACIMIENTO) {
        P_DAT_FECHANACIMIENTO = p_DAT_FECHANACIMIENTO!=null?(Date)p_DAT_FECHANACIMIENTO.clone():null;
    }

    @JsonProperty(value = "P_TXT_ALIAS")
    public String getP_TXT_ALIAS() {
        return P_TXT_ALIAS;
    }

    public void setP_TXT_ALIAS(String p_TXT_ALIAS) {
        P_TXT_ALIAS = p_TXT_ALIAS;
    }

    @JsonProperty(value = "P_COD_IDIOMAPREF")
    public String getP_COD_IDIOMAPREF() {
        return P_COD_IDIOMAPREF;
    }

    public void setP_COD_IDIOMAPREF(String p_COD_IDIOMAPREF) {
        P_COD_IDIOMAPREF = p_COD_IDIOMAPREF;
    }

    @JsonProperty(value = "P_BOL_FIDELIZACION")
    public boolean isP_BOL_FIDELIZACION() {
        return P_BOL_FIDELIZACION;
    }

    public void setP_BOL_FIDELIZACION(boolean p_BOL_FIDELIZACION) {
        P_BOL_FIDELIZACION = p_BOL_FIDELIZACION;
    }

    @JsonProperty(value = "P_BOL_REBUTVIAT")
    public boolean isP_BOL_REBUTVIAT() {
        return P_BOL_REBUTVIAT;
    }

    public void setP_BOL_REBUTVIAT(boolean p_BOL_REBUTVIAT) {
        P_BOL_REBUTVIAT = p_BOL_REBUTVIAT;
    }

    @JsonProperty(value = "P_BOL_NEWSLETTER")
    public boolean isP_BOL_NEWSLETTER() {
        return P_BOL_NEWSLETTER;
    }

    public void setP_BOL_NEWSLETTER(boolean p_BOL_NEWSLETTER) {
        P_BOL_NEWSLETTER = p_BOL_NEWSLETTER;
    }

    @JsonProperty(value = "P_BOL_COMUNICACIONES")
    public boolean isP_BOL_COMUNICACIONES() {
        return P_BOL_COMUNICACIONES;
    }

    public void setP_BOL_COMUNICACIONES(boolean p_BOL_COMUNICACIONES) {
        P_BOL_COMUNICACIONES = p_BOL_COMUNICACIONES;
    }


    //metodos cliente

    @JsonProperty(value = "P_COD_NACION")
    public String getP_COD_NACION() {
        return P_COD_NACION;
    }

    public void setP_COD_NACION(String p_COD_NACION) {
        P_COD_NACION = p_COD_NACION;
    }

    @JsonProperty(value = "P_TXT_CLASEDOCUMENTO")
    public String getP_TXT_CLASEDOCUMENTO() {
        return P_TXT_CLASEDOCUMENTO;
    }

    public void setP_TXT_CLASEDOCUMENTO(String p_TXT_CLASEDOCUMENTO) {
        P_TXT_CLASEDOCUMENTO = p_TXT_CLASEDOCUMENTO;
    }

    @JsonProperty(value = "P_TXT_DOCIDENTIDAD")
    public String getP_TXT_DOCIDENTIDAD() {
        return P_TXT_DOCIDENTIDAD;
    }

    public void setP_TXT_DOCIDENTIDAD(String p_TXT_DOCIDENTIDAD) {
        P_TXT_DOCIDENTIDAD = p_TXT_DOCIDENTIDAD;
    }


    @JsonProperty(value = "P_COD_CLIENTE")
    public String getP_COD_CLIENTE() {
        return P_COD_CLIENTE;
    }

    public void setP_COD_CLIENTE(String p_COD_CLIENTE) {
        P_COD_CLIENTE = p_COD_CLIENTE;
    }

    public void setP_TXT_NIF(String P_TXT_NIF) {
        this.P_TXT_NIF = P_TXT_NIF;
    }

    @JsonProperty(value = "P_COD_IDIOMA")
    public String getP_COD_IDIOMA() {
        return P_COD_IDIOMA;
    }

    public void setP_COD_IDIOMA(String P_COD_IDIOMA) {
        this.P_COD_IDIOMA = P_COD_IDIOMA;
    }

    @JsonProperty(value = "P_ORG_ID")
    public String getP_ORG_ID() {
        return P_ORG_ID;
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
        return "UserRequest{" +
                "P_COD_IDIOMA='" + P_COD_IDIOMA + '\'' +
                ", P_ORG_ID='" + P_ORG_ID + '\'' +
                ", P_COD_USU='" + P_COD_USU + '\'' +
                ", P_COD_CLI='" + P_COD_CLI + '\'' +
                ", P_TXT_EMAIL='" + P_TXT_EMAIL + '\'' +
                ", P_TXT_NOMBRE='" + P_TXT_NOMBRE + '\'' +
                ", P_TXT_APELLIDOS='" + P_TXT_APELLIDOS + '\'' +
                ", P_DAT_FECHANACIMIENTO=" + P_DAT_FECHANACIMIENTO +
                ", P_TXT_ALIAS='" + P_TXT_ALIAS + '\'' +
                ", P_COD_IDIOMAPREF='" + P_COD_IDIOMAPREF + '\'' +
                ", P_BOL_FIDELIZACION=" + P_BOL_FIDELIZACION +
                ", P_BOL_REBUTVIAT=" + P_BOL_REBUTVIAT +
                ", P_BOL_NEWSLETTER=" + P_BOL_NEWSLETTER +
                ", P_BOL_COMUNICACIONES=" + P_BOL_COMUNICACIONES +
                ", P_COD_NACION='" + P_COD_NACION + '\'' +
                ", P_TXT_CLASEDOCUMENTO='" + P_TXT_CLASEDOCUMENTO + '\'' +
                ", P_TXT_DOCIDENTIDAD='" + P_TXT_DOCIDENTIDAD + '\'' +
                ", P_COD_CLIENTE='" + P_COD_CLIENTE + '\'' +
                ", P_TXT_NIF='" + P_TXT_NIF + '\'' +
                ", P_TXT_MAIL='" + P_TXT_MAIL + '\'' +
                '}';
    }
}
