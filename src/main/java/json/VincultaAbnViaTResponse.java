package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VincultaAbnViaTResponse {
	
	private String s_cod_error;
  
    @JsonProperty(value = "s_cod_error")
    public String getS_cod_error() {
		return s_cod_error;
	}

	public void setS_cod_error(String s_cod_error) {
		this.s_cod_error = s_cod_error;
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
        return "VincultaAbnViaTResponse{" +
                "s_cod_error='" + s_cod_error + '\'' +
                '}';
    }
}
