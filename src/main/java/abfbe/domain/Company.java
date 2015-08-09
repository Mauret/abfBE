package abfbe.domain;

import abfbe.utils.Props;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by mauret on 29/07/15.
 *
 * Maps a company that offers food and wine for the event.
 */
@Entity
public class Company extends DomainObject {
    private Long idCompany;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String phone;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(final Long idCompany) {
        this.idCompany = idCompany;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_NAME_LENGTH)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_ADDRESS_LENGTH)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @NotNull
    @Pattern(regexp = Props.COMPANY_ZIPCODE_PATTERN)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_CITY_LENGTH)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_PHONE_LENGTH)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Company) {
            return this.idCompany.equals(((Company)obj).getIdCompany());
        }
        return false;
    }
}
