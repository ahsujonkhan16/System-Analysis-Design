
package online_sopping;


public class Address {
    
    private String district;
    private String city;
    private String road;
    private String post_office;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getPost_office() {
        return post_office;
    }

    public void setPost_office(String post_office) {
        this.post_office = post_office;
    }

    public Address(String district, String city, String road, String post_office) {
        this.district = district;
        this.city = city;
        this.road = road;
        this.post_office = post_office;
    }

    public String toString() {
        return "Address{" + "district=" + district + ", city=" + city + ", road=" + road + ", post_office=" + post_office + '}';
    }

   public  Address(){
       super();
}
    
    
}
