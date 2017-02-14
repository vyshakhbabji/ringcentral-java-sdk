
# ExtensionInfoRequestContactInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contact** | [**ContactInfo**](ContactInfo.md) | Contact information |  [optional]
**regionalSettings** | [**ExtensionInfoRequestContactInfoRegionalSettings**](ExtensionInfoRequestContactInfoRegionalSettings.md) | Region data (timezone, home country, language) |  [optional]
**setupWizardState** | [**SetupWizardStateEnum**](#SetupWizardStateEnum) | Specifies extension configuration wizard state (web service setup). The default value is &#39;NotStarted&#39; |  [optional]
**department** | **String** | Extension user department |  [optional]


<a name="SetupWizardStateEnum"></a>
## Enum: SetupWizardStateEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
INCOMPLETE | &quot;Incomplete&quot;
COMPLETED | &quot;Completed&quot;



