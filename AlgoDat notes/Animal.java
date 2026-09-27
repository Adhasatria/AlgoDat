    class Hewan{
        String jenis;
    }
    class Ikan extends Hewan{
        void gerak(){
            System.out.println("Renang");
        }
    }
     class Harimau extends Hewan{
        void gerak(){
            System.out.println("Jalan");
        }
    }

public class Animal{
   
    public static void main(String[] args) {
        Ikan fish = new Ikan();
        fish.jenis = "Hiu";
        System.out.println(fish.jenis);
        fish.gerak();

        Harimau hari1 = new Harimau();
        hari1.gerak();

    }
}