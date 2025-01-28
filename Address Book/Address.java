public class Address {
    private String name;
    private String age;
    private String address;
    private String phone;
    private String gender;
    private String date;

    Address() {
    };

    Address(String name, String age, String address, String phone, String gender, String date) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.date = date;
    }

    String getName() {
        return this.name;
    }

    String getAge() {
        return this.age;
    }

    String getAddress() {
        return this.address;
    }

    String getPhone() {
        return this.phone;
    }

    String getGender() {
        return this.gender;
    }

    String getDate() {
        return this.date;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(String age) {
        this.age = age;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setDate(String date) {
        this.date = date;
    }

}