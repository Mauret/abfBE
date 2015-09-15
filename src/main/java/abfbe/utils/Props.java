package abfbe.utils;

/**
 * Date: 20/08/15
 * @author mauret
 *
 * Holds data like attributes constrains for domain and other
 */
public class Props {

    /*
     * Encoding properties
     */
    public static final String APPLICATION_JSON_UTF8 = "application/json; charset=UTF-8";

    /*
     * Common constrains
     */
    public static final int MIN_LENGTH = 3;
    public static final int MAX_ITEMS_PER_PAGE = 20;

    /*
     * Company constrains
     */
    public static final int COMPANY_NAME_LENGTH = 50;
    public static final int COMPANY_ADDRESS_LENGTH = 100;
    public static final String COMPANY_ZIPCODE_PATTERN = "^[0-9]{5}(?:-[0-9]{4})?$";
    public static final int COMPANY_CITY_LENGTH = 50;
    public static final int COMPANY_PHONE_LENGTH = 15;
    public static final int COMPANY_DESCRIPTION_LENGTH = 100000;

    /*
     * MenuEntry constrains
     */
    public static final int MENU_ENTRY_NAME_LENGTH = 300;

    /*
     * Menu constrains
     */
    public static final int MENU_NAME_LENGTH = 100;

    /*
     * CheckPoint constrains
     */
    public static final int CHECKPOINT_NAME_LENGTH = 50;
}
