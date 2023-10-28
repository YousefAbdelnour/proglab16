
import java.util.ArrayList;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joeay
 */
public class Hospital {

    private String name;
    static Hospital hospital;
    private ArrayList<Person> patients;
    private ArrayList<Person> doctors;

    private Hospital(String name) {
        this.name = name;
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    public static Hospital create(String name) {
        if (hospital == null) {
            hospital = new Hospital(name);
        }
        return hospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Hospital getHospital() {
        return hospital;
    }

    public static void replace(Hospital hospital) {
        Hospital.hospital = hospital;
    }

    public ArrayList<Person> getPatients() {
        return patients;
    }

    public void addPatients(Person patient) {
        patients.add(patient);
    }

    public ArrayList<Person> getDoctors() {
        return doctors;
    }

    public void addDoctors(Person doctor) {
        doctors.add(doctor);
    }

    String view(String s) {
        Locale l = new Locale(s);
        String str = java.util.ResourceBundle.getBundle("lang", l).getString("HOSPITAL INFORMATION: ");
        str += "\n"; //NOI18N
        str += java.util.ResourceBundle.getBundle("lang", l).getString("HOSPITAL NAME:") + name;
        str += "\n"; //NOI18N        
        str += "\n"; //NOI18N
        str += java.util.ResourceBundle.getBundle("lang", l).getString("DOCTOR DETAILS:");
        str += "\n"; //NOI18N
        for (Person doctor : doctors) {
            str += doctor.view(l);
            str += "\n"; //NOI18N
        }
        str += "\n"; //NOI18N
        str += java.util.ResourceBundle.getBundle("lang", l).getString("PATIENT DETAILS: ");
        str += "\n"; //NOI18N
        for (Person patient : patients) {
            str += patient.view(l);
            str += "\n"; //NOI18N
        }
        return str;
    }
}
