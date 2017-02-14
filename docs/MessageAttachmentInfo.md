
# MessageAttachmentInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal identifier of a message attachment |  [optional]
**uri** | **String** | Canonical URI of a message attachment |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of message attachment |  [optional]
**contentType** | **String** | MIME type for a given attachment, for instance &#39;audio/wav&#39; |  [optional]
**vmDuration** | **Integer** | Voicemail only Duration of the voicemail in seconds |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AUDIORECORDING | &quot;AudioRecording&quot;
AUDIOTRANSCRIPTION | &quot;AudioTranscription&quot;
TEXT | &quot;Text&quot;
SOURCEDOCUMENT | &quot;SourceDocument&quot;
RENDEREDDOCUMENT | &quot;RenderedDocument&quot;



