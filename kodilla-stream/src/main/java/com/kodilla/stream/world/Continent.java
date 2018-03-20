package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private final String continentName;
    private final List<Country> listOfCountries;

    public Continent(String continentName, List<Country> listOfCountries) {
        this.continentName = continentName;
        this.listOfCountries = listOfCountries;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!continentName.equals(continent.continentName)) return false;
        return listOfCountries.equals(continent.listOfCountries);
    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        result = 31 * result + listOfCountries.hashCode();
        return result;
    }
}
