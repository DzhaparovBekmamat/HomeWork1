public final class Neymar extends Football_player {
    public Neymar(String name, int yearOfBirth, double height, String bodyType, String football_club, Position position) {
        super(name, yearOfBirth, height, bodyType, football_club, position);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nNEYMAR IS THE BEST FOOTBALL PLAYER IN BRAZIL";
    }
}


