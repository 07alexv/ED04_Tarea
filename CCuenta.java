/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Alex
 */
/**
 * Esta clase simula el comportamiento de una cuenta bancaria
 * 
 */

public class CCuenta {

    /**
     * @return el nombre del titular de la cuenta
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del titular de la cuenta a pasarle como parámetro
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nº de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta nº de la cuenta a pasarle como parámetro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo de la cuenta a pasarle como parámetro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipo de interés al psarle como parámetro
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Atributos
     */


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
 * Constructor con los siguientes parámetros
 * @param nom String, Nombre del titular
 * @param cue String, Número de cuenta
 * @param sal Double, Saldo de la cuenta
 * @param tipo Double, Tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Saldo de la cuenta es:
 * @return 
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param cantidad a ingresar en la cuenta
 * @throws Exception devuelta en caso de que se ingrese una cantidad negaiva
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad a retirar de la cuenta
 * @throws Exception devuelta en caso de que se introduzca un número negativo o se haya puesto una cantidad superior al saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
