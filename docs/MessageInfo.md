
# MessageInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a message |  [optional]
**uri** | **String** | Canonical URI of a message |  [optional]
**attachments** | [**List&lt;MessageAttachmentInfo&gt;**](MessageAttachmentInfo.md) | The list of message attachments |  [optional]
**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | Message availability status. Message in &#39;Deleted&#39; state is still preserved with all its attachments and can be restored. &#39;Purged&#39; means that all attachments are already deleted and the message itself is about to be physically deleted shortly |  [optional]
**conversationId** | **Long** | SMS and Pager only. Identifier of the conversation the message belongs to |  [optional]
**creationTime** | [**DateTime**](DateTime.md) | Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**deliveryErrorCode** | **String** | SMS only. Delivery error code returned by gateway |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound |  [optional]
**faxPageCount** | **Integer** | Fax only. Page count in fax message |  [optional]
**faxResolution** | [**FaxResolutionEnum**](#FaxResolutionEnum) | Fax only. Resolution of fax message. (&#39;High&#39; for black and white image scanned at 200 dpi, &#39;Low&#39; for black and white image scanned at 100 dpi) |  [optional]
**from** | [**MessageInfoCallerInfo**](MessageInfoCallerInfo.md) | Sender information |  [optional]
**lastModifiedTime** | [**DateTime**](DateTime.md) | The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z |  [optional]
**messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum) | Message status. Different message types may have different allowed status values. |  [optional]
**pgToDepartment** | **Boolean** | Pager only True if at least one of the message recipients is Department extension |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Message priority |  [optional]
**readStatus** | [**ReadStatusEnum**](#ReadStatusEnum) | Message read status |  [optional]
**smsDeliveryTime** | [**DateTime**](DateTime.md) | SMS only. The datetime when outbound SMS was delivered to recipient&#39;s handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral |  [optional]
**smsSendingAttemptsCount** | **Integer** | SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable) |  [optional]
**subject** | **String** | Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment |  [optional]
**to** | [**List&lt;MessageInfoCallerInfo&gt;**](MessageInfoCallerInfo.md) | Recipient information |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Message type |  [optional]
**vmTranscriptionStatus** | [**VmTranscriptionStatusEnum**](#VmTranscriptionStatusEnum) | Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the &#39;NotAvailable&#39; value is returned |  [optional]


<a name="AvailabilityEnum"></a>
## Enum: AvailabilityEnum
Name | Value
---- | -----
ALIVE | &quot;Alive&quot;
DELETED | &quot;Deleted&quot;
PURGED | &quot;Purged&quot;


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INBOUND | &quot;Inbound&quot;
OUTBOUND | &quot;Outbound&quot;


<a name="FaxResolutionEnum"></a>
## Enum: FaxResolutionEnum
Name | Value
---- | -----
HIGH | &quot;High&quot;
LOW | &quot;Low&quot;


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


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
HIGH | &quot;High&quot;


<a name="ReadStatusEnum"></a>
## Enum: ReadStatusEnum
Name | Value
---- | -----
READ | &quot;Read&quot;
UNREAD | &quot;Unread&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FAX | &quot;Fax&quot;
SMS | &quot;SMS&quot;
VOICEMAIL | &quot;VoiceMail&quot;
PAGER | &quot;Pager&quot;
TEXT | &quot;Text&quot;


<a name="VmTranscriptionStatusEnum"></a>
## Enum: VmTranscriptionStatusEnum
Name | Value
---- | -----
NOTAVAILABLE | &quot;NotAvailable&quot;
INPROGRESS | &quot;InProgress&quot;
TIMEDOUT | &quot;TimedOut&quot;
COMPLETED | &quot;Completed&quot;
COMPLETEDPARTIALLY | &quot;CompletedPartially&quot;
FAILED | &quot;Failed&quot;



