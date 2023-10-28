
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joeay
 */
public class Patient implements Person {

    private String name;
    private String id;

    public Patient(String name, int id) {
        this.name = name;
        this.id = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("lang_fr").getString("P{0}"), new Object[]{id});
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("lang_fr").getString("P{0}"), new Object[]{id});
    }

    @Override
    public String view(Locale s) {
        String str = java.util.ResourceBundle.getBundle("lang", s).getString("PATIENT'S NAME:") + name;
        str += "\n";
        str += java.util.ResourceBundle.getBundle("lang", s).getString("PATIENT'S ID:") + id;
        str += "\n";
        return str;
    }

}
