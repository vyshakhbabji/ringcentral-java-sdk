
# AccountInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of an account |  [optional]
**uri** | **String** | Canonical URI of an account |  [optional]
**mainNumber** | **String** | Main phone number of the current account |  [optional]
**operator** | [**ExtensionInfo**](ExtensionInfo.md) | Operator&#39;s extension information. This extension will receive all calls and messages intended for the operator |  [optional]
**partnerId** | **String** | Additional account identifier, developed and applied by the client |  [optional]
**serviceInfo** | [**ServiceInfo**](ServiceInfo.md) | Account service information, including brand, service plan and billing plan |  [optional]
**setupWizardState** | [**SetupWizardStateEnum**](#SetupWizardStateEnum) | Specifies account configuration wizard state (web service setup). The default value is &#39;NotStarted&#39; |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the current account |  [optional]
**statusInfo** | [**StatusInfo**](StatusInfo.md) | Status information (reason, comment, lifetime). Returned for &#39;Disabled&#39; status only |  [optional]


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
CONFIRMED | &quot;Confirmed&quot;
DISABLED | &quot;Disabled&quot;



