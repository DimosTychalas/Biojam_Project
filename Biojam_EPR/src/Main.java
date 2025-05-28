public class Main {
    public static void main(String[] args) {
        // Δημιουργία παραδειγμάτων
        YpallilosApothikis yp1 = new YpallilosApothikis("Νίκος", 2101234567L, "nikos@company.com");
        YpefthinosApothikis ypa1 = new YpefthinosApothikis("Μαρία", 2107654321L, "maria@company.com");
        Apothema ap = new Apothema("Μήλα", 100.5, 1.2, "AgroFruit S.A.");
        Paraggelia p1 = new Paraggelia("1234", "2025-05-25", "Εκκρεμεί", "Κανονική");
        
        Logistis log1 = new Logistis("Γιάννης", 2101111222L, "giannis@company.com");
        YpefthinosAgoras ya1 = new YpefthinosAgoras("Κώστας", 2102222333L, "kostas@company.com");
        Agrotis ag1 = new Agrotis("Γιώργος", 2103333444L, "giorgos@farm.gr");
        Frouto f1 = new Frouto("Πορτοκάλια", "F123", 0.85);
        
        Pelatis pel1 = new Pelatis("Ανδρέας", 2105555666L, "Αθηνάς 12");
        Politis pol1 = new Politis("Ελένη", 2107777888L, "eleni@gmail.com");
        Proion pr1 = new Proion("Χυμός", "P987");

        // Ενδεικτική χρήση
        System.out.println("Πελάτης: " + pel1.getOnoma());
        System.out.println("Προϊόν: " + pr1.getOnoma());
    }
}