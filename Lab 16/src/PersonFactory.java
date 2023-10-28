/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joeay
 */
public class PersonFactory {

    public Person create(String name, int id, boolean d) {
        if (d) {
            return new Doctor(name, id);
        } else {
            return new Patient(name, id);
        }
    }
}
