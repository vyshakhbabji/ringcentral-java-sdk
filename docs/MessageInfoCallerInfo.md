
# MessageInfoCallerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extensionNumber** | **String** | Extension short number (usually 3 or 4 digits). This property is filled when parties communicate by means of short internal numbers, for example when calling to other extension or sending/receiving Company Pager message |  [optional]
**location** | **String** | Contains party location (city, state) if one can be determined from phoneNumber. This property is filled only when phoneNumber is not empty and server can calculate location information from it (for example, this information is unavailable for US toll-free numbers) |  [optional]
**messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum) | Status of a message. Returned for outbound fax messages only |  [optional]
**faxErrorCode** | [**FaxErrorCodeEnum**](#FaxErrorCodeEnum) | Fax only. Error code returned in case of fax sending failure. Returned if messageStatus value is &#39;SendingFailed&#39; |  [optional]
**name** | **String** | Symbolic name associated with a party. If the phone does not belong to the known extension, only the location is returned, the name is not determined then |  [optional]
**phoneNumber** | **String** | Phone number of a party. Usually it is a plain number including country and area code like 18661234567. But sometimes it could be returned from database with some formatting applied, for example (866)123-4567. This property is filled in all cases where parties communicate by means of global phone numbers, for example when calling to direct numbers or sending/receiving SMS |  [optional]


<a name="MessageStatusEnum"></a>
## Enum: MessageStatusEnum
Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
SENT | &quot;Sent&quot;
DELIVERED | &quot;Delivered&quot;
DELIVERYFAILED | &quot;DeliveryFailed&quot;
SENDINGFAILED | &quot;SendingFailed&quot;
RECEIVED | &quot;Received&quot;


<a name="FaxErrorCodeEnum"></a>
## Enum: FaxErrorCodeEnum
Name | Value
---- | -----
UNDEFINED | &quot;Undefined&quot;
NOFAXSENDPERMISSION | &quot;NoFaxSendPermission&quot;
NOINTERNATIONALPERMISSION | &quot;NoInternationalPermission&quot;
NOFAXMACHINE | &quot;NoFaxMachine&quot;
OUTGOINGCALLERROR | &quot;OutgoingCallError&quot;
RENDERINGFAILED | &quot;RenderingFailed&quot;
TOOMANYPAGES | &quot;TooManyPages&quot;
RETURNTODBQUEUE | &quot;ReturnToDBQueue&quot;
NOCALLTIME | &quot;NoCallTime&quot;
WRONGNUMBER | &quot;WrongNumber&quot;
PROHIBITEDNUMBER | &quot;ProhibitedNumber&quot;
INTERNALERROR | &quot;InternalError&quot;
FAXSENDINGPROHIBITED | &quot;FaxSendingProhibited&quot;
THEPHONEISBLACKLISTED | &quot;ThePhoneIsBlacklisted&quot;
USERNOTFOUND | &quot;UserNotFound&quot;
CONVERTERROR | &quot;ConvertError&quot;
DBGENERALERROR | &quot;DBGeneralError&quot;
SKYPEBILLINGFAILED | &quot;SkypeBillingFailed&quot;
ACCOUNTSUSPENDED | &quot;AccountSuspended&quot;
PROHIBITEDDESTINATION | &quot;ProhibitedDestination&quot;
INTERNATIONALDISABLED | &quot;InternationalDisabled&quot;



