/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package br.com.caelum.vraptor.serialization;

/**
 * Serializes given object, including and excluding fields.
 *
 * @author Lucas Cavalcanti
 * @author Guilherme Silveira
 * @since 3.0.2
 */
public interface Serializer {
	
	/**
	 * Exclude these properties in serialization.
	 * @param names
	 * @return
	 */
	Serializer exclude(String... names);

	/**
	 * Include all properties in serialization.
	 * @return
	 */
	Serializer excludeAll();

	/**
	 * Include these properties in serialization.
	 * @param names
	 * @return
	 * @throws IllegalArgumentException if {@code names} doesn't exists in object
	 */
	Serializer include(String... names);

	/**
	 * Include these properties in serialization, ignoring if names doesn´t exists in object
	 * @param names
	 * @return
	 */
	Serializer includeIfExist(String... names);

	/**
	 * Include all fields, recursively.
	 */
	Serializer recursive();
	
	/**
	 * End method for this fluent interface
	 */
	void serialize();
}
