package org.launchcode.techjobs.oo;

import java.util.Objects;

//had to change id, next id, and value from public to private for all classes to access them
public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;


    @Override
    public String toString() {
        return value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value == null || value.trim().isEmpty() || value.isEmpty()) {
            value =  "Data not available";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
