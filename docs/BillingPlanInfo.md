
# BillingPlanInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a billing plan |  [optional]
**name** | **String** | Billing plan name |  [optional]
**durationUnit** | [**DurationUnitEnum**](#DurationUnitEnum) | Duration period |  [optional]
**duration** | **String** | Number of duration units |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Billing plan type |  [optional]


<a name="DurationUnitEnum"></a>
## Enum: DurationUnitEnum
Name | Value
---- | -----
MONTH | &quot;Month&quot;
DAY | &quot;Day&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INITIAL | &quot;Initial&quot;
REGULAR | &quot;Regular&quot;
SUSPENDED | &quot;Suspended&quot;
TRIAL | &quot;Trial&quot;
TRIALNOCC | &quot;TrialNoCC&quot;
FREE | &quot;Free&quot;



