package com.reactnative.googlecast.types;

import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.cast.MediaLoadRequestData;

public class RNGCMediaLoadRequest {
  public static MediaLoadRequestData fromJson(final ReadableMap json) {
    final MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();

    // if (json.hasKey("activeTrackIds")) {
    //   builder.setActiveTrackIds(json.getArray("activeTrackIds").toArrayList());
    // }

    if (json.hasKey("autoplay")) {
      builder.setAutoplay(json.getBoolean("autoplay"));
    }

    if (json.hasKey("credentials")) {
      builder.setCredentials(json.getString("credentials"));
    }

    if (json.hasKey("credentialsType")) {
      builder.setCredentialsType(json.getString("credentialsType"));
    }

//    if (!json.isNull(("customData"))) {
//      builder.setCustomData(RNGCJSONObject.fromJson(json.getMap("customData")));
//    }

    if (json.hasKey("mediaInfo")) {
      builder.setMediaInfo(RNGCMediaInfo.fromJson(json.getMap("mediaInfo")));
    }

    if (json.hasKey("playbackRate")) {
      builder.setPlaybackRate(json.getDouble("playbackRate"));
    }

    if (json.hasKey("queueData")) {
      builder.setQueueData(RNGCMediaQueueData.fromJson(json.getMap("queueData")));
    }

    if (json.hasKey("startTime")) {
      builder.setCurrentTime(json.getInt("startTime"));
    }

    return builder.build();
  }
}