package com.softserve.academy.module4.homework;

enum Breeds {
    MALTESE("Maltese "),
    BULLDOG("Bulldog "),
    POODLE("Poodle "),
    ;
    private final String breeds;

    Breeds(String breeds) {
        this.breeds = breeds;
    }

    public String getBreeds() {
        return breeds;
    }

}

