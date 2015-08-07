package abfbe.utils;

import abfbe.domain.Company;

/**
 * Created by mauret on 07/08/15.
 *
 * Holds data like attributes constrains for domain and other
 */
public class Props {

    /**
     * Encoding properties
     */
    public static final String APPLICATION_JSON_UTF8 = "application/json; charset=UTF-8";

    /**
     * Common constrains
     */
    public static final int MIN_LENGTH = 3;
    public static final int MAX_ITEMS_PER_PAGE = 20;

    /**
     * {@link Company} constrains
     */
    public static final int COMPANY_NAME_LENGTH = 50;
    public static final int COMPANY_ADDRESS_LENGTH = 100;
    public static final String COMPANY_ZIPCODE_PATTERN = "^[0-9]{5}(?:-[0-9]{4})?$";
    public static final int COMPANY_CITY_LENGTH = 50;
    public static final int COMPANY_PHONE_LENGTH = 15;
}
