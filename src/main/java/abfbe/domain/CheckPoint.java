package abfbe.domain;

import abfbe.utils.Props;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Date: 14/09/15
 *
 * @author mauret
 */
@Entity
public class CheckPoint extends DomainObject {
    private static final long serialVersionUID = -4619784712432121945L;
    private Long idCheckPoint;
    private String name;
    private String longitude;
    private String latitude;
    private Company company;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdCheckPoint() {
        return idCheckPoint;
    }

    public void setIdCheckPoint(final Long idCheckPoint) {
        this.idCheckPoint = idCheckPoint;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.CHECKPOINT_NAME_LENGTH)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @NotNull
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(final String longitude) {
        this.longitude = longitude;
    }

    @NotNull
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(final String latitude) {
        this.latitude = latitude;
    }

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    public Company getCompany() {
        return company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        return obj instanceof CheckPoint && this.idCheckPoint.equals(((CheckPoint) obj)
                .getIdCheckPoint());
    }
}
