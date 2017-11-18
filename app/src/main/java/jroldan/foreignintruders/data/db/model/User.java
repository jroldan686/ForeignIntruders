package jroldan.foreignintruders.data.db.model;

/**
 * Created by usuario on 17/11/17.
 */

public class User {

    private String username;
    private String name;
    private String password;
    private String localidad;
    private String email;
    private int xp;
    private int level;
    private String photo;

    public User(String username, String name, String password, String localidad, String email, int xp, int level, String photo) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.localidad = localidad;
        this.email = email;
        this.xp = xp;
        this.level = level;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return this.username;
    }
}
