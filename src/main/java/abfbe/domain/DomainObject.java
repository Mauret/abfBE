package abfbe.domain;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

/**
 * Date: 29/07/15
 * @author mauret
 */
public abstract class DomainObject extends ResourceSupport implements Serializable {
    private static final long serialVersionUID = 9028371986162016672L;
}
