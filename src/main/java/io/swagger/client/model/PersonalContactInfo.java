/*
 * RingCentral API
 * RingCentral Connect Platform API
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactAddressInfo;
import org.joda.time.DateTime;

/**
 * PersonalContactInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class PersonalContactInfo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  /**
   * This property has a special meaning only on Address Book Sync (e.g. a contact can be 'Deleted'). For simple contact list reading it has always the default value - 'Alive'
   */
  public enum AvailabilityEnum {
    @SerializedName("Alive")
    ALIVE("Alive"),
    
    @SerializedName("Deleted")
    DELETED("Deleted"),
    
    @SerializedName("Purged")
    PURGED("Purged");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("availability")
  private AvailabilityEnum availability = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("nickName")
  private String nickName = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  @SerializedName("homePhone")
  private String homePhone = null;

  @SerializedName("homePhone2")
  private String homePhone2 = null;

  @SerializedName("businessPhone")
  private String businessPhone = null;

  @SerializedName("businessPhone2")
  private String businessPhone2 = null;

  @SerializedName("mobilePhone")
  private String mobilePhone = null;

  @SerializedName("businessFax")
  private String businessFax = null;

  @SerializedName("companyPhone")
  private String companyPhone = null;

  @SerializedName("assistantPhone")
  private String assistantPhone = null;

  @SerializedName("carPhone")
  private String carPhone = null;

  @SerializedName("otherPhone")
  private String otherPhone = null;

  @SerializedName("otherFax")
  private String otherFax = null;

  @SerializedName("callbackPhone")
  private String callbackPhone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("email2")
  private String email2 = null;

  @SerializedName("email3")
  private String email3 = null;

  @SerializedName("homeAddress")
  private ContactAddressInfo homeAddress = null;

  @SerializedName("businessAddress")
  private ContactAddressInfo businessAddress = null;

  @SerializedName("otherAddress")
  private ContactAddressInfo otherAddress = null;

  @SerializedName("birthday")
  private DateTime birthday = null;

  @SerializedName("webPage")
  private String webPage = null;

  @SerializedName("notes")
  private String notes = null;

  public PersonalContactInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Standard resource properties ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Standard resource properties ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PersonalContactInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Canonical URI
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PersonalContactInfo availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * This property has a special meaning only on Address Book Sync (e.g. a contact can be 'Deleted'). For simple contact list reading it has always the default value - 'Alive'
   * @return availability
  **/
  @ApiModelProperty(example = "null", value = "This property has a special meaning only on Address Book Sync (e.g. a contact can be 'Deleted'). For simple contact list reading it has always the default value - 'Alive'")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public PersonalContactInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of a personal contact
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First name of a personal contact")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonalContactInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of a personal contact
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last name of a personal contact")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonalContactInfo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of a personal contact
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "Middle name of a personal contact")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PersonalContactInfo nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * Nick name of a personal contact
   * @return nickName
  **/
  @ApiModelProperty(example = "null", value = "Nick name of a personal contact")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public PersonalContactInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company name of a personal contact
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "Company name of a personal contact")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public PersonalContactInfo jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Job title of a personal contact
   * @return jobTitle
  **/
  @ApiModelProperty(example = "null", value = "Job title of a personal contact")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public PersonalContactInfo homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Home phone of a personal contact
   * @return homePhone
  **/
  @ApiModelProperty(example = "null", value = "Home phone of a personal contact")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public PersonalContactInfo homePhone2(String homePhone2) {
    this.homePhone2 = homePhone2;
    return this;
  }

   /**
   * The 2-d home phone of a personal contact
   * @return homePhone2
  **/
  @ApiModelProperty(example = "null", value = "The 2-d home phone of a personal contact")
  public String getHomePhone2() {
    return homePhone2;
  }

  public void setHomePhone2(String homePhone2) {
    this.homePhone2 = homePhone2;
  }

  public PersonalContactInfo businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Business phone of a personal contact
   * @return businessPhone
  **/
  @ApiModelProperty(example = "null", value = "Business phone of a personal contact")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public PersonalContactInfo businessPhone2(String businessPhone2) {
    this.businessPhone2 = businessPhone2;
    return this;
  }

   /**
   * The 2-d business phone of a personal contact
   * @return businessPhone2
  **/
  @ApiModelProperty(example = "null", value = "The 2-d business phone of a personal contact")
  public String getBusinessPhone2() {
    return businessPhone2;
  }

  public void setBusinessPhone2(String businessPhone2) {
    this.businessPhone2 = businessPhone2;
  }

  public PersonalContactInfo mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Mobile phone of a personal contact
   * @return mobilePhone
  **/
  @ApiModelProperty(example = "null", value = "Mobile phone of a personal contact")
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public PersonalContactInfo businessFax(String businessFax) {
    this.businessFax = businessFax;
    return this;
  }

   /**
   * Business fax of a personal contact
   * @return businessFax
  **/
  @ApiModelProperty(example = "null", value = "Business fax of a personal contact")
  public String getBusinessFax() {
    return businessFax;
  }

  public void setBusinessFax(String businessFax) {
    this.businessFax = businessFax;
  }

  public PersonalContactInfo companyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
    return this;
  }

   /**
   * Company phone of a personal contact
   * @return companyPhone
  **/
  @ApiModelProperty(example = "null", value = "Company phone of a personal contact")
  public String getCompanyPhone() {
    return companyPhone;
  }

  public void setCompanyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
  }

  public PersonalContactInfo assistantPhone(String assistantPhone) {
    this.assistantPhone = assistantPhone;
    return this;
  }

   /**
   * Assistant phone of a personal contact
   * @return assistantPhone
  **/
  @ApiModelProperty(example = "null", value = "Assistant phone of a personal contact")
  public String getAssistantPhone() {
    return assistantPhone;
  }

  public void setAssistantPhone(String assistantPhone) {
    this.assistantPhone = assistantPhone;
  }

  public PersonalContactInfo carPhone(String carPhone) {
    this.carPhone = carPhone;
    return this;
  }

   /**
   * Car phone of a personal contact
   * @return carPhone
  **/
  @ApiModelProperty(example = "null", value = "Car phone of a personal contact")
  public String getCarPhone() {
    return carPhone;
  }

  public void setCarPhone(String carPhone) {
    this.carPhone = carPhone;
  }

  public PersonalContactInfo otherPhone(String otherPhone) {
    this.otherPhone = otherPhone;
    return this;
  }

   /**
   * Other phone of a personal contact
   * @return otherPhone
  **/
  @ApiModelProperty(example = "null", value = "Other phone of a personal contact")
  public String getOtherPhone() {
    return otherPhone;
  }

  public void setOtherPhone(String otherPhone) {
    this.otherPhone = otherPhone;
  }

  public PersonalContactInfo otherFax(String otherFax) {
    this.otherFax = otherFax;
    return this;
  }

   /**
   * Other fax of a personal contact
   * @return otherFax
  **/
  @ApiModelProperty(example = "null", value = "Other fax of a personal contact")
  public String getOtherFax() {
    return otherFax;
  }

  public void setOtherFax(String otherFax) {
    this.otherFax = otherFax;
  }

  public PersonalContactInfo callbackPhone(String callbackPhone) {
    this.callbackPhone = callbackPhone;
    return this;
  }

   /**
   * Callback phone of a personal contact
   * @return callbackPhone
  **/
  @ApiModelProperty(example = "null", value = "Callback phone of a personal contact")
  public String getCallbackPhone() {
    return callbackPhone;
  }

  public void setCallbackPhone(String callbackPhone) {
    this.callbackPhone = callbackPhone;
  }

  public PersonalContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of a personal contact
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Email of a personal contact")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonalContactInfo email2(String email2) {
    this.email2 = email2;
    return this;
  }

   /**
   * The 2-d email of a personal contact
   * @return email2
  **/
  @ApiModelProperty(example = "null", value = "The 2-d email of a personal contact")
  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public PersonalContactInfo email3(String email3) {
    this.email3 = email3;
    return this;
  }

   /**
   * The 3-d email of a personal contact
   * @return email3
  **/
  @ApiModelProperty(example = "null", value = "The 3-d email of a personal contact")
  public String getEmail3() {
    return email3;
  }

  public void setEmail3(String email3) {
    this.email3 = email3;
  }

  public PersonalContactInfo homeAddress(ContactAddressInfo homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

   /**
   * Home address of a personal contact
   * @return homeAddress
  **/
  @ApiModelProperty(example = "null", value = "Home address of a personal contact")
  public ContactAddressInfo getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(ContactAddressInfo homeAddress) {
    this.homeAddress = homeAddress;
  }

  public PersonalContactInfo businessAddress(ContactAddressInfo businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Business address of a personal contact
   * @return businessAddress
  **/
  @ApiModelProperty(example = "null", value = "Business address of a personal contact")
  public ContactAddressInfo getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(ContactAddressInfo businessAddress) {
    this.businessAddress = businessAddress;
  }

  public PersonalContactInfo otherAddress(ContactAddressInfo otherAddress) {
    this.otherAddress = otherAddress;
    return this;
  }

   /**
   * Other address of a personal contact
   * @return otherAddress
  **/
  @ApiModelProperty(example = "null", value = "Other address of a personal contact")
  public ContactAddressInfo getOtherAddress() {
    return otherAddress;
  }

  public void setOtherAddress(ContactAddressInfo otherAddress) {
    this.otherAddress = otherAddress;
  }

  public PersonalContactInfo birthday(DateTime birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Date of birth of a personal contact in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
   * @return birthday
  **/
  @ApiModelProperty(example = "null", value = "Date of birth of a personal contact in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z")
  public DateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(DateTime birthday) {
    this.birthday = birthday;
  }

  public PersonalContactInfo webPage(String webPage) {
    this.webPage = webPage;
    return this;
  }

   /**
   * Web page of a personal contact
   * @return webPage
  **/
  @ApiModelProperty(example = "null", value = "Web page of a personal contact")
  public String getWebPage() {
    return webPage;
  }

  public void setWebPage(String webPage) {
    this.webPage = webPage;
  }

  public PersonalContactInfo notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes of a personal contact
   * @return notes
  **/
  @ApiModelProperty(example = "null", value = "Notes of a personal contact")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalContactInfo personalContactInfo = (PersonalContactInfo) o;
    return Objects.equals(this.id, personalContactInfo.id) &&
        Objects.equals(this.url, personalContactInfo.url) &&
        Objects.equals(this.availability, personalContactInfo.availability) &&
        Objects.equals(this.firstName, personalContactInfo.firstName) &&
        Objects.equals(this.lastName, personalContactInfo.lastName) &&
        Objects.equals(this.middleName, personalContactInfo.middleName) &&
        Objects.equals(this.nickName, personalContactInfo.nickName) &&
        Objects.equals(this.company, personalContactInfo.company) &&
        Objects.equals(this.jobTitle, personalContactInfo.jobTitle) &&
        Objects.equals(this.homePhone, personalContactInfo.homePhone) &&
        Objects.equals(this.homePhone2, personalContactInfo.homePhone2) &&
        Objects.equals(this.businessPhone, personalContactInfo.businessPhone) &&
        Objects.equals(this.businessPhone2, personalContactInfo.businessPhone2) &&
        Objects.equals(this.mobilePhone, personalContactInfo.mobilePhone) &&
        Objects.equals(this.businessFax, personalContactInfo.businessFax) &&
        Objects.equals(this.companyPhone, personalContactInfo.companyPhone) &&
        Objects.equals(this.assistantPhone, personalContactInfo.assistantPhone) &&
        Objects.equals(this.carPhone, personalContactInfo.carPhone) &&
        Objects.equals(this.otherPhone, personalContactInfo.otherPhone) &&
        Objects.equals(this.otherFax, personalContactInfo.otherFax) &&
        Objects.equals(this.callbackPhone, personalContactInfo.callbackPhone) &&
        Objects.equals(this.email, personalContactInfo.email) &&
        Objects.equals(this.email2, personalContactInfo.email2) &&
        Objects.equals(this.email3, personalContactInfo.email3) &&
        Objects.equals(this.homeAddress, personalContactInfo.homeAddress) &&
        Objects.equals(this.businessAddress, personalContactInfo.businessAddress) &&
        Objects.equals(this.otherAddress, personalContactInfo.otherAddress) &&
        Objects.equals(this.birthday, personalContactInfo.birthday) &&
        Objects.equals(this.webPage, personalContactInfo.webPage) &&
        Objects.equals(this.notes, personalContactInfo.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, availability, firstName, lastName, middleName, nickName, company, jobTitle, homePhone, homePhone2, businessPhone, businessPhone2, mobilePhone, businessFax, companyPhone, assistantPhone, carPhone, otherPhone, otherFax, callbackPhone, email, email2, email3, homeAddress, businessAddress, otherAddress, birthday, webPage, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalContactInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    homePhone2: ").append(toIndentedString(homePhone2)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhone2: ").append(toIndentedString(businessPhone2)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    businessFax: ").append(toIndentedString(businessFax)).append("\n");
    sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    sb.append("    assistantPhone: ").append(toIndentedString(assistantPhone)).append("\n");
    sb.append("    carPhone: ").append(toIndentedString(carPhone)).append("\n");
    sb.append("    otherPhone: ").append(toIndentedString(otherPhone)).append("\n");
    sb.append("    otherFax: ").append(toIndentedString(otherFax)).append("\n");
    sb.append("    callbackPhone: ").append(toIndentedString(callbackPhone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    email2: ").append(toIndentedString(email2)).append("\n");
    sb.append("    email3: ").append(toIndentedString(email3)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    otherAddress: ").append(toIndentedString(otherAddress)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    webPage: ").append(toIndentedString(webPage)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

