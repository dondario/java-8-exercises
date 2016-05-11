package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Partition adults and kids
 */
public class PartitioningSpec {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
//        Map<Boolean, List<Person>> result = partitionAdults(collection);
        Map<Boolean, List<Person>> result = noddy(collection);
        assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(asList(sara));
    }

    private Map<Boolean, List<Person>> noddy(List<Person> collection) {
        return collection.stream()
                .collect(Collectors.partitioningBy( p -> p.getAge() > 19));

    }

}
