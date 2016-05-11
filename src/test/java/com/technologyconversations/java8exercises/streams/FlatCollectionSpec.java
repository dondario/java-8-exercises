package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Flatten multidimensional collection
 */
public class FlatCollectionSpec {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(noddy(collection)).hasSameElementsAs(expected);
    }

    private List<String> noddy(List<List<String>> collection) {
        return collection.stream()
                .flatMap( stringList -> stringList.stream())
                .collect(Collectors.toList());
    }

}
