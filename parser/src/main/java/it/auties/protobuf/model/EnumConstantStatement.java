package it.auties.protobuf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public final class EnumConstantStatement implements ProtobufStatement {
    private String name;
    private int index;
}
