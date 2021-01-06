package com.marcelo.view.products;

public class HousesView {
    private final String URL = "https://www.zillow.com/homes/for_sale/?searchQueryState=%7B%22pagination%22%3A%7B%7D%2C%22usersSearchTerm%22%3A%2275048%22%2C%22mapBounds%22%3A%7B%22west%22%3A-96.63413905859375%2C%22east%22%3A-96.54315852880859%2C%22south%22%3A32.92674590564894%2C%22north%22%3A32.995160635666856%7D%2C%22isMapVisible%22%3Atrue%2C%22filterState%22%3A%7B%22built%22%3A%7B%22min%22%3A1994%7D%2C%22ah%22%3A%7B%22value%22%3Atrue%7D%2C%22pool%22%3A%7B%22value%22%3Atrue%7D%7D%2C%22isListVisible%22%3Atrue%2C%22mapZoom%22%3A13%7D";

    private HousesView(){}

    public static HousesView getInstance() {
        return new HousesView();
    }
}
