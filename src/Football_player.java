public abstract class Football_player {
    private String name;
    private int YearOfBirth;
    private double height;
    private String bodyType;
    private String football_club;
    private Position position;

    public Football_player(String name, int yearOfBirth, double height, String bodyType, String football_club, Position position) {
        this.name = name;
        YearOfBirth = yearOfBirth;
        this.height = height;
        this.bodyType = bodyType;
        this.football_club = football_club;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getFootball_club() {
        return football_club;
    }

    public Position getPosition() {
        return position;
    }

    public String getInfo() {
        return "NAME - " + name +
                "\nYEAR OF BIRTH - " + YearOfBirth +
                "\nHEIGHT - " + height +
                "\nTYPE OF BODY - " + bodyType +
                "\nFOOTBALL CLUB - " + football_club +
                "\nPOSITION - " + position;
    }
}
