package exceptions.model;

import java.time.OffsetDateTime;

public class UserModel {

    private long id;
    private String name;
    private String email;
    private OffsetDateTime birthday;
    
    public UserModel(int i, String name2, String email2, OffsetDateTime birthday2) {}

    public UserModel(long id, String name, String email, OffsetDateTime birthday2) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday2;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public OffsetDateTime getBirthday() { return birthday; }
    public void setBirthday(OffsetDateTime birthday) { this.birthday = birthday; }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserModel other = (UserModel) obj;
        if (id != other.id) return false;
        if (name == null ? other.name != null : !name.equals(other.name)) return false;
        if (email == null ? other.email != null : !email.equals(other.email)) return false;
        return birthday == null ? other.birthday == null : birthday.equals(other.birthday);
    }

    @Override
    public String toString() {
        return "UserModel [id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + birthday + "]";
    }
}
