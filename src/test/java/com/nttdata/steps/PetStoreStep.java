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

    /*public void consultarMascota(String idMascota) {
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
    }*/


    public void crearOrden(String id, String petId, String cantidad, String fecha, String status, boolean complete) {
        String body = "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"petId\": " + petId + ",\n" +
                "  \"quantity\": " + cantidad + ",\n" +
                "  \"shipDate\": \"" + fecha + "\",\n" +
                "  \"status\": \"" + status + "\",\n" +
                "  \"complete\": " + complete + "\n" +
                "}";

        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .header("Content-Type", "application/json")
                .relaxedHTTPSValidation()
                .body(body)
                .log().all()
                .post("/store/order")
                .then()
                .log().all()
                .extract().response();
    }

    public void consultarOrden(String idOrden) {
        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .relaxedHTTPSValidation()
                .log().all()
                .get("/store/order/" + idOrden)
                .then()
                .log().all()
                .extract().response();
    }

    public void validarCodigoRespuesta(int statusCode) {
        Assert.assertEquals("Validación de código de respuesta", statusCode, response.statusCode());
    }

    public void validarIdOrden(String idEsperado) {
        String idResponse = response.jsonPath().getString("id");
        Assert.assertEquals("Validación del ID de la orden", idEsperado, idResponse);
    }

    public void validarStatusOrden(String statusEsperado) {
        String statusResponse = response.jsonPath().getString("status");
        Assert.assertEquals("Validación del status de la orden", statusEsperado, statusResponse);
    }

    public void validarIdOrdenConsulta(String idEsperado) {
        String idResponse = response.jsonPath().getString("id");
        Assert.assertEquals("Validación del ID de la orden en la consulta", idEsperado, idResponse);
    }


}
