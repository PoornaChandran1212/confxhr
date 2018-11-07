package com.kg.xhrservlet.model;

/**
 * Country
 */
public class Country {

    private String firstname;
    private String lastname;
    private String title;
    private String organization;
    private String email;
    private String dob;
    private String phone;
    private String fax;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String showmycontact;
    private String daysattending;
    private String  activityattending;
    private String meals;
    private String requirements;
    private String lastconfattend;
    private String id;
    
    Country() {

    }
   
    Country(String firstname, String lastname, String title, String organization, String email, String dob,
            String phone, String fax, String address1, String address2, String city, String state, String zipcode,
            String showmycontact, String daysattending, String activityattending, String meals, String requirements,
            String lastconfattend,String id) {
    
    this.firstname=firstname;
    this.lastname=lastname;
    this.title=title;
    this.organization=organization;
    this.email=email;
    this.dob=dob;
    this.phone=phone;
    this.fax=fax;
    this.address1=address1;
    this.address2=address2;
    this.city=city;
    this.state=state;
    this.zipcode=zipcode;
    this.showmycontact=showmycontact;
     this.daysattending=daysattending;
     this.activityattending=activityattending;
     this.meals=meals;
     this.requirements=requirements;
     this.lastconfattend=lastconfattend;
     this.id=id;
 
 }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }
 /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
       /**
     * @return the firstname
     */
    public String getshowmycontact() {
        return showmycontact;
    }
 /**
     * @param firstname the firstname to set
     */
    public void setshowmycontact(String showmycontact) {
        this.showmycontact = showmycontact;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the lastconfattend
     */
    public String getLastconfattend() {
        return lastconfattend;
    }

    /**
     * @param lastconfattend the lastconfattend to set
     */
    public void setLastconfattend(String lastconfattend) {
        this.lastconfattend = lastconfattend;
    }

    /**
     * @return the requirements
     */
    public String getRequirements() {
        return requirements;
    }

    /**
     * @param requirements the requirements to set
     */
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    /**
     * @return the meals
     */
    public String getMeals() {
        return meals;
    }

    /**
     * @param meals the meals to set
     */
    public void setMeals(String meals) {
        this.meals = meals;
    }

    /**
     * @return the activityattending
     */
    public String getActivityattending() {
        return activityattending;
    }

    /**
     * @param activityattending the activityattending to set
     */
    public void setActivityattending(String activityattending) {
        this.activityattending = activityattending;
    }

    /**
     * @return the daysattending
     */
    public String getDaysattending() {
        return daysattending;
    }

    /**
     * @param daysattending the daysattending to set
     */
    public void setDaysattending(String daysattending) {
        this.daysattending = daysattending;
    }

    
    
    /**
     * @return the zipcoode
     */
    public String getZipcoode() {
        return zipcode;
    }

    /**
     * @param zipcoode the zipcoode to set
     */
    public void setZipcoode(String zipcoode) {
        this.zipcode = zipcoode;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   
    @Override
    public String toString() {
        return firstname+":::"+lastname+":::"+email+":::"+phone;
        
    }

	
}
