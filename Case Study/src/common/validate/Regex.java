package common.validate;

public class Regex {
    // mã dịch vụ có định dạng là SVXX-YYYY, ở XX nếu Villa thì sẽ là VL còn Room sẽ là RO
//    còn YYYY sẽ là 4 số từ 0 đến 9
    public static final String ID_VILLA_REGEX = "^SVVL\\-\\d{4}$";


    public static final String ID_ROOM_REGEX = "^SVRO\\-\\d{4}$";

    //-Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường

    public static final String NAME_SERVICE_REGEX = "^[A-Z][a-z]+$";
    //    Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
    public static final String AREA_REGEX = "^(3[0-9]|[1-9][0-9][0-9]+)$";
    //chi phí thuê là số dương
    public static final String RENTAL_COST_REGEX = "^[0-9]+$";
    //    số người tối đa phải lớn hơn 0 và nhỏ hơn 20
    public static final String MAX_NUMBER_OF_PEOPLE_REGEX = "(0?[1-9]|1\\\\d)$";
    //số Tầng là số nguyên dương
    public static final String FLOOR_REGEX = "^(0?[1-9]|[1-9]\\\\d+)$";
    // Kiểu thuê phải theo (Ngày hoặc Tháng hoặc Năm)
    public static final String TYPE_RENTAL_REGEX = "^(Day)|(Month)|(Year)$";
    //Tiêu chuẩn phòng có 3 loại là Normal hoặc Vip hoặc President
    public static final String STANDARD_ROOM_REGEX = "^(Normal)|(VIP)|(President)$";
    // ngày sinh lớn hơn 18
    public static final String DATE_OF_BIRTH_REGEX = "^(0?[1-9]|[12][0-9]|3[01])\\\\/(0?[1-9]|1[012])\\\\/(19[2-9][2-9]|200[0-4])$";


}
