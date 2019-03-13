import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SummaTest {
    @Test
    public void getOperator() throws Exception {
        Sum oper=new Sum();
        String actual=oper.getOperator();
        String expected="+";
        assertEquals(expected,actual);
        System.out.println("Знак сумма корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Minus summat=new Minus();
        double actual = summat.calculateResult();
        double expected = 5;
        assertThat(expected,equalTo(actual));
        System.out.println("Сложение отрабатывает корректно");
    }

}