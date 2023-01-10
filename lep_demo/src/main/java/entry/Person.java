package entry;

import lombok.Builder;
import lombok.Data;

/**
 * @author lep
 * @date 2023/1/10
 */
@Builder
@Data
public class Person {
    private String name;
    private int age;
    private String sex;
}
