package org.palbor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MyBean.class})
public class ServiceTest {

    @Autowired
    private MyBean myBean;

    @Test
    public void myTest(){
        myBean.addElement("e1");
        assertThat(myBean.elements(), is(equalTo("e1 ")));
        myBean.addElement("e2");
        assertThat(myBean.elements(), is(equalTo("e2 e1 ")));
        myBean.addElement("e3");
        assertThat(myBean.elements(), is(equalTo("e3 e2 e1 ")));
        myBean.addElement("e4");
        assertThat(myBean.elements(), is(equalTo("e4 e3 e2 e1 ")));
        myBean.addElement("e5");
        assertThat(myBean.elements(), is(equalTo("e5 e4 e3 e2 e1 ")));
        myBean.addElement("e6");
        assertThat(myBean.elements(), is(equalTo("e6 e5 e4 e3 e2 ")));
        myBean.addElement("e7");
        assertThat(myBean.elements(), is(equalTo("e7 e6 e5 e4 e3 ")));
    }

}