
# ShippingInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Shipping status of the order item. It is set to &#39;Initial&#39; when the order is submitted. Then it is changed to &#39;Accepted&#39; when a distributor starts processing the order. Finally it is changed to Shipped which means that distributor has shipped the device. |  [optional]
**carrier** | **String** | Shipping carrier name. Appears only if the device status is \&quot;Shipped\&quot; |  [optional]
**trackingNumber** | **String** | Carrier-specific tracking number. Appears only if the device status is \&quot;Shipped\&quot; |  [optional]
**method** | [**List&lt;ShippingMethod&gt;**](ShippingMethod.md) | Shipping method information |  [optional]
**address** | [**List&lt;ShippingAddress&gt;**](ShippingAddress.md) | Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case an order contains several devices, they can be delivered to different addresses |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIAL | &quot;Initial&quot;
ACCEPTED | &quot;Accepted&quot;
SHIPPED | &quot;Shipped&quot;



