/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * @microservice: core-metadata
 * @author: Jim White, Dell
 * @version: 1.0.0
 *******************************************************************************/

package org.edgexfoundry.dao;

import java.util.List;

import org.edgexfoundry.domain.meta.DeviceProfile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceProfileRepository extends MongoRepository<DeviceProfile, String> {

  DeviceProfile findByName(String name);

  Page<DeviceProfile> findByName(String name, Pageable pageable);

  List<DeviceProfile> findByManufacturer(String manufacturer);

  Page<DeviceProfile> findByManufacturer(String manufacturer, Pageable pageable);

  List<DeviceProfile> findByModel(String model);

  Page<DeviceProfile> findByModel(String model, Pageable pageable);

  List<DeviceProfile> findByManufacturerOrModel(String manufacturer, String model);

  Page<DeviceProfile> findByManufacturerOrModel(String manufacturer, String model,
      Pageable pageable);

  List<DeviceProfile> findByLabelsIn(String label);

  Page<DeviceProfile> findByLabels(String label, Pageable pageable);

}
