
# AnsweringRuleInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | Canonical URI to the answering rule resource |  [optional]
**id** | **String** | Internal identifier of an asnwering rule |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of an answering rule |  [optional]
**name** | **String** | Name of an answering rule specified by user |  [optional]
**enabled** | **Boolean** | Specifies if an answering rule is active or inactive |  [optional]
**schedule** | [**ScheduleInfo**](ScheduleInfo.md) | Schedule when an answering rule should be applied |  [optional]
**calledNumbers** | [**List&lt;AnsweringRuleInfoCalleeInfo&gt;**](AnsweringRuleInfoCalleeInfo.md) | Answering rules are applied when calling to selected number(s) |  [optional]
**callers** | [**List&lt;AnsweringRuleInfoCallerInfo&gt;**](AnsweringRuleInfoCallerInfo.md) | Answering rules are applied when calls are received from specified caller(s) |  [optional]
**callHandlingAction** | [**CallHandlingActionEnum**](#CallHandlingActionEnum) | Specifies how incoming calls are forwarded |  [optional]
**forwarding** | [**ForwardingInfo**](ForwardingInfo.md) | Forwarding parameters. Returned if &#39;ForwardCalls&#39; is specified in &#39;callHandlingAction&#39;. These settings determine the forwarding numbers to which the call will be forwarded |  [optional]
**unconditionalForwarding** | [**UnconditionalForwardingInfo**](UnconditionalForwardingInfo.md) | Unconditional forwarding parameters. Returned if &#39;UnconditionalForwarding&#39; is specified in &#39;callHandlingAction&#39; |  [optional]
**voicemail** | [**VoicemailInfo**](VoicemailInfo.md) | Specifies whether to take a voicemail and who should do it |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUSINESSHOURS | &quot;BusinessHours&quot;
AFTERHOURS | &quot;AfterHours&quot;
CUSTOM | &quot;Custom&quot;


<a name="CallHandlingActionEnum"></a>
## Enum: CallHandlingActionEnum
Name | Value
---- | -----
FORWARDCALLS | &quot;ForwardCalls&quot;
TAKEMESSAGESONLY | &quot;TakeMessagesOnly&quot;
PLAYANNOUNCEMENTONLY | &quot;PlayAnnouncementOnly&quot;
UNCONDITIONALFORWARDING | &quot;UnconditionalForwarding&quot;



