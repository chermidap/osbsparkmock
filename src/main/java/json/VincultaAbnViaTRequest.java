package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VincultaAbnViaTRequest {
	
	private String p_org_id;
    private String p_cod_idioma;
    private String p_cod_usu;
    private String p_cod_cli;
    private String p_cod_viat;
    private String p_loc_venta;
    private String p_loc_producto;
    
    @JsonProperty(value = "p_org_id")
    public String getP_org_id() {
        return p_org_id;
    }

    public void setP_org_id(String p_org_id) {
        this.p_org_id = p_org_id;
    }

    @JsonProperty(value = "p_cod_idioma")
    public String getP_cod_idioma() {
        return p_cod_idioma;
    }

    public void setP_cod_idioma(String p_cod_idioma) {
        this.p_cod_idioma = p_cod_idioma;
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

	@JsonProperty(value = "p_cod_viat")
	public String getP_cod_viat() {
		return p_cod_viat;
	}

	public void setP_cod_viat(String p_cod_viat) {
		this.p_cod_viat = p_cod_viat;
	}

	@JsonProperty(value = "p_loc_venta")
	public String getP_loc_venta() {
		return p_loc_venta;
	}

	public void setP_loc_venta(String p_loc_venta) {
		this.p_loc_venta = p_loc_venta;
	}

	@JsonProperty(value = "p_loc_producto")
	public String getP_loc_producto() {
		return p_loc_producto;
	}

	public void setP_loc_producto(String p_loc_producto) {
		this.p_loc_producto = p_loc_producto;
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
        return "VincultaAbnViaTRequest{" +
                "p_org_id='" + p_org_id + '\'' +
                ", p_cod_idioma='" + p_cod_idioma + '\'' +
                ", p_cod_usu='" + p_cod_usu + '\'' +
                ", p_cod_cli='" + p_cod_cli + '\'' +
                ", p_cod_viat='" + p_cod_viat + '\'' +
                ", p_loc_venta=" + p_loc_venta +
                ", p_loc_producto=" + p_loc_producto +
                '}';
    }
}
