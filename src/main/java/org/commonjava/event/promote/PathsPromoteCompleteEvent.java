/**
 * Copyright (C) 2022 Red Hat, Inc. (https://github.com/Commonjava/indy-event-model)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.event.promote;

import java.util.Set;

public class PathsPromoteCompleteEvent {

    private String sourceStore;

    private String targetStore;

    private Set<String> completedPaths;

    public PathsPromoteCompleteEvent() {
    }

    public PathsPromoteCompleteEvent(String sourceStore, String targetStore, Set<String> completedPaths) {
        this.sourceStore = sourceStore;
        this.targetStore = targetStore;
        this.completedPaths = completedPaths;
    }

    public String getSourceStore() {
        return sourceStore;
    }

    public void setSourceStore(String sourceStore) {
        this.sourceStore = sourceStore;
    }

    public String getTargetStore() {
        return targetStore;
    }

    public void setTargetStore(String targetStore) {
        this.targetStore = targetStore;
    }

    public Set<String> getCompletedPaths() {
        return completedPaths;
    }

    public void setCompletedPaths(Set<String> completedPaths) {
        this.completedPaths = completedPaths;
    }

    @Override
    public String toString() {
        return "PathsPromoteCompleteEvent{" +
                "sourceStore='" + sourceStore + '\'' +
                ", targetStore='" + targetStore + '\'' +
                ", completedPaths=" + completedPaths +
                '}';
    }
}