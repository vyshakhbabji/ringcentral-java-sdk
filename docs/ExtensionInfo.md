
# ExtensionInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of an extension |  [optional]
**uri** | **String** | Canonical URI of an extension |  [optional]
**contact** | [**ContactInfo**](ContactInfo.md) | Contact detailed information |  [optional]
**departments** | [**List&lt;DepartmentInfo&gt;**](DepartmentInfo.md) | Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId |  [optional]
**extensionNumber** | **String** | Number of department extension |  [optional]
**name** | **String** | Extension user name |  [optional]
**partnerId** | **String** | For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid &#x3D; XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension |  [optional]
**permissions** | [**ExtensionPermissions**](ExtensionPermissions.md) | Extension permissions, corresponding to the Service Web permissions &#39;Admin&#39; and &#39;InternationalCalling&#39; |  [optional]
**profileImage** | [**ProfileImageInfo**](ProfileImageInfo.md) | Information on profile image |  [optional]
**references** | [**List&lt;ReferenceInfo&gt;**](ReferenceInfo.md) | List of non-RC internal identifiers assigned to an extension |  [optional]
**regionalSettings** | [**RegionalSettings**](RegionalSettings.md) | Extension region data (timezone, home country, language) |  [optional]
**serviceFeatures** | [**List&lt;ExtensionServiceFeatureInfo&gt;**](ExtensionServiceFeatureInfo.md) | Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features |  [optional]
**setupWizardState** | [**SetupWizardStateEnum**](#SetupWizardStateEnum) | Specifies extension configuration wizard state (web service setup). The default value is &#39;NotStarted&#39; |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Extension current state. If the status is &#39;Unassigned&#39;. Returned for all extensions |  [optional]
**statusInfo** | [**StatusInfo**](StatusInfo.md) | Status information (reason, comment). Returned for &#39;Disabled&#39; status only |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Extension type |  [optional]


<a name="SetupWizardStateEnum"></a>
## Enum: SetupWizardStateEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
INCOMPLETE | &quot;Incomplete&quot;
COMPLETED | &quot;Completed&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENABLED | &quot;Enabled&quot;
DISABLED | &quot;Disabled&quot;
NOTACTIVATED | &quot;NotActivated&quot;
UNASSIGNED | &quot;Unassigned&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USER | &quot;User&quot;
FAXUSER | &quot;FaxUser&quot;
VIRTUALUSER | &quot;VirtualUser&quot;
DIGITALUSER | &quot;DigitalUser&quot;
DEPARTMENT | &quot;Department&quot;
ANNOUNCEMENT | &quot;Announcement&quot;
VOICEMAIL | &quot;Voicemail&quot;
SHAREDLINESGROUP | &quot;SharedLinesGroup&quot;
PAGINGONLYGROUP | &quot;PagingOnlyGroup&quot;
IVRMENU | &quot;IvrMenu&quot;
APPLICATIONEXTENSION | &quot;ApplicationExtension&quot;
PARKLOCATION | &quot;ParkLocation&quot;



