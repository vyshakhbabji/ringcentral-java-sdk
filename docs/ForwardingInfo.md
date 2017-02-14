
# ForwardingInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notifyMySoftPhones** | **Boolean** | Specifies if the user&#39;s softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers |  [optional]
**notifyAdminSoftPhones** | **Boolean** | Specifies if the administrator&#39;s softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is &#39;False&#39; |  [optional]
**softPhonesRingCount** | **Integer** | Number of rings before forwarding starts |  [optional]
**ringingMode** | [**RingingModeEnum**](#RingingModeEnum) | Specifies the order in which forwarding numbers ring. &#39;Sequentially&#39; means that forwarding numbers are ringing one at a time, in order of priority. &#39;Simultaneously&#39; means that forwarding numbers are ring all at the same time |  [optional]
**rules** | [**List&lt;RuleInfo&gt;**](RuleInfo.md) | Information on a call forwarding rule |  [optional]


<a name="RingingModeEnum"></a>
## Enum: RingingModeEnum
Name | Value
---- | -----
SEQUENTIALLY | &quot;Sequentially&quot;
SIMULTANEOUSLY | &quot;Simultaneously&quot;



