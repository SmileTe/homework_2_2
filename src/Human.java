public class Human {
    private String name;
    private Integer yearOfBirth;
    private String city;
    private String position;

    public Human(String name, Integer yearOfBirth,  String city, String position) {
        this.name = name;
         setCity(city);
        setYearOfBirth(yearOfBirth);
        this.position = position;
    }

    @Override
    public String toString() {
        String  nameString = name == null? "Информация не указана. ":"Меня зовут " + name +". ";
        String  cityString = city == null? "Информация не указана. ":"Я из города " + city+". ";
        String  positionString = position == null? "Информация не указана. ":"Я работаю на должности " + position+". ";


        return "Привет! " +
                 nameString +
                cityString +
                "Я родился в " + yearOfBirth + " году. "
        + positionString
                + "Будем знакомы!";

    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setYearOfBirth(Integer yearOfBirth) {

        if(yearOfBirth == null || yearOfBirth<0 ) {
            this.yearOfBirth = 0;
        }
        else {this.yearOfBirth = yearOfBirth;}
    }

    public void setCity(String city) {
        if(city == null || city.isEmpty() || city.isBlank()) {
            this.city = "Информация не указана";
        }
        else {this.city = city;}
    }
}
