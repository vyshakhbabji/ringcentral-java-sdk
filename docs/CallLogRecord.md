
# CallLogRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a cal log record |  [optional]
**uri** | **String** | Canonical URI of a call log record |  [optional]
**sessionId** | **String** | Internal identifier of a call session |  [optional]
**from** | [**CallerInfo**](CallerInfo.md) | Caller information |  [optional]
**to** | [**CallerInfo**](CallerInfo.md) | Callee information |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Call type |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Call direction |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Action description of the call operation |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Status description of the call operation |  [optional]
**startTime** | [**DateTime**](DateTime.md) | The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**duration** | **Integer** | Call duration in seconds |  [optional]
**recording** | [**RecordingInfo**](RecordingInfo.md) | Call recording data. Returned if the call is recorded, the withRecording parameter is set to &#39;True&#39; in this case |  [optional]
**lastModifiedTime** | [**DateTime**](DateTime.md) | For &#39;Detailed&#39; view only. The datetime when the call log record was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**transport** | [**TransportEnum**](#TransportEnum) | For &#39;Detailed&#39; view only. Call transport |  [optional]
**legs** | [**List&lt;LegInfo&gt;**](LegInfo.md) | For &#39;Detailed&#39; view only. Leg description |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
VOICE | &quot;Voice&quot;
FAX | &quot;Fax&quot;


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INBOUND | &quot;Inbound&quot;
OUTBOUND | &quot;Outbound&quot;


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
PHONE_CALL | &quot;Phone Call&quot;
PHONE_LOGIN | &quot;Phone Login&quot;
INCOMING_FAX | &quot;Incoming Fax&quot;
ACCEPT_CALL | &quot;Accept Call&quot;
FINDME | &quot;FindMe&quot;
FOLLOWME | &quot;FollowMe&quot;
OUTGOING_FAX | &quot;Outgoing Fax&quot;
CALL_RETURN | &quot;Call Return&quot;
CALLING_CARD | &quot;Calling Card&quot;
RING_DIRECTLY | &quot;Ring Directly&quot;
RINGOUT_WEB | &quot;RingOut Web&quot;
VOIP_CALL | &quot;VoIP Call&quot;
RINGOUT_PC | &quot;RingOut PC&quot;
RINGME | &quot;RingMe&quot;
TRANSFER | &quot;Transfer&quot;
_411_INFO | &quot;411 Info&quot;
EMERGENCY | &quot;Emergency&quot;
E911_UPDATE | &quot;E911 Update&quot;
SUPPORT | &quot;Support&quot;
RINGOUT_MOBILE | &quot;RingOut Mobile&quot;


<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
RESULTINPROGRESS | &quot;ResultInProgress&quot;
MISSED | &quot;Missed&quot;
CALL_ACCEPTED | &quot;Call accepted&quot;
VOICEMAIL | &quot;Voicemail&quot;
REJECTED | &quot;Rejected&quot;
REPLY | &quot;Reply&quot;
RECEIVED | &quot;Received&quot;
RECEIVE_ERROR | &quot;Receive Error&quot;
FAX_ON_DEMAND | &quot;Fax on Demand&quot;
PARTIAL_RECEIVE | &quot;Partial Receive&quot;
BLOCKED | &quot;Blocked&quot;
CALL_CONNECTED | &quot;Call connected&quot;
NO_ANSWER | &quot;No Answer&quot;
INTERNATIONAL_DISABLED | &quot;International Disabled&quot;
BUSY | &quot;Busy&quot;
SEND_ERROR | &quot;Send Error&quot;
SENT | &quot;Sent&quot;
NO_FAX_MACHINE | &quot;No fax machine&quot;
RESULTEMPTY | &quot;ResultEmpty&quot;
ACCOUNT | &quot;Account&quot;
SUSPENDED | &quot;Suspended&quot;
CALL_FAILED | &quot;Call Failed&quot;
CALL_FAILURE | &quot;Call Failure&quot;
INTERNAL_ERROR | &quot;Internal Error&quot;
IP_PHONE_OFFLINE | &quot;IP Phone offline&quot;
RESTRICTED_NUMBER | &quot;Restricted Number&quot;
WRONG_NUMBER | &quot;Wrong Number&quot;
STOPPED | &quot;Stopped&quot;
HANG_UP | &quot;Hang up&quot;
POOR_LINE_QUALITY | &quot;Poor Line Quality&quot;
PARTIALLY_SENT | &quot;Partially Sent&quot;
INTERNATIONAL_RESTRICTION | &quot;International Restriction&quot;
ABANDONED | &quot;Abandoned&quot;
DECLINED | &quot;Declined&quot;
FAX_RECEIPT_ERROR | &quot;Fax Receipt Error&quot;
FAX_SEND_ERROR | &quot;Fax Send Error&quot;


<a name="TransportEnum"></a>
## Enum: TransportEnum
Name | Value
---- | -----
PSTN | &quot;PSTN&quot;
VOIP | &quot;VoIP&quot;



