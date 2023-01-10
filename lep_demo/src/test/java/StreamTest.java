import entry.Person;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author lep
 * @date 2023/1/10
 */
public class StreamTest {

    @Test
    public void Test(){
        Person p1 = Person.builder().name("张三").age(21).sex("男").build();
        Person p2 = Person.builder().name("李四").age(21).sex("女").build();
        Person p3 = Person.builder().name("王五").age(21).sex("男").build();
        Person p4 = Person.builder().name("小六").age(21).sex("女").build();
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        long count = people.stream().distinct().count();
        System.out.println(count);
    }
}
