package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Get oldest person from the collection
 */
public class OldestPersonSpec {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(noddy(collection)).isEqualToComparingFieldByField(eva);
    }

    private Person noddy(List<Person> collection) {
        Optional<Person> max = collection.stream()
                .max(Comparator.comparing(Person::getAge));


        return max.get();
    }



}


