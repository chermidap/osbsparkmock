package json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;
import java.util.List;

public class TicketPricesReq {

    private String coduser;
    private List<TicketReq> P_SABALIST_ABONOS;
    private Date P_DAT_FECHAINICIO;
    private String P_COD_IDIOMA;
    private String P_ORG_ID;

    @JsonProperty(value = "p_cod_usu")
    public String getCoduser() {
        return coduser;
    }

    public void setCoduser(String coduser) {
        this.coduser = coduser;
    }

    @JsonProperty(value = "p_lista_productos")
    public List<TicketReq> getP_SABALIST_ABONOS() {
        return P_SABALIST_ABONOS;
    }

    public void setP_SABALIST_ABONOS(List<TicketReq> p_SABALIST_ABONOS) {
        P_SABALIST_ABONOS = p_SABALIST_ABONOS;
    }

    @JsonProperty(value = "p_dat_fecha_inicio")
    public Date getP_DAT_FECHAINICIO() {
        return P_DAT_FECHAINICIO;
    }

    public void setP_DAT_FECHAINICIO(Date p_DAT_FECHAINICIO) {
        P_DAT_FECHAINICIO = p_DAT_FECHAINICIO;
    }
    @JsonProperty(value = "p_cod_idioma")
    public String getP_COD_IDIOMA() {
        return P_COD_IDIOMA;
    }

    public void setP_COD_IDIOMA(String p_COD_IDIOMA) {
        P_COD_IDIOMA = p_COD_IDIOMA;
    }
    @JsonProperty(value = "p_org_id")
    public String getP_ORG_ID() {
        return P_ORG_ID;
    }

    public void setP_ORG_ID(String p_ORG_ID) {
        P_ORG_ID = p_ORG_ID;
    }
}
