
# Body11

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**RingOutRequestFrom**](RingOutRequestFrom.md) | Phone number of the caller. This number corresponds to the 1st leg of the RingOut call. This number can be one of user&#39;s configured forwarding numbers or arbitrary number |  [optional]
**to** | [**RingOutRequestTo**](RingOutRequestTo.md) | Phone number of the called party. This number corresponds to the 2nd leg of the RingOut call |  [optional]
**callerId** | [**RingOutRequestTo**](RingOutRequestTo.md) | The number which will be displayed to the called party |  [optional]
**playPrompt** | **Boolean** | The audio prompt that the calling party hears when the call is connected |  [optional]
**country** | [**RingOutRequestCountryInfo**](RingOutRequestCountryInfo.md) | Optional. Dialing plan country data. If not specified, then extension home country is applied by default |  [optional]



