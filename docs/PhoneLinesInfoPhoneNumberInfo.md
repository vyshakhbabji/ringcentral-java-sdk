
# PhoneLinesInfoPhoneNumberInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal identifier of a phone number |  [optional]
**country** | [**CountryInfo**](CountryInfo.md) | Brief information on a phone number country |  [optional]
**location** | **String** | Location (City, State). Filled for local US numbers |  [optional]
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Payment type. &#39;External&#39; is returned for forwarded numbers which are not terminated in the RingCentral phone system |  [optional]
**phoneNumber** | **String** | Phone number |  [optional]
**status** | **String** | Status of a phone number. If the value is &#39;Normal&#39;, the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Phone number type |  [optional]
**usageType** | [**UsageTypeEnum**](#UsageTypeEnum) | Usage type of the phone number |  [optional]


<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
EXTERNAL | &quot;External&quot;
TOLLFREE | &quot;TollFree&quot;
LOCAL | &quot;Local&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
VOICEFAX | &quot;VoiceFax&quot;
FAXONLY | &quot;FaxOnly&quot;
VOICEONLY | &quot;VoiceOnly&quot;


<a name="UsageTypeEnum"></a>
## Enum: UsageTypeEnum
Name | Value
---- | -----
MAINCOMPANYNUMBER | &quot;MainCompanyNumber&quot;
ADDITIONALCOMPANYNUMBER | &quot;AdditionalCompanyNumber&quot;
COMPANYNUMBER | &quot;CompanyNumber&quot;
DIRECTNUMBER | &quot;DirectNumber&quot;
COMPANYFAXNUMBER | &quot;CompanyFaxNumber&quot;
FORWARDEDNUMBER | &quot;ForwardedNumber&quot;



