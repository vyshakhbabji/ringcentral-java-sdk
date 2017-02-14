
# Body12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**CallerInfo**](CallerInfo.md) | Sender of an SMS message. The phoneNumber property must be filled to correspond to one of the account phone numbers which is allowed to send SMS |  [optional]
**to** | [**List&lt;CallerInfo&gt;**](CallerInfo.md) | Receiver of an SMS message. The phoneNumber property must be filled |  [optional]
**text** | **String** | Text of a message. Max length is 1000 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 500 symbols |  [optional]



