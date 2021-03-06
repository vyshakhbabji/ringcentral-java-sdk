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
import io.swagger.client.model.ContactInfo;
import io.swagger.client.model.DepartmentInfo;
import io.swagger.client.model.ExtensionPermissions;
import io.swagger.client.model.ExtensionServiceFeatureInfo;
import io.swagger.client.model.ProfileImageInfo;
import io.swagger.client.model.ReferenceInfo;
import io.swagger.client.model.RegionalSettings;
import io.swagger.client.model.StatusInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ExtensionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contact")
  private ContactInfo contact = null;

  @SerializedName("departments")
  private List<DepartmentInfo> departments = new ArrayList<DepartmentInfo>();

  @SerializedName("extensionNumber")
  private String extensionNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("partnerId")
  private String partnerId = null;

  @SerializedName("permissions")
  private ExtensionPermissions permissions = null;

  @SerializedName("profileImage")
  private ProfileImageInfo profileImage = null;

  @SerializedName("references")
  private List<ReferenceInfo> references = new ArrayList<ReferenceInfo>();

  @SerializedName("regionalSettings")
  private RegionalSettings regionalSettings = null;

  @SerializedName("serviceFeatures")
  private List<ExtensionServiceFeatureInfo> serviceFeatures = new ArrayList<ExtensionServiceFeatureInfo>();

  /**
   * Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
   */
  public enum SetupWizardStateEnum {
    @SerializedName("NotStarted")
    NOTSTARTED("NotStarted"),
    
    @SerializedName("Incomplete")
    INCOMPLETE("Incomplete"),
    
    @SerializedName("Completed")
    COMPLETED("Completed");

    private String value;

    SetupWizardStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("setupWizardState")
  private SetupWizardStateEnum setupWizardState = null;

  /**
   * Extension current state. If the status is 'Unassigned'. Returned for all extensions
   */
  public enum StatusEnum {
    @SerializedName("Enabled")
    ENABLED("Enabled"),
    
    @SerializedName("Disabled")
    DISABLED("Disabled"),
    
    @SerializedName("NotActivated")
    NOTACTIVATED("NotActivated"),
    
    @SerializedName("Unassigned")
    UNASSIGNED("Unassigned");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("statusInfo")
  private StatusInfo statusInfo = null;

  /**
   * Extension type
   */
  public enum TypeEnum {
    @SerializedName("User")
    USER("User"),
    
    @SerializedName("FaxUser")
    FAXUSER("FaxUser"),
    
    @SerializedName("VirtualUser")
    VIRTUALUSER("VirtualUser"),
    
    @SerializedName("DigitalUser")
    DIGITALUSER("DigitalUser"),
    
    @SerializedName("Department")
    DEPARTMENT("Department"),
    
    @SerializedName("Announcement")
    ANNOUNCEMENT("Announcement"),
    
    @SerializedName("Voicemail")
    VOICEMAIL("Voicemail"),
    
    @SerializedName("SharedLinesGroup")
    SHAREDLINESGROUP("SharedLinesGroup"),
    
    @SerializedName("PagingOnlyGroup")
    PAGINGONLYGROUP("PagingOnlyGroup"),
    
    @SerializedName("IvrMenu")
    IVRMENU("IvrMenu"),
    
    @SerializedName("ApplicationExtension")
    APPLICATIONEXTENSION("ApplicationExtension"),
    
    @SerializedName("ParkLocation")
    PARKLOCATION("ParkLocation");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public ExtensionInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Internal identifier of an extension
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Internal identifier of an extension")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExtensionInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of an extension
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of an extension")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ExtensionInfo contact(ContactInfo contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact detailed information
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "Contact detailed information")
  public ContactInfo getContact() {
    return contact;
  }

  public void setContact(ContactInfo contact) {
    this.contact = contact;
  }

  public ExtensionInfo departments(List<DepartmentInfo> departments) {
    this.departments = departments;
    return this;
  }

  public ExtensionInfo addDepartmentsItem(DepartmentInfo departmentsItem) {
    this.departments.add(departmentsItem);
    return this;
  }

   /**
   * Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId
   * @return departments
  **/
  @ApiModelProperty(example = "null", value = "Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId")
  public List<DepartmentInfo> getDepartments() {
    return departments;
  }

  public void setDepartments(List<DepartmentInfo> departments) {
    this.departments = departments;
  }

  public ExtensionInfo extensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
    return this;
  }

   /**
   * Number of department extension
   * @return extensionNumber
  **/
  @ApiModelProperty(example = "null", value = "Number of department extension")
  public String getExtensionNumber() {
    return extensionNumber;
  }

  public void setExtensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
  }

  public ExtensionInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Extension user name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Extension user name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensionInfo partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
   * @return partnerId
  **/
  @ApiModelProperty(example = "null", value = "For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public ExtensionInfo permissions(ExtensionPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Extension permissions, corresponding to the Service Web permissions 'Admin' and 'InternationalCalling'
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "Extension permissions, corresponding to the Service Web permissions 'Admin' and 'InternationalCalling'")
  public ExtensionPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ExtensionPermissions permissions) {
    this.permissions = permissions;
  }

  public ExtensionInfo profileImage(ProfileImageInfo profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Information on profile image
   * @return profileImage
  **/
  @ApiModelProperty(example = "null", value = "Information on profile image")
  public ProfileImageInfo getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(ProfileImageInfo profileImage) {
    this.profileImage = profileImage;
  }

  public ExtensionInfo references(List<ReferenceInfo> references) {
    this.references = references;
    return this;
  }

  public ExtensionInfo addReferencesItem(ReferenceInfo referencesItem) {
    this.references.add(referencesItem);
    return this;
  }

   /**
   * List of non-RC internal identifiers assigned to an extension
   * @return references
  **/
  @ApiModelProperty(example = "null", value = "List of non-RC internal identifiers assigned to an extension")
  public List<ReferenceInfo> getReferences() {
    return references;
  }

  public void setReferences(List<ReferenceInfo> references) {
    this.references = references;
  }

  public ExtensionInfo regionalSettings(RegionalSettings regionalSettings) {
    this.regionalSettings = regionalSettings;
    return this;
  }

   /**
   * Extension region data (timezone, home country, language)
   * @return regionalSettings
  **/
  @ApiModelProperty(example = "null", value = "Extension region data (timezone, home country, language)")
  public RegionalSettings getRegionalSettings() {
    return regionalSettings;
  }

  public void setRegionalSettings(RegionalSettings regionalSettings) {
    this.regionalSettings = regionalSettings;
  }

  public ExtensionInfo serviceFeatures(List<ExtensionServiceFeatureInfo> serviceFeatures) {
    this.serviceFeatures = serviceFeatures;
    return this;
  }

  public ExtensionInfo addServiceFeaturesItem(ExtensionServiceFeatureInfo serviceFeaturesItem) {
    this.serviceFeatures.add(serviceFeaturesItem);
    return this;
  }

   /**
   * Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features
   * @return serviceFeatures
  **/
  @ApiModelProperty(example = "null", value = "Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features")
  public List<ExtensionServiceFeatureInfo> getServiceFeatures() {
    return serviceFeatures;
  }

  public void setServiceFeatures(List<ExtensionServiceFeatureInfo> serviceFeatures) {
    this.serviceFeatures = serviceFeatures;
  }

  public ExtensionInfo setupWizardState(SetupWizardStateEnum setupWizardState) {
    this.setupWizardState = setupWizardState;
    return this;
  }

   /**
   * Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
   * @return setupWizardState
  **/
  @ApiModelProperty(example = "null", value = "Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'")
  public SetupWizardStateEnum getSetupWizardState() {
    return setupWizardState;
  }

  public void setSetupWizardState(SetupWizardStateEnum setupWizardState) {
    this.setupWizardState = setupWizardState;
  }

  public ExtensionInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Extension current state. If the status is 'Unassigned'. Returned for all extensions
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Extension current state. If the status is 'Unassigned'. Returned for all extensions")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ExtensionInfo statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

   /**
   * Status information (reason, comment). Returned for 'Disabled' status only
   * @return statusInfo
  **/
  @ApiModelProperty(example = "null", value = "Status information (reason, comment). Returned for 'Disabled' status only")
  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public ExtensionInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Extension type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Extension type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionInfo extensionInfo = (ExtensionInfo) o;
    return Objects.equals(this.id, extensionInfo.id) &&
        Objects.equals(this.uri, extensionInfo.uri) &&
        Objects.equals(this.contact, extensionInfo.contact) &&
        Objects.equals(this.departments, extensionInfo.departments) &&
        Objects.equals(this.extensionNumber, extensionInfo.extensionNumber) &&
        Objects.equals(this.name, extensionInfo.name) &&
        Objects.equals(this.partnerId, extensionInfo.partnerId) &&
        Objects.equals(this.permissions, extensionInfo.permissions) &&
        Objects.equals(this.profileImage, extensionInfo.profileImage) &&
        Objects.equals(this.references, extensionInfo.references) &&
        Objects.equals(this.regionalSettings, extensionInfo.regionalSettings) &&
        Objects.equals(this.serviceFeatures, extensionInfo.serviceFeatures) &&
        Objects.equals(this.setupWizardState, extensionInfo.setupWizardState) &&
        Objects.equals(this.status, extensionInfo.status) &&
        Objects.equals(this.statusInfo, extensionInfo.statusInfo) &&
        Objects.equals(this.type, extensionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, contact, departments, extensionNumber, name, partnerId, permissions, profileImage, references, regionalSettings, serviceFeatures, setupWizardState, status, statusInfo, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    departments: ").append(toIndentedString(departments)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    regionalSettings: ").append(toIndentedString(regionalSettings)).append("\n");
    sb.append("    serviceFeatures: ").append(toIndentedString(serviceFeatures)).append("\n");
    sb.append("    setupWizardState: ").append(toIndentedString(setupWizardState)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

