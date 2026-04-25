package module4_Kateryna.homework_optional;

public enum Breed {
    BEAGLE("beagle"),
    FRENCH_BULLDOG("french bulldog"),
    ROTTWEILER("rottweiler");

    private final String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
