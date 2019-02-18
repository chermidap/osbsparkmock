package json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse {

    private String S_COD_ERROR;

    @JsonProperty(value = "S_COD_ERROR")
    public String getS_COD_ERROR() {
		return S_COD_ERROR;
	}
	public void setS_COD_ERROR(String s_COD_ERROR) {
		S_COD_ERROR = s_COD_ERROR;
	}

	@Override
	public String toString() {
		return "BaseResponse{" + "S_COD_ERROR='" + S_COD_ERROR + '}';
	}
}
