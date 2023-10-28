
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
public class Doctor implements Person {

    private String name;
    private String id;

    public Doctor(String name, int id) {
        this.name = name;
        this.id = "D" + id; //NOI18N //NOI18N
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
        this.id = "D" + id; //NOI18N //NOI18N
    }

    @Override
    public String view(Locale s) {
        String str;
        str = java.util.ResourceBundle.getBundle("lang", s).getString("DOCTOR'S NAME:") + name;
        str += "\n";
        str += java.util.ResourceBundle.getBundle("lang", s).getString("DOCTOR'S ID:") + id;
        return str;
    }

}
