package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse implements Serializable {

    private String id;
    private String name;
    private String surname;
    private String email;
    private String birthDate;
    private boolean newsletter;
    private String password; //TODO - Pasarlo a char[] por seguridad
    private String language = "CAST"; //Por defecto
    private String s_cod_cli;

    @JsonProperty(value = "S_COD_USU")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty(value = "S_TXT_NOMBRE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty(value = "S_TXT_APELLIDOS")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty(value = "S_TXT_EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonProperty(value = "S_DAT_FECHANACIMIENTO")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }



    @JsonProperty(value = "P_BOL_NEWSLETTER")
    public boolean isNewsletter() {
        return newsletter;
    }

    @JsonProperty(value = "S_BOL_NEWSLETTER")
    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty(value = "P_COD_IDIOMAPREF")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty(value = "S_COD_CLI")
    public String getS_cod_cli() {
        return s_cod_cli;
    }

    public void setS_cod_cli(String s_cod_cli) {
        this.s_cod_cli = s_cod_cli;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", newsletter=" + newsletter +
                ", password='" + (password!=null) + '\'' +
                ", language=" + language +
                '}';
    }
}
