package util;

/**
 * Created by Tizian Q on 20.03.2016.
 */
public enum Category {
    GENERAL("General"),
    RECEIVED("Received Files");

    private String name;

    Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
