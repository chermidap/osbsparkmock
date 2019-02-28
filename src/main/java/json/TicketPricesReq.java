package json;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Date;
import java.util.List;

public class TicketPricesReq {

    private String coduser;
    private List<TicketReq> P_SABALIST_ABONOS;
    private String P_DAT_FECHAINICIO;
    private String P_COD_IDIOMA;
    private String P_ORG_ID;

    private String p_dat_hora_inicio;
    private String p_dat_hora_fin;
    private String p_dias_semana;

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
    public String getP_DAT_FECHAINICIO() {
        return P_DAT_FECHAINICIO;
    }

    public void setP_DAT_FECHAINICIO(String p_DAT_FECHAINICIO) {
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

    @JsonProperty(value = "p_dat_hora_inicio")
    public String getP_dat_hora_inicio() {
        return p_dat_hora_inicio;
    }

    public void setP_dat_hora_inicio(String p_dat_hora_inicio) {
        this.p_dat_hora_inicio = p_dat_hora_inicio;
    }

    @JsonProperty(value = "p_dat_hora_fin")
    public String getP_dat_hora_fin() {
        return p_dat_hora_fin;
    }

    public void setP_dat_hora_fin(String p_dat_hora_fin) {
        this.p_dat_hora_fin = p_dat_hora_fin;
    }

    @JsonProperty(value = "p_dat_dias_de_semana")
    public String getP_dias_semana() {
        return p_dias_semana;
    }

    public void setP_dias_semana(String p_dias_semana) {
        this.p_dias_semana = p_dias_semana;
    }

    @Override
    public String toString() {
        return "TicketPricesReq{" +
                "coduser='" + coduser + '\'' +
                ", P_SABALIST_ABONOS=" + P_SABALIST_ABONOS +
                ", P_DAT_FECHAINICIO=" + P_DAT_FECHAINICIO +
                ", P_COD_IDIOMA='" + P_COD_IDIOMA + '\'' +
                ", P_ORG_ID='" + P_ORG_ID + '\'' +
                ", p_dat_hora_inicio='" + p_dat_hora_inicio + '\'' +
                ", p_dat_hora_fin='" + p_dat_hora_fin + '\'' +
                ", p_dias_semana='" + p_dias_semana + '\'' +
                '}';
    }
}
