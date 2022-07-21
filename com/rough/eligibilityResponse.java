package com.rough;

public class eligibilityResponse {
    private Integer Id;
    private String name;
    private Integer age;
    private Boolean found;

    eligibilityResponse(Integer Id, String name, Integer age){
        this.Id = Id;
        this.name = name;
        this.age = age;
    }

    /**
     * @return Integer return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getFound() {
        return found;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    

}
