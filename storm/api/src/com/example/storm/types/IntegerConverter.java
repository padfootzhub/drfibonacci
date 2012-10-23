/*******************************************************************************
 * Copyright 2012 Google, Inc.
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
package com.example.storm.types;

import com.example.storm.api.Converter;

@Converter(forTypes = { int.class, java.lang.Integer.class })
public class IntegerConverter extends TypeConverter<Integer, Integer> {

	public static final IntegerConverter GET = new IntegerConverter();
	
	@Override
	public SqlType getSqlType() {
		return SqlType.INTEGER;
	}

	@Override
	public BindType getBindType() {
		return BindType.INT;
	}

	@Override
	public Integer toSql(Integer javaValue) {
		return javaValue;
	}

	@Override
	public Integer fromSql(Integer sqlValue) {
		return sqlValue;
	}

	@Override
	public Integer fromString(String strValue) {
		return Integer.valueOf(strValue);
	}

}
