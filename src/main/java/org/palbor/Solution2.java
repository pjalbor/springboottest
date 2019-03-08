package org.palbor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Solution2 {

    public static void main(String[] args) {
        final char a ='a';
        final String[] countries = {"United States", "England", "Germany", "Netherlands", "Slovenia"};
        Stream<String> countriesStream = Stream.of(countries);
        ExecutorService service = Executors.newCachedThreadPool();
        countriesStream.map(Country::new).forEach(service::execute);
    }
}
