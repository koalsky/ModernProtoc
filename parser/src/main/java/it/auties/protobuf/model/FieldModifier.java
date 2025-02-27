package it.auties.protobuf.model;

import java.util.Arrays;
import java.util.Optional;

public enum FieldModifier {
    REQUIRED,
    OPTIONAL,
    REPEATED;

    public static Optional<FieldModifier> forName(String name){
        return Arrays.stream(values())
                .filter(entry -> entry.name().toLowerCase().equals(name))
                .findAny();
    }
}
