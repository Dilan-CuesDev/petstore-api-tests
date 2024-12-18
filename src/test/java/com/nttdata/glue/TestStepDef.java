package com.nttdata.glue;

import com.nttdata.steps.TestStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestStepDef {

    @Steps
    TestStep obj;

    @Given("prueba de assertion")
    public void pruebaDeAssertion() {
        obj.metodoPrueba();
    }

    @When("pruebo un servicio url {string}")
    public void prueboUnServicioUrl(String url) {

        obj.abrirPagina(url);


    }

    @When("inicio sesion con {string} y {string}")
    public void inicioSesionConY(String usuario, String clave) {

        System.out.println("primer: " + usuario);
        System.out.println("2do: " + clave);
    }
}
