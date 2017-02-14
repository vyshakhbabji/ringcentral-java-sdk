
# SubscriptionRequestDeliveryMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | Notifications transportation provider name. &#39;APNS&#39; (Apple Push Notifications Service) |  [optional]
**encryption** | **Boolean** | Optional parameter. Specifies if the message will be encrypted or not. If request contains any presence event filter the value by default is &#39;True&#39; (even if specified as &#39;false&#39;). If request contains only message event filters the value by default is &#39;False&#39; |  [optional]


<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
PUBNUB | &quot;PubNub&quot;
APNS | &quot;APNS&quot;
PUBNUB_APNS_VOIP | &quot;PubNub/APNS/VoIP&quot;



