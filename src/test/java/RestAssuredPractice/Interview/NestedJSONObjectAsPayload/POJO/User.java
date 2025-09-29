package RestAssuredPractice.Interview.NestedJSONObjectAsPayload.POJO;
import lombok.*;

@Data
@Setter
@Getter
public class User {
    public String name;
    public String email;
    public Address address;

}
