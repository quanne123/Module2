package common.validate;

import common.exception.UserException;

import java.util.regex.Pattern;

public class RegexView  {
    public static void idVilla(String id) throws UserException {

        if (Pattern.matches(Regex.ID_VILLA_REGEX,id)){

        }else {
            throw new UserException("error");

        }

    }

    public static void idRoom(String id) throws UserException {

        if (Pattern.matches(Regex.ID_ROOM_REGEX,id)){

        }else {
            throw new UserException("Error");
        }
    }
    public static void nameService(String nameService) throws UserException {
        if (Pattern.matches(Regex.NAME_SERVICE_REGEX,nameService)){

        }else {
            throw new UserException("Error");
    }

    }
    public static void area(int area) throws UserException{
        String str = area+"";
        if (Pattern.matches(Regex.AREA_REGEX,str)){

        }else {
            throw new UserException("Error");
        }
    }

    public static void rentalCost(int rentalCost) throws UserException{
        String str = rentalCost+"";
        if (Pattern.matches(Regex.RENTAL_COST_REGEX,str)){


        }else {
            throw new UserException("Error");
        }
    }

    public static void numberOfTenants(int numberTenants) throws UserException{
        String str = numberTenants+"";
        if (Pattern.matches(Regex.MAX_NUMBER_OF_PEOPLE_REGEX,str)){

        }else {
            throw new UserException("Error");
        }
    }
    public static void rentalType(String rentalType) throws UserException{
        if (Pattern.matches(Regex.TYPE_RENTAL_REGEX,rentalType)){

        }else {
            throw new UserException("Enter Again");
        }
    }

    public static void standardRoom(String standard) throws UserException{
        if (Pattern.matches(Regex.STANDARD_ROOM_REGEX,standard)){

        }else {
            throw new UserException("Enter Again");
        }
    }
    public static void dateOfBirth(String date) throws UserException{
        if (Pattern.matches(Regex.DATE_OF_BIRTH_REGEX,date)){

        }else {
            throw new UserException("Enter Again");
        }
    }

    public static void floor(int floor) throws UserException {
        String str = floor+"";
        if (Pattern.matches(Regex.FLOOR_REGEX,str)){

        }else {
            throw new UserException("Enter again");
        }
    }



}
