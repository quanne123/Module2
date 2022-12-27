package common;

import java.util.regex.Pattern;

public class Validate {
    public static final String NAME_SERVICE_REGEX = "^SV(VL|RO)-[0-9]{4}$";
    public static void setNameServiceRegex(String nameService) throws RegularException {
        if (Pattern.matches(NAME_SERVICE_REGEX,nameService)){

        }else {
            throw new RegularException();
        }
    }

    public static final String AREA_REGEX = "^[3-9]{1}[0-9]+(.[0-9]+|[0-9]+|)$";

    public static void  setAreaServiceRegex(double area) throws RegularException {
        String str = area+"";
        if (Pattern.matches(AREA_REGEX,str)){

        }else {
           throw new RegularException();
        }
    }

    public static final String COST_RENT_REGEX ="^[0-9]+$";

    public static void setCostRentRegex(int cost) throws RegularException {
        String str = cost+"";
        if (Pattern.matches(COST_RENT_REGEX,str)){

        }else {
            throw new RegularException();
        }
    }

    public static final String NUMBER_TENANTS_REGEX = "^([1-9]|10|11|12|13|14|15|16|17|18|19){1}$";

    public static void setNumberTenantsRegex(int numberTenantsRegex) throws RegularException {
        String str = numberTenantsRegex+"";
        if (Pattern.matches(NUMBER_TENANTS_REGEX,str)){

        }else {
            throw new RegularException();
        }
    }

    public static final String FLOOR_REGEX = "^[1-9]{2}$";

    public static void setFloorRegex(int floorRegex) throws RegularException {
        String str = floorRegex+"";
        if (Pattern.matches(FLOOR_REGEX,str)){

        }else {
            throw new RegularException();
        }
    }

    public static final String TYPE_RENT_REGEX = "^YEAR|ROOM|DAY$";

    public static void setTypeRentRegex(String typeRentRegex) throws RegularException {
        if (Pattern.matches(TYPE_RENT_REGEX,typeRentRegex)){

        }else {
            throw new RegularException();

        }
    }

    public static final String STANDARD_REGEX = "^VIP|NORMAL|PRESIDENT$";

    public static void setStandardRegex(String standardRegex) throws RegularException {
        if (Pattern.matches(STANDARD_REGEX,standardRegex)){

        }else {
            throw new RegularException();
        }
    }

    public static final String TYPE_CUSTOMER_REGEX = "^Diamond|Platinium|Gold|Silver|Member$";

    public static void setTypeCustomerRegex(String typeCustomerRegex) throws RegularException {
        if (Pattern.matches(TYPE_CUSTOMER_REGEX,typeCustomerRegex)){

        }else {
            throw new RegularException();
        }
    }

}
