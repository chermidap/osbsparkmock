package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerP {

    private String p_txt_docIdentidad;
    private String p_cod_nacion;
    private String p_txt_nombre;
    private String  p_txt_claseDocumento;
    private String  p_txt_apellidos;//Apellidos si el registro NO es para cliente abonado. Si el cliente es abonado, este campo debe de estar a NULL
    private String p_apellido_1;
    private String p_apellido_2;
    private String p_direccion_fiscal;
    private String p_cod_postal;
    private String p_poblacion;
    private String p_email;
    private String p_telefono;
    private String p_renuncia;//Renuncia factura física. (S)í o (N)o. Por Defecto (S)í
    private String p_descode;//??
    private String p_pec;//en el caso de Factura Electrónica ITALIA
    private String p_partita_iva;//No usado para esta fase de proyecto aunque ya se tiene en cuenta

    public String getP_txt_docIdentidad() {
        return p_txt_docIdentidad;
    }

    public void setP_txt_docIdentidad(String p_txt_docIdentidad) {
        this.p_txt_docIdentidad = p_txt_docIdentidad;
    }

    public String getP_cod_nacion() {
        return p_cod_nacion;
    }

    public void setP_cod_nacion(String p_cod_nacion) {
        this.p_cod_nacion = p_cod_nacion;
    }

    public String getP_txt_nombre() {
        return p_txt_nombre;
    }

    public void setP_txt_nombre(String p_txt_nombre) {
        this.p_txt_nombre = p_txt_nombre;
    }

    public String getP_txt_claseDocumento() {
        return p_txt_claseDocumento;
    }

    public void setP_txt_claseDocumento(String p_txt_claseDocumento) {
        this.p_txt_claseDocumento = p_txt_claseDocumento;
    }

    public String getP_txt_apellidos() {
        return p_txt_apellidos;
    }

    public void setP_txt_apellidos(String p_txt_apellidos) {
        this.p_txt_apellidos = p_txt_apellidos;
    }

    public String getP_apellido_1() {
        return p_apellido_1;
    }

    public void setP_apellido_1(String p_apellido_1) {
        this.p_apellido_1 = p_apellido_1;
    }

    public String getP_apellido_2() {
        return p_apellido_2;
    }

    public void setP_apellido_2(String p_apellido_2) {
        this.p_apellido_2 = p_apellido_2;
    }

    public String getP_direccion_fiscal() {
        return p_direccion_fiscal;
    }

    public void setP_direccion_fiscal(String p_direccion_fiscal) {
        this.p_direccion_fiscal = p_direccion_fiscal;
    }

    public String getP_cod_postal() {
        return p_cod_postal;
    }

    public void setP_cod_postal(String p_cod_postal) {
        this.p_cod_postal = p_cod_postal;
    }

    public String getP_poblacion() {
        return p_poblacion;
    }

    public void setP_poblacion(String p_poblacion) {
        this.p_poblacion = p_poblacion;
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getP_telefono() {
        return p_telefono;
    }

    public void setP_telefono(String p_telefono) {
        this.p_telefono = p_telefono;
    }

    public String getP_renuncia() {
        return p_renuncia;
    }

    public void setP_renuncia(String p_renuncia) {
        this.p_renuncia = p_renuncia;
    }

    public String getP_descode() {
        return p_descode;
    }

    public void setP_descode(String p_descode) {
        this.p_descode = p_descode;
    }

    public String getP_pec() {
        return p_pec;
    }

    public void setP_pec(String p_pec) {
        this.p_pec = p_pec;
    }

    public String getP_partita_iva() {
        return p_partita_iva;
    }

    public void setP_partita_iva(String p_partita_iva) {
        this.p_partita_iva = p_partita_iva;
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
        return "CustomerP{" +
                "p_txt_docIdentidad='" + p_txt_docIdentidad + '\'' +
                ", p_cod_nacion='" + p_cod_nacion + '\'' +
                ", p_txt_nombre='" + p_txt_nombre + '\'' +
                ", p_txt_claseDocumento='" + p_txt_claseDocumento + '\'' +
                ", p_txt_apellidos='" + p_txt_apellidos + '\'' +
                ", p_apellido_1='" + p_apellido_1 + '\'' +
                ", p_apellido_2='" + p_apellido_2 + '\'' +
                ", p_direccion_fiscal='" + p_direccion_fiscal + '\'' +
                ", p_cod_postal='" + p_cod_postal + '\'' +
                ", p_poblacion='" + p_poblacion + '\'' +
                ", p_email='" + p_email + '\'' +
                ", p_telefono='" + p_telefono + '\'' +
                ", p_renuncia='" + p_renuncia + '\'' +
                ", p_descode='" + p_descode + '\'' +
                ", p_pec='" + p_pec + '\'' +
                ", p_partita_iva='" + p_partita_iva + '\'' +
                '}';
    }
}
