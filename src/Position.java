public class Ronaldo extends Football_player{
    public Ronaldo(String name, int yearOfBirth, double height, String bodyType, String football_club, Position position) {
        super(name, yearOfBirth, height, bodyType, football_club, position);
    }
    public void cost(){
        System.out.println("СТОИМОСТЬ ФУТБОЛИСТА ДОСТИАГЕТ ДО 180 МЛН ЕВРО !");
    }
    public final void cost(int cost){
        if (cost<=0){
            System.out.println("ФУТБОЛИСТ ИГРАЕТ В ЛЮБИТЕЛЬСКОЙ ЛИГЕ !");
        }
        System.out.println("СТОИМОСТЬ ФУТБОЛИСТА НА ДАННЫЙ МОМЕНТ = "+cost+" МЛН ЕВРО");
    }
}
