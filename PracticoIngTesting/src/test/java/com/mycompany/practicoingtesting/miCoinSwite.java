
package com.mycompany.practicoingtesting;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite //importar dependencia: org.junit.platform -> junit-platform-suite, si no funca darle build sino ¬.¬"
@SelectClasses({
    ConversorMonedaTest.class,
    CotizacionTest.class,
    DolaritosTest.class
    
})

public class miCoinSwite {
    
  
}
