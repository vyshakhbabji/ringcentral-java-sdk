
# SubscriptionInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a subscription |  [optional]
**uri** | **String** | Canonical URI of a subscription |  [optional]
**eventFilters** | **List&lt;String&gt;** | Collection of URIs to API resources (message-store/presence/detailed presence) |  [optional]
**expirationTime** | [**DateTime**](DateTime.md) | Subscription expiration datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**expiresIn** | **Integer** | Subscription lifetime in seconds. The default value is 900 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Subscription status |  [optional]
**creationTime** | [**DateTime**](DateTime.md) | Subscription creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**deliveryMode** | [**DeliveryMode**](DeliveryMode.md) | Delivery mode data |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
SUSPENDED | &quot;Suspended&quot;



