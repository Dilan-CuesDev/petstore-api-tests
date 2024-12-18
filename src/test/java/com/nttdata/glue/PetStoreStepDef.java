package com.nttdata.glue;

import com.nttdata.steps.PetStoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PetStoreStepDef {
    @Steps
    PetStoreStep store;

    /*PetStoreStep tienda;

    @Given("la url es {string}")
    public void laUrlEs(String url) {
        tienda.definirURL(url);
    }

    @When("consulto la mascota con ID {string}")
    public void consultoLaMascotaConID(String idMascota) {
        tienda.consultarMascota(idMascota);
    }

    @Then("valido el codigo de respuesa sea {int}")
    public void validoElCodigoDeRespuesaSea(int statusCode) {
       tienda.validacionRespuesta(statusCode);
    }

    @And("valido el nombre de la mascota sea {string}")
    public void validoElNombreDeLaMascotaSea(String nombreMascota) {
        tienda.validarNombreMascota(nombreMascota);
    }

    @When("creo la mascota {string} con ID {string}")
    public void creoLaMascotaConID(String nombre, String idMascota) {
        tienda.CrearMascota(nombre, idMascota);
    }*/

    @Given("la url es {string}")
    public void laUrlEs(String url) {
        store.definirURL(url);
    }

    @When("creo una orden con ID {string}, petId {string}, cantidad {string}, fecha {string}, status {string} y complete {string}")
    public void creoUnaOrden(String id, String petId, String cantidad, String fecha, String status, String complete) {
        store.crearOrden(id, petId, cantidad, fecha, status, Boolean.parseBoolean(complete));
    }

    @When("consulto la orden con ID {string}")
    public void consultoLaOrdenConID(String id) {
        store.consultarOrden(id);
    }

    @Then("valido el código de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statusCode) {
        store.validarCodigoRespuesta(statusCode);
    }

    @And("valido que el ID de la orden en el body sea {string}")
    public void validoElIdDeLaOrden(String idEsperado) {
        store.validarIdOrden(idEsperado);
    }

    @And("valido que el status de la orden sea {string}")
    public void validoElStatusDeLaOrden(String status) {
        store.validarStatusOrden(status);
    }

    @And("valido que el ID de la orden sea {string}")
    public void validoQueElIdDeLaOrdenSea(String idEsperado) {
        store.validarIdOrdenConsulta(idEsperado);
    }

}
