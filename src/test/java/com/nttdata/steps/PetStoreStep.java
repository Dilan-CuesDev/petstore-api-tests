package com.nttdata.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class PetStoreStep {
    Response response;
    private String URL_BASE;

    public void definirURL(String url) {
        URL_BASE = url;
    }

    public void consultarMascota(String idMascota) {
        response = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .baseUri(URL_BASE)
                //.log().all()
                .get("/pet/"+ idMascota)
                .then()
                .log().all()
                .extract().response();
    }

    public void validacionRespuesta(int statusCode) {
        Assert.assertEquals("Validacion de Respuesta", statusCode, response.statusCode());
    }

    public void validarNombreMascota(String nombreMascota) {
        //
    }

    public void CrearMascota(String nombre, String idMascota) {
        String body = "{\n" +
                "  \"id\": " + idMascota + ",\n" +
                "  \"name\": \"" + nombre + "\",\n" +
                "  \"status\": \"available\"\n" +
                "}";
        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .header("content-Type", "application/json")
                .relaxedHTTPSValidation()
                .body(body)
                .log().all()
                .post("/pet")
                .then()
                .extract().response();
    }
}
