package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPdfFacturaClienteResponse {

    private String s_cod_error;
    private String s_pdf;

	@JsonProperty(value = "s_cod_error")
	public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
	}

	@JsonProperty(value = "s_pdf")
	public String getS_pdf() {
		return s_pdf;
	}

	public void setS_pdf(String s_pdf) {
		this.s_pdf = s_pdf;
	}

	
	
}
