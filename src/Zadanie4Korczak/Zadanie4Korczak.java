package Zadanie4Korczak;

public class Zadanie4Korczak {
    public static void main(String[] args) {
        int amountOfBricksKorczak = 79;
        int containerCapacityKorczak = 8;
        int fullContainersKorczak = amountOfBricksKorczak/containerCapacityKorczak;
        int amountOfContainersKorczak = (int)Math.ceil((double)amountOfBricksKorczak/containerCapacityKorczak);
        int amountOfBricksLeftKorczak = amountOfBricksKorczak%containerCapacityKorczak;
        System.out.println("Mamy "+fullContainersKorczak  +" pełnych pojemników");
        System.out.println("Mamy "+ amountOfContainersKorczak + " pojemników ogólnie");
        System.out.println("W niezapełnionym pojemniku jest "+ amountOfBricksLeftKorczak +" klocków");

    }
}
