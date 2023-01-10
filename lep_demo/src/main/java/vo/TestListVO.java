package vo;

import lombok.Data;
import java.util.List;

/**
 * @author lep
 * @date 2023/1/10
 */
@Data
public class TestListVO<T> {
    private List<T> list;
}
