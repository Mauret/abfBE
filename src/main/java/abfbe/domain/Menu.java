package abfbe.domain;

import abfbe.utils.Props;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Date: 20/08/15
 * @author mauret
 *
 * Maps a menu for a {@link Company}
 */
@Entity
public class Menu extends DomainObject {
    private static final long serialVersionUID = -2936406036135373019L;
    private Long idMenu;
    private String name;
    private List<MenuEntry> menuEntries;
    private Company company;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(final Long idMenu) {
        this.idMenu = idMenu;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.MENU_NAME_LENGTH)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @NotNull
    @ManyToMany
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    public List<MenuEntry> getMenuEntries() {
        return menuEntries;
    }

    public void setMenuEntries(final List<MenuEntry> menuEntries) {
        this.menuEntries = menuEntries;
    }

    @OneToOne
    @OnDelete(action = OnDeleteAction.NO_ACTION)
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
        return obj instanceof Menu && this.idMenu.equals(((Menu) obj).getIdMenu());
    }
}
