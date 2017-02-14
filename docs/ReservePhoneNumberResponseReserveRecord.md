
# ReservePhoneNumberResponseReserveRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Phone number in E.164 format without a &#39;+&#39; |  [optional]
**formattedNumber** | **String** | Domestic format of a phone number |  [optional]
**reservedTill** | [**DateTime**](DateTime.md) | The datetime up to which the number is reserved in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. No value means that number is not reserved anymore |  [optional]
**reservationId** | **String** | Internal identifier of phone number reservation; encoded data including reservation type (by brand, by account, by session), particular brand/account/session data, and reservation date and time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Phone number status |  [optional]
**error** | [**ErrorEnum**](#ErrorEnum) | The error code in case of reservation/un-reservation failure |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENABLED | &quot;Enabled&quot;
PENDING | &quot;Pending&quot;
DISABLED | &quot;Disabled&quot;


<a name="ErrorEnum"></a>
## Enum: ErrorEnum
Name | Value
---- | -----
NUMBERISALREADYPROVISIONED | &quot;NumberIsAlreadyProvisioned&quot;
NUMBERRESERVED | &quot;NumberReserved&quot;
NUMBERNOTAVAILABLE | &quot;NumberNotAvailable&quot;



