package abfbe.dtos;

import abfbe.domain.Company;
import com.fasterxml.jackson.annotation.*;

/**
 * Created by mauret on 07/08/15.
 *
 * Maps {@link Company} in a hateoas like object.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, defaultImpl = CompanyDto.class)
public class CompanyDto extends GenericDto {
    private Long idCompany;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String phone;
    private String email;

    @JsonCreator
    public CompanyDto(@JsonProperty("idCompany") final Long idCompany,
                      @JsonProperty("name") final String name,
                      @JsonProperty("address") final String address,
                      @JsonProperty("zipcode") final String zipcode,
                      @JsonProperty("city") final String city,
                      @JsonProperty("phone") final String phone,
                      @JsonProperty("email") final String email) {
        this.idCompany = idCompany;
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        addLinks();
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(final Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    private void addLinks() {
//        TODO: add links add, edit, delete. Self link is added by default
    }
}
