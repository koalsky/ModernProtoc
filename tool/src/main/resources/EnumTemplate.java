<% if(!pack.empty && imports) { %>
package ${pack};
<% } %>

<% if(imports) { %>
import com.fasterxml.jackson.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.*;
<% } %>

@AllArgsConstructor
@Accessors(fluent = true)
public enum ${enm.name} {
    ${enm.statements.collect{ it.name + '(' + it.index + ')'}.join(', ')};

    @Getter
    private final int index;

    @JsonCreator
    public static ${enm.name} forIndex(int index){
        return Arrays.stream(values()).filter(entry -> entry.index() == index).findFirst().orElse(null);
    }
}
