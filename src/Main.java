public class Main {
    public static void main(String[] args) {
        Messi messi = new Messi("LIONEL MESSI", 1987, 1.70, "SPORT BODY", "PSG", Position.RIGHT_WINGER);
        System.out.println(messi.getInfo());
        System.out.println();
        Ronaldo ronaldo = new Ronaldo("CRISTIANO RONALDO", 1985, 1.85, "BODYBUILDER", "AL-NASR", Position.CENTRAL_FORWARD);
        System.out.println(ronaldo.getInfo());
        ronaldo.cost();
        ronaldo.cost(60);
        System.out.println();
        Neymar neymar = new Neymar("NEYMAR JUNIOR", 1995,1.75,"THIN","PSG",Position.LEFT_WINGER);
        System.out.println(neymar.getInfo());
        neymar.getInfo();
        System.out.println("THAT'S ALL");
    }
}
