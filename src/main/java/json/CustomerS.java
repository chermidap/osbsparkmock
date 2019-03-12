package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class CustomerS {

    private String s_cod_cli;
    private String s_txt_nif;
    private String s_txt_nombreCompleto;
    private String s_nacionalidad;
    private String s_pec;
    private String s_partita_iva;
    private String s_nombre;
    private String s_apellido_1;
    private String s_apellido_2;
    private String s_direccion_fiscal;
    private String s_cod_postal;
    private String s_poblacion;
    private long s_telefono;
    private String street;
    private String streetNumber;
    private String streetType;
    private String province;

    @JsonProperty(value = "s_cod_cli")
    public String getS_cod_cli() {
        return s_cod_cli;
    }

    public void setS_cod_cli(String s_cod_cli) {
        this.s_cod_cli = s_cod_cli;
    }

    @JsonProperty(value = "s_txt_nif")
    public String getS_txt_nif() {
        return s_txt_nif;
    }

    public void setS_txt_nif(String s_txt_nif) {
        this.s_txt_nif = s_txt_nif;
    }

    @JsonProperty(value = "s_txt_nombreCompleto")
    public String getS_txt_nombreCompleto() {
        return s_txt_nombreCompleto;
    }

    public void setS_txt_nombreCompleto(String s_txt_nombreCompleto) {
        this.s_txt_nombreCompleto = s_txt_nombreCompleto;
    }

    @JsonProperty(value = "s_nacionalidad")
    public String getS_nacionalidad() {
        return s_nacionalidad;
    }

    public void setS_nacionalidad(String s_nacionalidad) {
        this.s_nacionalidad = s_nacionalidad;
    }

    @JsonProperty(value = "s_pec")
    public String getS_pec() {
        return s_pec;
    }

    public void setS_pec(String s_pec) {
        this.s_pec = s_pec;
    }

    @JsonProperty(value = "s_partita_iva")
    public String getS_partita_iva() {
        return s_partita_iva;
    }

    public void setS_partita_iva(String s_partita_iva) {
        this.s_partita_iva = s_partita_iva;
    }

    @JsonProperty(value = "s_nombre")
    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    @JsonProperty(value = "s_apellido_1")
    public String getS_apellido_1() {
        return s_apellido_1;
    }

    public void setS_apellido_1(String s_apellido_1) {
        this.s_apellido_1 = s_apellido_1;
    }

    @JsonProperty(value = "s_apellido_2")
    public String getS_apellido_2() {
        return s_apellido_2;
    }

    public void setS_apellido_2(String s_apellido_2) {
        this.s_apellido_2 = s_apellido_2;
    }

    @JsonProperty(value = "s_direccion_fiscal")
    public String getS_direccion_fiscal() {
        return s_direccion_fiscal;
    }

    public void setS_direccion_fiscal(String s_direccion_fiscal) {
        this.s_direccion_fiscal = s_direccion_fiscal;
    }

    @JsonProperty(value = "s_cod_postal")
    public String getS_cod_postal() {
        return s_cod_postal;
    }

    public void setS_cod_postal(String s_cod_postal) {
        this.s_cod_postal = s_cod_postal;
    }

    @JsonProperty(value = "s_poblacion")
    public String getS_poblacion() {
        return s_poblacion;
    }

    public void setS_poblacion(String s_poblacion) {
        this.s_poblacion = s_poblacion;
    }

    @JsonProperty(value = "s_telefono")
    public long getS_telefono() {
        return s_telefono;
    }

    public void setS_telefono(long s_telefono) {
        this.s_telefono = s_telefono;
    }
    
    @JsonProperty(value = "s_domicilio")
    public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@JsonProperty(value = "s_num_domicilio")
	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	@JsonProperty(value = "s_tipo_via")
	public String getStreetType() {
		return streetType;
	}

	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}

	@JsonProperty(value = "s_provincia")
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
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
        CustomerS that = (CustomerS) o;
        return Objects.equals(s_cod_cli, that.s_cod_cli);
    }

    @Override
    public int hashCode() {

        return Objects.hash(s_cod_cli);
    }

    @Override
    public String toString() {
        return "OSBCustomerS{" +
                "s_cod_cli='" + s_cod_cli + '\'' +
                ", s_txt_nif='" + s_txt_nif + '\'' +
                ", s_txt_nombreCompleto='" + s_txt_nombreCompleto + '\'' +
                ", s_nacionalidad='" + s_nacionalidad + '\'' +
                ", s_pec='" + s_pec + '\'' +
                ", s_partita_iva='" + s_partita_iva + '\'' +
                ", s_nombre='" + s_nombre + '\'' +
                ", s_apellido_1='" + s_apellido_1 + '\'' +
                ", s_apellido_2='" + s_apellido_2 + '\'' +
                ", s_direccion_fiscal='" + s_direccion_fiscal + '\'' +
                ", s_cod_postal='" + s_cod_postal + '\'' +
                ", s_poblacion='" + s_poblacion + '\'' +
                ", s_telefono=" + s_telefono +
                '}';
    }
}
