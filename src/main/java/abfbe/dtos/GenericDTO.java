package abfbe.dtos;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.util.Map;

/**
 * Created by mauret on 06/08/15.
 *
 * Provides hateoas power.
 */
public abstract class GenericDto extends ResourceSupport {
    protected static Link buildPageLink(final String rawUrl, final Map<String, String> map, final String rel) {
        String url = rawUrl;
        if (map != null) {
            for (final Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                url = url.replaceFirst("\\{" + stringStringEntry.getKey() + "\\}", stringStringEntry.getValue());
            }
        }
        return new Link(url, rel);
    }
}
