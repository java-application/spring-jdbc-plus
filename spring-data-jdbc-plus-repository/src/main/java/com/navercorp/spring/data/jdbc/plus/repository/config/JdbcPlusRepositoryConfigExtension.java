/*
 * Spring JDBC Plus
 *
 * Copyright 2020-2021 NAVER Corp.
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

package com.navercorp.spring.data.jdbc.plus.repository.config;

import org.springframework.data.jdbc.repository.config.JdbcRepositoryConfigExtension;

import com.navercorp.spring.data.jdbc.plus.repository.support.JdbcPlusRepositoryFactoryBean;

/**
 * {@link org.springframework.data.repository.config.RepositoryConfigurationExtension} extending the repository
 * registration process by registering JDBC repositories.
 * <p>
 *
 * @author Myeonghyeon Lee
 *
 * {@link org.springframework.data.jdbc.repository.config.JdbcRepositoryConfigExtension}
 */
public class JdbcPlusRepositoryConfigExtension extends JdbcRepositoryConfigExtension {
	@Override
	public String getModuleName() {
		return "JDBC-PLUS-REPOSITORY";
	}

	@Override
	public String getRepositoryFactoryBeanClassName() {
		return JdbcPlusRepositoryFactoryBean.class.getName();
	}
}
