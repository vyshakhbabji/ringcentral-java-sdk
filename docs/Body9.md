
# Body9

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**topic** | **String** | Topic of a meeting |  [optional]
**meetingType** | [**MeetingTypeEnum**](#MeetingTypeEnum) | Type of a meeting. &#39;Instant&#39; - meeting that is instantly started as soon as the host creates it; &#39;Scheduled&#39; - common scheduled meeting; &#39;Recurring&#39; - a recurring meeting. If the specified meeting type is &#39;Scheduled&#39; then schedule property is mandatory for request |  [optional]
**password** | **String** | Password required to join a meeting. Max number of characters is 10 |  [optional]
**schedule** | [**MeetingScheduleInfo**](MeetingScheduleInfo.md) | Schedule of a meeting |  [optional]
**allowJoinBeforeHost** | **Boolean** | If &#39;True&#39; then the meeting can be joined and started by any participant (not host only). Supported for the meetings of &#39;Scheduled&#39; and &#39;Recurring&#39; type. |  [optional]
**startHostVideo** | **Boolean** | Enables starting video when host joins the meeting |  [optional]
**startParticipantsVideo** | **Boolean** | Enables starting video when participants join the meeting |  [optional]
**audioOptions** | **List&lt;String&gt;** | Meeting audio options. Possible values are &#39;Phone&#39;, &#39;ComputerAudio&#39; |  [optional]


<a name="MeetingTypeEnum"></a>
## Enum: MeetingTypeEnum
Name | Value
---- | -----
SCHEDULED | &quot;Scheduled&quot;
INSTANT | &quot;Instant&quot;
RECURRING | &quot;Recurring&quot;



