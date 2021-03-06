/*
 * Copyright 2019 MovingBlocks
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
package org.terasology.wildAnimalsMadness.components;

import org.terasology.entitySystem.Component;
import org.terasology.math.geom.Vector3f;

public class FlockComponent implements Component {

    public float speed = 5f;
    public float searchRadius = 10f;
    public Vector3f flockCentre = Vector3f.zero();
    public Vector3f flockAvoid = Vector3f.zero();
}
