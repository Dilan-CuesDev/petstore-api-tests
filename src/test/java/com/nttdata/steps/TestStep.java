package com.nttdata.steps;

public class TestStep {

    public TestStep() {
        System.out.println("Hola desde Constructor");
    }

    public void metodoPrueba() {
        System.out.println("Hola, prueba desde STEP");
    }

    public void abrirPagina(String url) {

        System.out.println("Imprimir desde abrirPagina STEP: " + url);
    }
}
