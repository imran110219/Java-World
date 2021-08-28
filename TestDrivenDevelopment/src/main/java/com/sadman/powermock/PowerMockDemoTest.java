package com.sadman.powermock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.awt.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockDemo.class)
public class PowerMockDemoTest {

    private PowerMockDemo powerMockDemoSpy;

    @Before
    public void setUp() {
        powerMockDemoSpy = PowerMockito.spy(new PowerMockDemo());
    }

//    @Test
//    public void testMockPrivateMethod() throws Exception {
//        Point mockPoint = mock(Point.class);
//
//        PowerMockito.doReturn(mockPoint)
//                .when(powerMockDemoSpy, "privateMethod", anyObject());
//
//        Point actualMockPoint = powerMockDemoSpy.callPrivateMethod();
//
//        assertThat(actualMockPoint, is(mockPoint));
//    }

    @Test
    public void tantamountNumbers() throws Exception {
        String message = "Hello PowerMockito";
        int expectation = 4;

        PowerMockito.doReturn(expectation).when(powerMockDemoSpy, "privateMethod", message);

        int product = powerMockDemoSpy.callproductNumbers(2,2);

        Assert.assertEquals(product,4);
    }
}
