# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi();
        try {
            ServerInfo result = apiInstance.restapiGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#restapiGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://platform.devtest.ringcentral.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**restapiGet**](docs/DefaultApi.md#restapiGet) | **GET** /restapi | 
*DefaultApi* | [**restapiOauthAuthorizePost**](docs/DefaultApi.md#restapiOauthAuthorizePost) | **POST** /restapi/oauth/authorize | 
*DefaultApi* | [**restapiOauthRevokePost**](docs/DefaultApi.md#restapiOauthRevokePost) | **POST** /restapi/oauth/revoke | 
*DefaultApi* | [**restapiOauthTokenPost**](docs/DefaultApi.md#restapiOauthTokenPost) | **POST** /restapi/oauth/token | 
*DefaultApi* | [**restapiV10AccountAccountIdActiveCallsGet**](docs/DefaultApi.md#restapiV10AccountAccountIdActiveCallsGet) | **GET** /restapi/v1.0/account/{accountId}/active-calls | 
*DefaultApi* | [**restapiV10AccountAccountIdBusinessAddressGet**](docs/DefaultApi.md#restapiV10AccountAccountIdBusinessAddressGet) | **GET** /restapi/v1.0/account/{accountId}/business-address | 
*DefaultApi* | [**restapiV10AccountAccountIdBusinessAddressPut**](docs/DefaultApi.md#restapiV10AccountAccountIdBusinessAddressPut) | **PUT** /restapi/v1.0/account/{accountId}/business-address | 
*DefaultApi* | [**restapiV10AccountAccountIdCallLogCallLogIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdCallLogCallLogIdGet) | **GET** /restapi/v1.0/account/{accountId}/call-log/{callLogId} | 
*DefaultApi* | [**restapiV10AccountAccountIdCallLogGet**](docs/DefaultApi.md#restapiV10AccountAccountIdCallLogGet) | **GET** /restapi/v1.0/account/{accountId}/call-log | 
*DefaultApi* | [**restapiV10AccountAccountIdDepartmentDepartmentIdMembersGet**](docs/DefaultApi.md#restapiV10AccountAccountIdDepartmentDepartmentIdMembersGet) | **GET** /restapi/v1.0/account/{accountId}/department/{departmentId}/members | 
*DefaultApi* | [**restapiV10AccountAccountIdDeviceDeviceIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdDeviceDeviceIdGet) | **GET** /restapi/v1.0/account/{accountId}/device/{deviceId} | 
*DefaultApi* | [**restapiV10AccountAccountIdDeviceGet**](docs/DefaultApi.md#restapiV10AccountAccountIdDeviceGet) | **GET** /restapi/v1.0/account/{accountId}/device | 
*DefaultApi* | [**restapiV10AccountAccountIdDialingPlanGet**](docs/DefaultApi.md#restapiV10AccountAccountIdDialingPlanGet) | **GET** /restapi/v1.0/account/{accountId}/dialing-plan | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdActiveCallsGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdActiveCallsGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/active-calls | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactContactIdPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookContactPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookGroupGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookGroupGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/group | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookGroupGroupIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookGroupGroupIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/group/{groupId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAddressBookSyncGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAddressBookSyncGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book-sync | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAnsweringRuleAnsweringRuleIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAnsweringRuleAnsweringRuleIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/answering-rule/{answeringRuleId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAuthzProfileCheckGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAuthzProfileCheckGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile/check | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdAuthzProfileGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdAuthzProfileGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/blocked-number/{blockedNumberId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/blocked-number/{blockedNumberId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberBlockedNumberIdPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/blocked-number/{blockedNumberId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/blocked-number | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBlockedNumberPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/blocked-number | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdBusinessHoursGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdBusinessHoursGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/business-hours | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdCallLogCallLogIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdCallLogCallLogIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log/{callLogId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdCallLogDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdCallLogDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdCallLogGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdCallLogGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdCallLogSyncGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdCallLogSyncGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/call-log-sync | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdCompanyPagerPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdCompanyPagerPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/company-pager | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdConferencingGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdConferencingGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdConferencingPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdConferencingPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/conferencing | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdDeviceGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdDeviceGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/device | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdFaxPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdFaxPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/fax | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdForwardingNumberGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdForwardingNumberGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdForwardingNumberPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdForwardingNumberPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/forwarding-number | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdGrantGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdGrantGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/grant | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdEndPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdEndPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingMeetingIdPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/{meetingId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMeetingServiceInfoGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMeetingServiceInfoGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/meeting/service-info | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageStoreGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageStoreGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdContentAttachmentIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdContentAttachmentIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId}/content/{attachmentId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageStoreMessageIdPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-store/{messageId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdMessageSyncGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdMessageSyncGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/message-sync | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdPhoneNumberGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdPhoneNumberGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/phone-number | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdPresenceGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdPresenceGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/presence | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdProfileImageGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdProfileImageGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdProfileImagePost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdProfileImagePost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdProfileImagePut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdProfileImagePut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdProfileImageScaleSizeGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdProfileImageScaleSizeGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdPut**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdPut) | **PUT** /restapi/v1.0/account/{accountId}/extension/{extensionId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdRingoutPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdRingoutPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/ringout | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdRingoutRingoutIdDelete**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdRingoutRingoutIdDelete) | **DELETE** /restapi/v1.0/account/{accountId}/extension/{extensionId}/ringout/{ringoutId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdRingoutRingoutIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdRingoutRingoutIdGet) | **GET** /restapi/v1.0/account/{accountId}/extension/{extensionId}/ringout/{ringoutId} | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionExtensionIdSmsPost**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionExtensionIdSmsPost) | **POST** /restapi/v1.0/account/{accountId}/extension/{extensionId}/sms | 
*DefaultApi* | [**restapiV10AccountAccountIdExtensionGet**](docs/DefaultApi.md#restapiV10AccountAccountIdExtensionGet) | **GET** /restapi/v1.0/account/{accountId}/extension | 
*DefaultApi* | [**restapiV10AccountAccountIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdGet) | **GET** /restapi/v1.0/account/{accountId} | 
*DefaultApi* | [**restapiV10AccountAccountIdOrderOrderIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdOrderOrderIdGet) | **GET** /restapi/v1.0/account/{accountId}/order/{orderId} | 
*DefaultApi* | [**restapiV10AccountAccountIdOrderPost**](docs/DefaultApi.md#restapiV10AccountAccountIdOrderPost) | **POST** /restapi/v1.0/account/{accountId}/order | 
*DefaultApi* | [**restapiV10AccountAccountIdPhoneNumberGet**](docs/DefaultApi.md#restapiV10AccountAccountIdPhoneNumberGet) | **GET** /restapi/v1.0/account/{accountId}/phone-number | 
*DefaultApi* | [**restapiV10AccountAccountIdPhoneNumberPhoneNumberIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdPhoneNumberPhoneNumberIdGet) | **GET** /restapi/v1.0/account/{accountId}/phone-number/{phoneNumberId} | 
*DefaultApi* | [**restapiV10AccountAccountIdRecordingRecordingIdContentGet**](docs/DefaultApi.md#restapiV10AccountAccountIdRecordingRecordingIdContentGet) | **GET** /restapi/v1.0/account/{accountId}/recording/{recordingId}/content | 
*DefaultApi* | [**restapiV10AccountAccountIdRecordingRecordingIdGet**](docs/DefaultApi.md#restapiV10AccountAccountIdRecordingRecordingIdGet) | **GET** /restapi/v1.0/account/{accountId}/recording/{recordingId} | 
*DefaultApi* | [**restapiV10AccountAccountIdServiceInfoGet**](docs/DefaultApi.md#restapiV10AccountAccountIdServiceInfoGet) | **GET** /restapi/v1.0/account/{accountId}/service-info | 
*DefaultApi* | [**restapiV10ClientInfoCustomDataCustomDataKeyPut**](docs/DefaultApi.md#restapiV10ClientInfoCustomDataCustomDataKeyPut) | **PUT** /restapi/v1.0/client-info/custom-data/{customDataKey} | 
*DefaultApi* | [**restapiV10DictionaryCountryCountryIdGet**](docs/DefaultApi.md#restapiV10DictionaryCountryCountryIdGet) | **GET** /restapi/v1.0/dictionary/country/{countryId} | 
*DefaultApi* | [**restapiV10DictionaryCountryGet**](docs/DefaultApi.md#restapiV10DictionaryCountryGet) | **GET** /restapi/v1.0/dictionary/country | 
*DefaultApi* | [**restapiV10DictionaryLanguageGet**](docs/DefaultApi.md#restapiV10DictionaryLanguageGet) | **GET** /restapi/v1.0/dictionary/language | 
*DefaultApi* | [**restapiV10DictionaryLanguageLanguageIdGet**](docs/DefaultApi.md#restapiV10DictionaryLanguageLanguageIdGet) | **GET** /restapi/v1.0/dictionary/language/{languageId} | 
*DefaultApi* | [**restapiV10DictionaryLocationGet**](docs/DefaultApi.md#restapiV10DictionaryLocationGet) | **GET** /restapi/v1.0/dictionary/location | 
*DefaultApi* | [**restapiV10DictionaryStateGet**](docs/DefaultApi.md#restapiV10DictionaryStateGet) | **GET** /restapi/v1.0/dictionary/state | 
*DefaultApi* | [**restapiV10DictionaryStateStateIdGet**](docs/DefaultApi.md#restapiV10DictionaryStateStateIdGet) | **GET** /restapi/v1.0/dictionary/state/{stateId} | 
*DefaultApi* | [**restapiV10DictionaryTimezoneGet**](docs/DefaultApi.md#restapiV10DictionaryTimezoneGet) | **GET** /restapi/v1.0/dictionary/timezone | 
*DefaultApi* | [**restapiV10DictionaryTimezoneTimezoneIdGet**](docs/DefaultApi.md#restapiV10DictionaryTimezoneTimezoneIdGet) | **GET** /restapi/v1.0/dictionary/timezone/{timezoneId} | 
*DefaultApi* | [**restapiV10Get**](docs/DefaultApi.md#restapiV10Get) | **GET** /restapi/v1.0 | 
*DefaultApi* | [**restapiV10NumberParserParsePost**](docs/DefaultApi.md#restapiV10NumberParserParsePost) | **POST** /restapi/v1.0/number-parser/parse | 
*DefaultApi* | [**restapiV10NumberPoolLookupPost**](docs/DefaultApi.md#restapiV10NumberPoolLookupPost) | **POST** /restapi/v1.0/number-pool/lookup | 
*DefaultApi* | [**restapiV10NumberPoolReservePost**](docs/DefaultApi.md#restapiV10NumberPoolReservePost) | **POST** /restapi/v1.0/number-pool/reserve | 
*DefaultApi* | [**restapiV10SubscriptionPost**](docs/DefaultApi.md#restapiV10SubscriptionPost) | **POST** /restapi/v1.0/subscription | 
*DefaultApi* | [**restapiV10SubscriptionSubscriptionIdDelete**](docs/DefaultApi.md#restapiV10SubscriptionSubscriptionIdDelete) | **DELETE** /restapi/v1.0/subscription/{subscriptionId} | 
*DefaultApi* | [**restapiV10SubscriptionSubscriptionIdGet**](docs/DefaultApi.md#restapiV10SubscriptionSubscriptionIdGet) | **GET** /restapi/v1.0/subscription/{subscriptionId} | 
*DefaultApi* | [**restapiV10SubscriptionSubscriptionIdPut**](docs/DefaultApi.md#restapiV10SubscriptionSubscriptionIdPut) | **PUT** /restapi/v1.0/subscription/{subscriptionId} | 


## Documentation for Models

 - [AccountInfo](docs/AccountInfo.md)
 - [AccountLimits](docs/AccountLimits.md)
 - [AddonInfo](docs/AddonInfo.md)
 - [AnsweringRuleInfo](docs/AnsweringRuleInfo.md)
 - [AnsweringRuleInfoCalleeInfo](docs/AnsweringRuleInfoCalleeInfo.md)
 - [AnsweringRuleInfoCallerInfo](docs/AnsweringRuleInfoCallerInfo.md)
 - [AttachmentInfo](docs/AttachmentInfo.md)
 - [BillingPlanInfo](docs/BillingPlanInfo.md)
 - [BlockedNumberInfo](docs/BlockedNumberInfo.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body12](docs/Body12.md)
 - [Body13](docs/Body13.md)
 - [Body14](docs/Body14.md)
 - [Body15](docs/Body15.md)
 - [Body16](docs/Body16.md)
 - [Body17](docs/Body17.md)
 - [Body18](docs/Body18.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [BrandInfo](docs/BrandInfo.md)
 - [BusinessAddressInfo](docs/BusinessAddressInfo.md)
 - [BusinessHourScheduleInfo](docs/BusinessHourScheduleInfo.md)
 - [CallLogInfo](docs/CallLogInfo.md)
 - [CallLogRecord](docs/CallLogRecord.md)
 - [CallerInfo](docs/CallerInfo.md)
 - [ConferencingInfo](docs/ConferencingInfo.md)
 - [ConferencingInfoPhoneNumberInfo](docs/ConferencingInfoPhoneNumberInfo.md)
 - [ConferencingInfoPhoneNumberInfoCountryInfo](docs/ConferencingInfoPhoneNumberInfoCountryInfo.md)
 - [ConferencingRequestPhoneNumber](docs/ConferencingRequestPhoneNumber.md)
 - [ContactAddressInfo](docs/ContactAddressInfo.md)
 - [ContactInfo](docs/ContactInfo.md)
 - [CountryInfo](docs/CountryInfo.md)
 - [DeliveryMode](docs/DeliveryMode.md)
 - [DepartmentInfo](docs/DepartmentInfo.md)
 - [DepartmentResponseExtensionInfo](docs/DepartmentResponseExtensionInfo.md)
 - [DeviceInfo](docs/DeviceInfo.md)
 - [DeviceInfoExtensionInfo](docs/DeviceInfoExtensionInfo.md)
 - [DialInNumbers](docs/DialInNumbers.md)
 - [DialInNumbersCountryInfo](docs/DialInNumbersCountryInfo.md)
 - [DialingPlanCountryInfo](docs/DialingPlanCountryInfo.md)
 - [EmergencyAddressInfo](docs/EmergencyAddressInfo.md)
 - [ExtensionInfo](docs/ExtensionInfo.md)
 - [ExtensionInfoRequestContactInfo](docs/ExtensionInfoRequestContactInfo.md)
 - [ExtensionInfoRequestContactInfoRegionalSettings](docs/ExtensionInfoRequestContactInfoRegionalSettings.md)
 - [ExtensionInfoRequestContactInfoRegionalSettingsFormattingLocale](docs/ExtensionInfoRequestContactInfoRegionalSettingsFormattingLocale.md)
 - [ExtensionInfoRequestContactInfoRegionalSettingsGreetingLanguage](docs/ExtensionInfoRequestContactInfoRegionalSettingsGreetingLanguage.md)
 - [ExtensionInfoRequestContactInfoRegionalSettingsLanguage](docs/ExtensionInfoRequestContactInfoRegionalSettingsLanguage.md)
 - [ExtensionInfoRequestContactInfoRegionalSettingsTimezone](docs/ExtensionInfoRequestContactInfoRegionalSettingsTimezone.md)
 - [ExtensionInfoRequestPartnerId](docs/ExtensionInfoRequestPartnerId.md)
 - [ExtensionInfoRequestPasswordPIN](docs/ExtensionInfoRequestPasswordPIN.md)
 - [ExtensionInfoRequestProvision](docs/ExtensionInfoRequestProvision.md)
 - [ExtensionInfoRequestProvisionContactInfo](docs/ExtensionInfoRequestProvisionContactInfo.md)
 - [ExtensionInfoRequestStatusInfo](docs/ExtensionInfoRequestStatusInfo.md)
 - [ExtensionPermissions](docs/ExtensionPermissions.md)
 - [ExtensionServiceFeatureInfo](docs/ExtensionServiceFeatureInfo.md)
 - [ExternalUserInfo](docs/ExternalUserInfo.md)
 - [FormattingLocaleInfo](docs/FormattingLocaleInfo.md)
 - [ForwardingInfo](docs/ForwardingInfo.md)
 - [ForwardingNumberInfo](docs/ForwardingNumberInfo.md)
 - [FullCountryInfo](docs/FullCountryInfo.md)
 - [GrantInfo](docs/GrantInfo.md)
 - [GrantInfoExtensionInfo](docs/GrantInfoExtensionInfo.md)
 - [GreetingLanguageInfo](docs/GreetingLanguageInfo.md)
 - [GroupInfo](docs/GroupInfo.md)
 - [ImageUri](docs/ImageUri.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [InlineResponseDefault1](docs/InlineResponseDefault1.md)
 - [InlineResponseDefault10](docs/InlineResponseDefault10.md)
 - [InlineResponseDefault11](docs/InlineResponseDefault11.md)
 - [InlineResponseDefault12](docs/InlineResponseDefault12.md)
 - [InlineResponseDefault13](docs/InlineResponseDefault13.md)
 - [InlineResponseDefault14](docs/InlineResponseDefault14.md)
 - [InlineResponseDefault15](docs/InlineResponseDefault15.md)
 - [InlineResponseDefault16](docs/InlineResponseDefault16.md)
 - [InlineResponseDefault17](docs/InlineResponseDefault17.md)
 - [InlineResponseDefault18](docs/InlineResponseDefault18.md)
 - [InlineResponseDefault19](docs/InlineResponseDefault19.md)
 - [InlineResponseDefault2](docs/InlineResponseDefault2.md)
 - [InlineResponseDefault20](docs/InlineResponseDefault20.md)
 - [InlineResponseDefault21](docs/InlineResponseDefault21.md)
 - [InlineResponseDefault22](docs/InlineResponseDefault22.md)
 - [InlineResponseDefault23](docs/InlineResponseDefault23.md)
 - [InlineResponseDefault24](docs/InlineResponseDefault24.md)
 - [InlineResponseDefault25](docs/InlineResponseDefault25.md)
 - [InlineResponseDefault26](docs/InlineResponseDefault26.md)
 - [InlineResponseDefault27](docs/InlineResponseDefault27.md)
 - [InlineResponseDefault28](docs/InlineResponseDefault28.md)
 - [InlineResponseDefault29](docs/InlineResponseDefault29.md)
 - [InlineResponseDefault3](docs/InlineResponseDefault3.md)
 - [InlineResponseDefault30](docs/InlineResponseDefault30.md)
 - [InlineResponseDefault31](docs/InlineResponseDefault31.md)
 - [InlineResponseDefault32](docs/InlineResponseDefault32.md)
 - [InlineResponseDefault33](docs/InlineResponseDefault33.md)
 - [InlineResponseDefault34](docs/InlineResponseDefault34.md)
 - [InlineResponseDefault35](docs/InlineResponseDefault35.md)
 - [InlineResponseDefault36](docs/InlineResponseDefault36.md)
 - [InlineResponseDefault37](docs/InlineResponseDefault37.md)
 - [InlineResponseDefault4](docs/InlineResponseDefault4.md)
 - [InlineResponseDefault5](docs/InlineResponseDefault5.md)
 - [InlineResponseDefault6](docs/InlineResponseDefault6.md)
 - [InlineResponseDefault7](docs/InlineResponseDefault7.md)
 - [InlineResponseDefault8](docs/InlineResponseDefault8.md)
 - [InlineResponseDefault9](docs/InlineResponseDefault9.md)
 - [LanguageInfo](docs/LanguageInfo.md)
 - [LegInfo](docs/LegInfo.md)
 - [LegInfoExtensionInfo](docs/LegInfoExtensionInfo.md)
 - [LinksInfo](docs/LinksInfo.md)
 - [LocationInfo](docs/LocationInfo.md)
 - [LookUpPhoneNumberPhoneNumberInfo](docs/LookUpPhoneNumberPhoneNumberInfo.md)
 - [MeetingInfo](docs/MeetingInfo.md)
 - [MeetingScheduleInfo](docs/MeetingScheduleInfo.md)
 - [MeetingScheduleInfoTimezoneInfo](docs/MeetingScheduleInfoTimezoneInfo.md)
 - [MessageAttachmentInfo](docs/MessageAttachmentInfo.md)
 - [MessageInfo](docs/MessageInfo.md)
 - [MessageInfoCallerInfo](docs/MessageInfoCallerInfo.md)
 - [ModelInfo](docs/ModelInfo.md)
 - [NavigationInfo](docs/NavigationInfo.md)
 - [Page](docs/Page.md)
 - [PagingInfo](docs/PagingInfo.md)
 - [ParsePhoneNumberCountryInfo](docs/ParsePhoneNumberCountryInfo.md)
 - [ParsePhoneNumberPhoneNumberInfo](docs/ParsePhoneNumberPhoneNumberInfo.md)
 - [PermissionDetailsInfo](docs/PermissionDetailsInfo.md)
 - [PermissionInfo](docs/PermissionInfo.md)
 - [PersonalContactInfo](docs/PersonalContactInfo.md)
 - [PhoneLinesInfo](docs/PhoneLinesInfo.md)
 - [PhoneLinesInfoPhoneNumberInfo](docs/PhoneLinesInfoPhoneNumberInfo.md)
 - [PhoneNumberInfo](docs/PhoneNumberInfo.md)
 - [PhoneNumberInfoExtensionInfo](docs/PhoneNumberInfoExtensionInfo.md)
 - [PresenceInfo](docs/PresenceInfo.md)
 - [PresenceInfoExtensionInfo](docs/PresenceInfoExtensionInfo.md)
 - [ProfileImageInfo](docs/ProfileImageInfo.md)
 - [RangesInfo](docs/RangesInfo.md)
 - [RecipientInfo](docs/RecipientInfo.md)
 - [RecordingInfo](docs/RecordingInfo.md)
 - [ReferenceInfo](docs/ReferenceInfo.md)
 - [RegionalSettings](docs/RegionalSettings.md)
 - [ReservePhoneNumberRequestReserveRecord](docs/ReservePhoneNumberRequestReserveRecord.md)
 - [ReservePhoneNumberResponseReserveRecord](docs/ReservePhoneNumberResponseReserveRecord.md)
 - [RingOutInfo](docs/RingOutInfo.md)
 - [RingOutRequestCountryInfo](docs/RingOutRequestCountryInfo.md)
 - [RingOutRequestFrom](docs/RingOutRequestFrom.md)
 - [RingOutRequestTo](docs/RingOutRequestTo.md)
 - [RingOutStatusInfo](docs/RingOutStatusInfo.md)
 - [RuleInfo](docs/RuleInfo.md)
 - [RuleInfoForwardingNumberInfo](docs/RuleInfoForwardingNumberInfo.md)
 - [ScheduleInfo](docs/ScheduleInfo.md)
 - [ServerInfo](docs/ServerInfo.md)
 - [ServiceFeatureInfo](docs/ServiceFeatureInfo.md)
 - [ServiceInfo](docs/ServiceInfo.md)
 - [ServicePlanInfo](docs/ServicePlanInfo.md)
 - [ShippingAddress](docs/ShippingAddress.md)
 - [ShippingInfo](docs/ShippingInfo.md)
 - [ShippingMethod](docs/ShippingMethod.md)
 - [StateInfo](docs/StateInfo.md)
 - [StateInfoCountryInfo](docs/StateInfoCountryInfo.md)
 - [StatusInfo](docs/StatusInfo.md)
 - [SubscriptionInfo](docs/SubscriptionInfo.md)
 - [SubscriptionRequestDeliveryMode](docs/SubscriptionRequestDeliveryMode.md)
 - [SyncInfo](docs/SyncInfo.md)
 - [TargetServicePlanInfo](docs/TargetServicePlanInfo.md)
 - [TimeInterval](docs/TimeInterval.md)
 - [TimezoneInfo](docs/TimezoneInfo.md)
 - [UnconditionalForwardingInfo](docs/UnconditionalForwardingInfo.md)
 - [UserPermission](docs/UserPermission.md)
 - [UserPermissionInfo](docs/UserPermissionInfo.md)
 - [VersionInfo](docs/VersionInfo.md)
 - [VoicemailInfo](docs/VoicemailInfo.md)
 - [WeeklyScheduleInfo](docs/WeeklyScheduleInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://platform.devtest.ringcentral.com/restapi/oauth/authorize
- **Scopes**: 
  - default: default permissions


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



