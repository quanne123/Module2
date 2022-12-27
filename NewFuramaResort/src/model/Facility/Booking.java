package model.Facility;

public class Booking {
    private int id;
    private String dateBegin;
    private String dateEnd;
    private String nameService;

    public Booking() {
    }

    public Booking(int id, String dateBegin, String dateEnd, String nameService) {
        this.id = id;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.nameService = nameService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", dateBegin='" + dateBegin + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", nameService='" + nameService + '\'' +
                '}';
    }


}
