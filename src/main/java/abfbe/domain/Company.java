package abfbe.domain;

import abfbe.utils.Props;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Date: 20/08/15
 * @author mauret
 *
 * Maps a company that offers food and wine for the event.
 */
@Entity
public class Company extends DomainObject {
    private static final long serialVersionUID = 5222369341791038943L;
    private Long idCompany;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String phone;
    private String email;
    private String description;
    private Menu menu;
    private CheckPoint checkPoint;

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

    public void setName(final String name) {
        this.name = name;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_ADDRESS_LENGTH)
    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @NotNull
    @Pattern(regexp = Props.COMPANY_ZIPCODE_PATTERN)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_CITY_LENGTH)
    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    @Size(min = Props.MIN_LENGTH, max = Props.COMPANY_PHONE_LENGTH)
    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Size(max = Props.COMPANY_DESCRIPTION_LENGTH)
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Valid
    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(final Menu menu) {
        this.menu = menu;
    }

    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    public CheckPoint getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(final CheckPoint checkPoint) {
        this.checkPoint = checkPoint;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        return obj instanceof Company && this.idCompany.equals(((Company) obj).getIdCompany());
    }
}
