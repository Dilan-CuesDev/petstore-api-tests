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
    PetStoreStep tienda;


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
    }
}
