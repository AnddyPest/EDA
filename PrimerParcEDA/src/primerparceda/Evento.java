/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparceda;

/**
 *
 * @author mauri
 */
public class Evento {
    private int timestamp;
    private String descri;

    public Evento() {
    }

    
    
    public Evento(int timestamp, String descri) {
        this.timestamp = timestamp;
        this.descri = descri;
    }

    public long getTimestamp() {
        return timestamp;
    }
    
    @Override
    public String toString() {
        return "Event{" +
                "timestamp=" + timestamp +
                ", description='" + descri + '\'' +
                '}';
    }


}
