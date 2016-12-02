package org.monarchinitiative.exomiser.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.monarchinitiative.exomiser.test.ExomiserStubDataConfig;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jules Jacobsen <j.jacobsen@qmul.ac.uk>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExomiserWebApp.class, ExomiserStubDataConfig.class})
public class ExomiserWebAppTest {

    @Test
    public void testContextLoads() {
    }

}