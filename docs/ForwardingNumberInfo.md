
# ForwardingNumberInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a forwarding/call flip phone number |  [optional]
**uri** | **String** | Canonical URI of a forwarding/call flip phone number |  [optional]
**phoneNumber** | **String** | Forwarding/Call flip phone number |  [optional]
**label** | **String** | Forwarding/Call flip number title |  [optional]
**features** | [**FeaturesEnum**](#FeaturesEnum) | Type of option this phone number is used for. Multiple values are accepted |  [optional]
**flipNumber** | **Integer** | Number assigned to the call flip phone number, corresponds to the shortcut dial number |  [optional]


<a name="FeaturesEnum"></a>
## Enum: FeaturesEnum
Name | Value
---- | -----
CALLFLIP | &quot;CallFlip&quot;
CALLFORWARDING | &quot;CallForwarding&quot;



