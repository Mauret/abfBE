package abfbe.domain;

import abfbe.utils.Props;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Date: 20/08/15
 * @author mauret
 *
 * Maps a menu entruy for a {@link Menu}
 */
@Entity
public class MenuEntry extends DomainObject {
    private static final long serialVersionUID = 6839784953940207821L;
    private Long idMenuEntry;
    private String name;
    private List<Menu> menus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdMenuEntry() {
        return idMenuEntry;
    }

    public void setIdMenuEntry(Long idMenuEntry) {
        this.idMenuEntry = idMenuEntry;
    }

    @NotNull
    @Size(min = Props.MIN_LENGTH, max = Props.MENU_ENTRY_NAME_LENGTH)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(targetEntity = Menu.class, fetch = FetchType.LAZY)
    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
