package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        ArrayList<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(new Country("Canada", new BigDecimal("56114523")));
        northAmericaCountries.add(new Country("Mexico", new BigDecimal("43114523")));
        northAmericaCountries.add(new Country("USA", new BigDecimal("143114523")));

        ArrayList<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(new Country("Brasil", new BigDecimal("12332453632")));
        southAmericaCountries.add(new Country("Chile", new BigDecimal("123453632")));
        southAmericaCountries.add(new Country("Brasil", new BigDecimal("332453638")));

        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Russia", new BigDecimal("6345246564")));
        asiaCountries.add(new Country("China", new BigDecimal("1006345246564")));
        asiaCountries.add(new Country("India", new BigDecimal("1106345246564")));

        Continent asia = new Continent("Asia", asiaCountries);
        Continent northAmerica = new Continent("North America", northAmericaCountries);
        Continent southAmerica = new Continent("South America", southAmericaCountries);

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(asia);
        continents.add(northAmerica);
        continents.add(southAmerica);

        World world = new World(continents);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2132066444163");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
