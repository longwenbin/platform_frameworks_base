/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.telephony.ims;

import android.os.Parcel;

/**
 * An event that indicates an RCS participant has joined an {@link RcsGroupThread}.
 * @hide - TODO(sahinc) make this public
 */
public class RcsThreadParticipantJoinedEvent extends RcsThreadEvent {
    public static final Creator<RcsThreadParticipantJoinedEvent> CREATOR =
            new Creator<RcsThreadParticipantJoinedEvent>() {
        @Override
        public RcsThreadParticipantJoinedEvent createFromParcel(Parcel in) {
            return new RcsThreadParticipantJoinedEvent(in);
        }

        @Override
        public RcsThreadParticipantJoinedEvent[] newArray(int size) {
            return new RcsThreadParticipantJoinedEvent[size];
        }
    };

    protected RcsThreadParticipantJoinedEvent(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
