
# MeetingInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | Canonical URI of a meeting resource |  [optional]
**id** | **String** | Internal identifier of a meeting as retrieved from Zoom |  [optional]
**topic** | **String** | Topic of a meeting |  [optional]
**meetingType** | [**MeetingTypeEnum**](#MeetingTypeEnum) | Type of a meeting |  [optional]
**password** | **String** | Password required to join a meeting |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of a meeting |  [optional]
**links** | [**LinksInfo**](LinksInfo.md) | Links to start/join the meeting |  [optional]
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


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
STARTED | &quot;Started&quot;



