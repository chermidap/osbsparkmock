package json;

import java.util.Date;
import java.util.List;

public class TicketPricesReq {

    private String coduser;
    private List<Ticket> P_SABALIST_ABONOS;
    private Date P_DAT_FECHAINICIO;
    private String P_COD_IDIOMA;
    private String P_ORG_ID;

    public String getCoduser() {
        return coduser;
    }

    public void setCoduser(String coduser) {
        this.coduser = coduser;
    }

    public List<Ticket> getP_SABALIST_ABONOS() {
        return P_SABALIST_ABONOS;
    }

    public void setP_SABALIST_ABONOS(List<Ticket> p_SABALIST_ABONOS) {
        P_SABALIST_ABONOS = p_SABALIST_ABONOS;
    }

    public Date getP_DAT_FECHAINICIO() {
        return P_DAT_FECHAINICIO;
    }

    public void setP_DAT_FECHAINICIO(Date p_DAT_FECHAINICIO) {
        P_DAT_FECHAINICIO = p_DAT_FECHAINICIO;
    }

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
}
