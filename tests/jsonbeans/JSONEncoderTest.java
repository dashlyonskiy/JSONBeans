package jsonbeans;

import beans.BeansContainer;
import beans.Jar;
import org.junit.Test;

public class JSONEncoderTest {

    JSONEncoder jsonEncoder = new JSONEncoder();
    TestBeanFactory factory = new TestBeanFactory();

    @Test
    public void jsonEncoderDolphinariumTest(){
        System.out.println(new TestStringBuilder().DolphinariumJSONString());
    }

    @Test
    public void primitivesEncodingTest(){
        System.out.println(new TestStringBuilder().PrimitiveBeanJSONString());
    }

    @Test
    public void arraysEncodingTest(){
        System.out.println(new TestStringBuilder().ArraysBeanJSONString());
    }

    @Test
    public void jcomponentTest() throws JSONSerializationException {

        BeansContainer container = new BeansContainer();
        Jar jar = new Jar();
        container.setFirstJar(jar);

        jsonEncoder.saveJSON(container);
        System.out.println(jsonEncoder.JSONasString());
    }
}
