package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Convert elements of a collection to upper case.
 */
public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");

        assertThat(noddy(collection)).hasSameElementsAs(expected);
    }

    private List<String> noddy(List<String> collection) {
        return collection.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }


}
