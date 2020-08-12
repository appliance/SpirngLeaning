package armo.tacocloud;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Taco {

    @NonNull    // name 属性非空 但是可以为empty
    @Size(min=5, message="Name must be at least 5 characters.")
    private String name;

    @Size(min=1, message="You must choose at least 1 ingredient.")
    private List<String> ingredeints;
}
