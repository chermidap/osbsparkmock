package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)

public class ProdAbono {

	private String localizadorVenta;//S_TXT_LOCALIZADORVENTA;
    private String fechaHoraVenta;//S_DAT_FECHAHORAVENTA;
	private String fechaCompra; //S_FEC_COMPRA
	private String fechaInicio; //S_FEC_INICIO
	private String tipoAbono; //S_TIPO_ABONO
	private String parking; //S_PARKING
	private String descuento; //S_DESCUENTO
	private String cuotaConDescuento; //S_CUOTA_CON_DESCUENTO
	private String estado; //S_ESTADO
    private String iban; //S_IBAN
    private String viaT; //S_VIA_T
    private String matricula; //S_MATRICULA
    private String marca; //S_MARCA
    private String modelo; //S_MODELO
    private String color; //S_COLOR

    @JsonProperty(value = "s_txt_localizadorVenta")
	public String getLocalizadorVenta() {
		return localizadorVenta;
	}

	public void setLocalizadorVenta(String localizadorVenta) {
		this.localizadorVenta = localizadorVenta;
	}

	@JsonProperty(value = "s_dat_fechaHoraVenta")
	public String getFechaHoraVenta() {
		return fechaHoraVenta;
	}

	public void setFechaHoraVenta(String fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}

	@JsonProperty(value = "s_fec_compra")
	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	@JsonProperty(value = "s_fec_inicio")
	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@JsonProperty(value = "s_tipo_abono")
	public String getTipoAbono() {
		return tipoAbono;
	}

	public void setTipoAbono(String tipoAbono) {
		this.tipoAbono = tipoAbono;
	}

	@JsonProperty(value = "s_parking")
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	@JsonProperty(value = "s_descuento")
	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	@JsonProperty(value = "s_cuota_con_dto")
	public String getCuotaConDescuento() {
		return cuotaConDescuento;
	}

	public void setCuotaConDescuento(String cuotaConDescuento) {
		this.cuotaConDescuento = cuotaConDescuento;
	}

	@JsonProperty(value = "s_estado")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@JsonProperty(value = "s_via_t")
	public String getViaT() {
		return viaT;
	}

	public void setViaT(String viaT) {
		this.viaT = viaT;
	}

	@JsonProperty(value = "s_matricula")
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @JsonProperty(value = "s_marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @JsonProperty(value = "s_modelo")
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @JsonProperty(value = "s_color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @JsonProperty(value = "s_iban")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    @Override
    public String toString() {
    	return "OSBDataTicket: {localizadorVenta: " + localizadorVenta + 
    			" fechaHoraVenta: " + fechaHoraVenta +
    			" fechaCompra: " + fechaCompra +
    			" fechaInicio: " + fechaInicio + 
    			" tipoAbono: " + tipoAbono + 
    			" parking: " + parking + 
    			" descuento: " + descuento + 
    			" cuotaConDescuento: " + cuotaConDescuento +
    			" estado: " + estado +
    			" iban: " + iban + 
    			" viaT: " + viaT + 
    			" matricula: " + matricula + 
    			" marca: " + marca + 
    			" modelo: " + modelo + 
    			" color: " + color + 
    			"}";
    }
}
