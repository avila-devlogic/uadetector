/*******************************************************************************
 * Copyright 2013 André Rouél
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.uadetector.json.internal.data.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractMessageCollector<T> implements MessageCollector {

	private final List<String> warnings = new ArrayList<String>();

	@Override
	public void addWarning(final String warning) {
		warnings.add(warning);
	}

	@Override
	public List<String> getWarnings() {
		return Collections.unmodifiableList(warnings);
	}

}
