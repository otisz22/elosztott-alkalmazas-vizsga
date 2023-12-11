public class Model {
    private String name;
    private String username;
    private String phone;

    public Model(String name, String username, String phone) {
        this.name = name;
        this.username = username;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }


    public String getPhone() {
        return phone;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\nUserName: " + getUsername() + "\nPhone: " + getPhone();
    }

}
