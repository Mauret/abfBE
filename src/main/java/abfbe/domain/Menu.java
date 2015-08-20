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
    private List<Company> companies;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.MENU_NAME_LENGTH)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @ManyToMany(targetEntity = MenuEntry.class, fetch = FetchType.EAGER)
    public List<MenuEntry> getMenuEntries() {
        return menuEntries;
    }

    public void setMenuEntries(List<MenuEntry> menuEntries) {
        this.menuEntries = menuEntries;
    }

    @NotNull
    @OneToMany(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
