/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joeay
 */
public class HospitalController {

    Hospital h;

    public HospitalController(String name) {
         Hospital.create(name);
    }

    public String getName() {
        return h.getName();
    }

    public void setName(String name) {
        this.h.setName(name);
    }

    public static Hospital getHospital() {
        return Hospital.hospital;
    }

    public static void replace(Hospital hospital) {
        Hospital.replace(hospital);
    }
}
