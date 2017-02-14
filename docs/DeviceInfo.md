
# DeviceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a device |  [optional]
**uri** | **String** | Canonical URI of a device |  [optional]
**sku** | **String** | Device identification number (stock keeping unit) in the format TP-ID [-AT-AC], where TP is device type (HP for RC HardPhone, DV for all other devices including softphone); ID - device model ID; AT -addon type ID; AC - addon count (if any). For example &#39;HP-56-2-2&#39; |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Device type. The default value is &#39;HardPhone&#39; |  [optional]
**name** | **String** | Device name. Mandatory if ordering \&quot;SoftPhone\&quot; or \&quot;OtherPhone\&quot;. Optional for \&quot;HardPhone\&quot;. If not specified for HardPhone, then device \&quot;model\&quot; name is used as device \&quot;name\&quot; |  [optional]
**serial** | **String** | Serial number for HardPhone (is returned only when the phone is shipped and provisioned); endpoint_id for softphone and mobile applications |  [optional]
**computerName** | **String** | PC name for softphone |  [optional]
**model** | [**ModelInfo**](ModelInfo.md) | HardPhone model information |  [optional]
**extension** | [**DeviceInfoExtensionInfo**](DeviceInfoExtensionInfo.md) | This attribute can be omitted for unassigned devices |  [optional]
**emergencyServiceAddress** | [**EmergencyAddressInfo**](EmergencyAddressInfo.md) | Address for emergency cases. The same emergency address is assigned to all the numbers of one device |  [optional]
**phoneLines** | [**PhoneLinesInfo**](PhoneLinesInfo.md) | Phone lines information |  [optional]
**shipping** | [**ShippingInfo**](ShippingInfo.md) | Shipping information, according to which devices (in case of \&quot;HardPhone\&quot;) or e911 stickers (in case of \&quot;SoftPhone\&quot; and \&quot;OtherPhone\&quot;) will be delivered to the customer |  [optional]
**boxBillingId** | **Integer** | Box billing identifier of a device. Applicable only for HardPhones. It is an alternative way to identify the device to be ordered. Either \&quot;model\&quot; structure, or \&quot;boxBillingId\&quot; must be specified for HardPhone |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SOFTPHONE | &quot;SoftPhone&quot;
OTHERPHONE | &quot;OtherPhone&quot;
HARDPHONE | &quot;HardPhone&quot;



