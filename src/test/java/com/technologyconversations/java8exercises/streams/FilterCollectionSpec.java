package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionSpec {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(noddy(collection)).hasSameElementsAs(expected);
    }

    private List<String> noddy(List<String> collection) {
        return collection.stream()
                .filter(getWordGreaterThan(4))
                .collect(toList());

    }

    // move out to another helper class for testing.
    private Predicate<String> getWordGreaterThan(int i) {
        return value -> { return value.length() < i; };
    }

}
