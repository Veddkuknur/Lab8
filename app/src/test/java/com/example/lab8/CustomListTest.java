package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void countCities() {
        CustomList cityList = MockCityList();
        City city = new City("Edmonton","AB");
        cityList.addCity(city);
        assertEquals(1, cityList.getCount());
    }

    @Test
    void deleteCities() {
        CustomList cityList = MockCityList();
        City city1 = new City("Edmonton","AB");
        cityList.addCity(city1);
        City city2 = new City("Vancouver","BC");
        cityList.addCity(city2);
        assertEquals(2, cityList.getCount());
        cityList.deleteCity(city2);
        assertEquals(1, cityList.getCount());
        cityList.deleteCity(city1);
        assertEquals(0, cityList.getCount());
    }


}
