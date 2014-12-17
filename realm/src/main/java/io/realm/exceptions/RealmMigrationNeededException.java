/*
 * Copyright 2014 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.realm.exceptions;

public class RealmMigrationNeededException extends RuntimeException {

    private String realmAbsolutePath;

    public RealmMigrationNeededException(String detailMessage, String realmAbsolutePath) {
        super(detailMessage);
        this.realmAbsolutePath = realmAbsolutePath;
    }

    public RealmMigrationNeededException(String detailMessage, Throwable throwable, String realmAbsolutePath) {
        super(detailMessage, throwable);
        this.realmAbsolutePath = realmAbsolutePath;
    }

    /**
     * Returns the path to the Realm that needs a migration before it can be used. See
     * {@link io.realm.Realm#migrateRealmAtPath(String, io.realm.RealmMigration)}
     *
     * @return Absolute path for the Realm that needs to be migrated.
     */
    public String getRealmAbsolutePath() {
        return realmAbsolutePath;
    }
}
